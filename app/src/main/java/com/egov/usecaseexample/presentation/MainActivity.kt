package com.egov.usecaseexample.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.egov.usecaseexample.databinding.ActivityMainBinding
import com.egov.usecaseexample.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private val vm by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.e("AAA","Activity created")

        // noto'g'ri yo'l
//        vm = MainViewModel()

        // to'g'ri yo'l
//        vm = ViewModelProvider(this).get(MainViewModel::class.java)

        // to'g'ri yo'l
//        vm = ViewModelProvider(this,MainViewModelFactory(this)).get(MainViewModel::class.java)

        vm.resultLive.observe(this, { text ->
            binding.dataTextView.text = text
        })

        binding.apply {

            sendButton.setOnClickListener {
                val name = dataEditText.text.toString()
                vm.save(name)
            }

            receiveButton.setOnClickListener {
                vm.load()
            }

        }
    }
}
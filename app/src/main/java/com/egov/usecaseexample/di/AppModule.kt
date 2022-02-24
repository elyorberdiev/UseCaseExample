package com.egov.usecaseexample.di

import com.egov.usecaseexample.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext.get
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel>{
        MainViewModel(
            getUserNameUseCase = get(),
            saveUserNameUseCase = get()
        )
    }

}
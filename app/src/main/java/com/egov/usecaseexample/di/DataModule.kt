package com.egov.usecaseexample.di

import com.egov.usecaseexample.data.repository.UserRepositoryImpl
import com.egov.usecaseexample.data.storage.UserStorage
import com.egov.usecaseexample.data.storage.sharedprefs.SharedPrefUserStorage
import com.egov.usecaseexample.domain.repository.UserRepository
import org.koin.dsl.module

val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }

}
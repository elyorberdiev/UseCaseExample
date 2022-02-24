package com.egov.usecaseexample.di

import com.egov.usecaseexample.domain.usecase.GetUserNameUseCase
import com.egov.usecaseexample.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }

}
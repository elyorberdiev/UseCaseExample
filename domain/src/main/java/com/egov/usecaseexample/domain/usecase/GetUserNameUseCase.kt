package com.egov.usecaseexample.domain.usecase

import com.egov.usecaseexample.domain.models.UserName
import com.egov.usecaseexample.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName{
        return userRepository.getName()


    }

}
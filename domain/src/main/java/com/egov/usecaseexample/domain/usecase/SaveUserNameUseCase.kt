package com.egov.usecaseexample.domain.usecase

import com.egov.usecaseexample.domain.models.SaveUserNameParam
import com.egov.usecaseexample.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository:UserRepository) {

    fun execute(param: SaveUserNameParam):Boolean{

        val oldUserName = userRepository.getName()
        if (oldUserName.firstName == param.name){
            return true
        }
        val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }

}
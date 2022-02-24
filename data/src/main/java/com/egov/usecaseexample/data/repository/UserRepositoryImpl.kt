package com.egov.usecaseexample.data.repository

import com.egov.usecaseexample.data.storage.models.User
import com.egov.usecaseexample.data.storage.UserStorage
import com.egov.usecaseexample.domain.models.SaveUserNameParam
import com.egov.usecaseexample.domain.models.UserName
import com.egov.usecaseexample.domain.repository.UserRepository



class UserRepositoryImpl(private val userStorage: UserStorage): UserRepository {



    override fun saveName(saveParam:SaveUserNameParam):Boolean{

        val user = mapToStorage(saveParam)
        val result = userStorage.save(user = user)
        return result
    }

    override fun getName():UserName{
        val user = userStorage.get()
        return mapToDomain(user)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam):User{
        return User(firstName = saveParam.name , lastName = "")
    }

    private fun mapToDomain(user: User):UserName{
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }

}
package com.egov.usecaseexample.domain.repository

import com.egov.usecaseexample.domain.models.SaveUserNameParam
import com.egov.usecaseexample.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam):Boolean

    fun getName(): UserName

}
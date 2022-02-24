package com.egov.usecaseexample.data.storage

import com.egov.usecaseexample.data.storage.models.User

interface UserStorage {

    fun save(user: User):Boolean

    fun get(): User

}
package com.vanthe.framework.mvvm.data.repository

import com.vanthe.framework.mvvm.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}
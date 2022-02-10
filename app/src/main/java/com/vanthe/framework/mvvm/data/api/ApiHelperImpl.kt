package com.vanthe.framework.mvvm.data.api

import com.vanthe.framework.mvvm.data.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}
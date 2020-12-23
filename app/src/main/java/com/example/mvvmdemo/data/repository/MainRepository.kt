package com.example.mvvmdemo.data.repository

import com.example.mvvmdemo.data.api.ApiHelper
import com.example.mvvmdemo.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}
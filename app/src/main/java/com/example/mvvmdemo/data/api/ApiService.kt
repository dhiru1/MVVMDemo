package com.example.mvvmdemo.data.api

import com.example.mvvmdemo.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}
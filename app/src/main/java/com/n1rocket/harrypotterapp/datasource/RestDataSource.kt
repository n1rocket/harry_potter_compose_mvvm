package com.n1rocket.harrypotterapp.datasource

import com.n1rocket.harrypotterapp.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface RestDataSource {
    @GET("/house/{house}")
    suspend fun getCharactersFromHouse(@Path("house") house: String): ApiResponse
}
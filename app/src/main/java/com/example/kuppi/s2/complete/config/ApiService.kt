package com.example.kuppi.s2.complete.config

import com.example.kuppi.s2.complete.models.Game
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://www.freetogame.com/api/"

interface ApiService {
    @GET("games")
    suspend fun getGames(): List<Game>

    companion object {
        var apiService: ApiService? = null

        fun getInstance(): ApiService {
            if (apiService == null){
                apiService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiService::class.java)
            }

            return apiService!!;
        }
    }
}
package com.mateuszchmielewski.forecastapp.api

import com.mateuszchmielewski.forecastapp.model.CurrentResponse
import com.mateuszchmielewski.forecastapp.util.ApiSettings.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApi {

    @GET("current")
    suspend fun getCurrentWeatherForCity(
        @Query("query") city: String,
        @Query("access_key") accessKey: String = API_KEY
    ): Response<CurrentResponse>
}
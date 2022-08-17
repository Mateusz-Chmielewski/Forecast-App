package com.mateuszchmielewski.forecastapp.data.api

import com.mateuszchmielewski.forecastapp.model.CurrentResponse
import com.mateuszchmielewski.forecastapp.util.ApiSettings.API_KEY
import com.mateuszchmielewski.forecastapp.util.ApiSettings.DEFAULT_UNITS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApi {

    @GET("weather")
    suspend fun getCurrentWeatherForCity(
        @Query("q") city: String,
        @Query("units") units: String = DEFAULT_UNITS,
        @Query("appid") accessKey: String = API_KEY
    ): Response<CurrentResponse>
}
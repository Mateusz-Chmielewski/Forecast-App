package com.mateuszchmielewski.forecastapp.data.api

import com.mateuszchmielewski.forecastapp.data.api.ApiSettings.API_KEY
import com.mateuszchmielewski.forecastapp.data.api.ApiSettings.DEFAULT_UNITS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApi {

    @GET("weather")
    suspend fun getCurrentWeatherForCity(
        @Query("q") city: String,
        @Query("units") units: String = DEFAULT_UNITS,
        @Query("appid") accessKey: String = API_KEY
    ): Response<CurrentWeatherDto>

    @GET("onecall")
    suspend fun getWeatherOneCall(
        @Query("lat") latitude: String,
        @Query("long") longitude: String,
        @Query("units") units: String = DEFAULT_UNITS,
        @Query("appid") accessKey: String = API_KEY
    ): Response<OneCallDto>
}
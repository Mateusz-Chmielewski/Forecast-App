package com.mateuszchmielewski.forecastapp.domain.weather

data class WeatherInfo(
    val cityName: String,
    val visibility: Int,
    val localTime: String
)

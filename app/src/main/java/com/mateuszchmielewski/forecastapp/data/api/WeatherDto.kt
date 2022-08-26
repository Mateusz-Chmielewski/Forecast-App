package com.mateuszchmielewski.forecastapp.data.api

data class WeatherDto(
    val dt: Int,
    val sunrise: Int,
    val sunset: Int,
    val humidity: Int,
    val pressure: Int,
    val temp: Double,
    val feels_like: Double,
    val weather: WeatherDescriptionDto
)
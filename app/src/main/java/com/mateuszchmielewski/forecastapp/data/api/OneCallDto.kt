package com.mateuszchmielewski.forecastapp.data.api

data class OneCallDto(
    val current: WeatherDto,
    val daily: List<WeatherDto>,
    val hourly: List<WeatherDto>,
    val timezone_offset: Int
)

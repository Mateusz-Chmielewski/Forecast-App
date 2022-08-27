package com.mateuszchmielewski.forecastapp.data.api

import com.google.gson.annotations.SerializedName

data class WeatherDescriptionDto(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)
package com.mateuszchmielewski.forecastapp.data.api

import com.google.gson.annotations.SerializedName

data class WeatherDescriptionDto(
    @SerializedName("id") val id: Int,
    @SerializedName("main") val main: String,
    @SerializedName("description") val description: String,
    @SerializedName("icon") val icon: String
)
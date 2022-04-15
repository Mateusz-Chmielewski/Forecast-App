package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName

data class CurrentResponse(
    @SerializedName("request")
    val request: Request,

    @SerializedName("location")
    val location: Location,

    @SerializedName("current")
    val currentWeather: CurrentWeather
)
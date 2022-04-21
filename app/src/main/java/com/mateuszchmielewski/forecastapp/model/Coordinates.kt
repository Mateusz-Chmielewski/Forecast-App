package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName

data class Coordinates(
    @SerializedName("lon") val longitude: String,
    @SerializedName("lat") val latitude: String
)
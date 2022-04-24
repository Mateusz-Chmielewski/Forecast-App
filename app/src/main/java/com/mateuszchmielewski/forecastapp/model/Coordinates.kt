package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Coordinates(
    @SerializedName("lon") val longitude: String,
    @SerializedName("lat") val latitude: String
) : Serializable
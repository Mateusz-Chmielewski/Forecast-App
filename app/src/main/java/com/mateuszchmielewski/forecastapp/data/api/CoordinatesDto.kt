package com.mateuszchmielewski.forecastapp.data.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CoordinatesDto(
    @SerializedName("lon") val longitude: String,
    @SerializedName("lat") val latitude: String
) : Serializable
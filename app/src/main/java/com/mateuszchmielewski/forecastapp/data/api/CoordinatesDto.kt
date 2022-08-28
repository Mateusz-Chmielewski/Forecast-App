package com.mateuszchmielewski.forecastapp.data.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CoordinatesDto(
    @SerializedName("lat") val latitude: String,
    @SerializedName("lon") val longitude: String,
) : Serializable
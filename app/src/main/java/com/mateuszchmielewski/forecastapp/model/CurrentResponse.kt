package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName

data class CurrentResponse(
    @SerializedName("name") val cityName: String,
    @SerializedName("coord") val coordinates: Coordinates,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("dt") val time: Long,
    @SerializedName("timezone") val timeZoneOffset: Int
)
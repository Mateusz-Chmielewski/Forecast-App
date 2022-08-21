package com.mateuszchmielewski.forecastapp.data.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.time.Instant
import java.time.format.DateTimeFormatter

data class CurrentWeatherDto(
    @SerializedName("name") val cityName: String,
    @SerializedName("coord") val coordinates: CoordinatesDto,
//    @SerializedName("visibility") val visibility: Int,
//    @SerializedName("dt") val time: Long,
//    @SerializedName("timezone") val timeZoneOffset: Int,
) : Serializable {
//    val localTime: String
//        get() = DateTimeFormatter.ISO_INSTANT
//            .format(Instant.ofEpochSecond(time + timeZoneOffset))
//            .toString()
}
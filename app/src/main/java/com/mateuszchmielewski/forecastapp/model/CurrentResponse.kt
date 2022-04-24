package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.*

data class CurrentResponse(
    @SerializedName("name") val cityName: String,
    @SerializedName("coord") val coordinates: Coordinates,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("dt") val time: Long,
    @SerializedName("timezone") val timeZoneOffset: Int
) : Serializable {
    val localTime: String
    get() = DateTimeFormatter.ISO_INSTANT
        .format(Instant.ofEpochSecond(time))
        .toString()
//        get() = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//            .timeZone = TimeZone(timeZoneOffset)
//            .format()
}
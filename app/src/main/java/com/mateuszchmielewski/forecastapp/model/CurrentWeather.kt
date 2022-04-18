package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName


data class CurrentWeather(
    @SerializedName("observation_time")
    val observationTime: String,

    @SerializedName("temperature")
    val temperature: Double,

    @SerializedName("weather_code")
    val weatherCode: Double,

    @SerializedName("weather_icons")
    val weatherIcons: List<String>,

    @SerializedName("weather_descriptions")
    val weatherDescriptions: List<String>,

    @SerializedName("wind_speed")
    val windSpeed: Double,

    @SerializedName("wind_degree")
    val windDegree: Double,

    @SerializedName("wind_dir")
    val windDir: String,

    @SerializedName("pressure")
    val pressure: Double,

    @SerializedName("precip")
    val precip: Double,

    @SerializedName("humidity")
    val humidity: Double,

    @SerializedName("cloudcover")
    val cloudCover: Double,

    @SerializedName("feelslike")
    val feelsLike: Double,

    @SerializedName("uv_index")
    val uvIndex: Double,

    @SerializedName("visibility")
    val visibility: Double,

    @SerializedName("is_day")
    val isDay: String
)
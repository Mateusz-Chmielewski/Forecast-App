package com.mateuszchmielewski.forecastapp.domain.weather

import com.google.gson.annotations.SerializedName

data class CityLocalization(
    val cityName: String,
    val longitude: String,
    val latitude: String
)

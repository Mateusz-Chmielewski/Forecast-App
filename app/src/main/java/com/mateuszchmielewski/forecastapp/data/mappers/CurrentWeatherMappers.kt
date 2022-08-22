package com.mateuszchmielewski.forecastapp.data.mappers

import com.mateuszchmielewski.forecastapp.data.api.CurrentWeatherDto
import com.mateuszchmielewski.forecastapp.domain.weather.CityLocalization

fun CurrentWeatherDto.toCityLocalization(): CityLocalization = CityLocalization(
    cityName = cityName,
    longitude = coordinates.longitude,
    latitude = coordinates.latitude
)
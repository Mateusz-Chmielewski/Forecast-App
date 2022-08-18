package com.mateuszchmielewski.forecastapp.data.repository

import android.content.res.Resources
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.data.api.ApiInstance
import com.mateuszchmielewski.forecastapp.data.api.CurrentWeatherDto
import com.mateuszchmielewski.forecastapp.domain.util.Resource
import kotlinx.coroutines.CancellationException
import java.io.IOException

class WeatherRepository {
    private val api = ApiInstance.api
    private val resources = Resources.getSystem()

    suspend fun getCurrentWeatherForCity(city: String): Resource<CurrentWeatherDto> {
        val response = try {
            api.getCurrentWeatherForCity(city)
        } catch (exception: IOException) {
            return Resource.Error(resources.getString(R.string.io_exception))
        } catch (exception: Exception) {
            if (exception is CancellationException) {
                throw CancellationException(exception.message)
            }

            return Resource.Error(resources.getString(R.string.http_exception))
        }

        if (response.isSuccessful && response.body() != null) {
            return Resource.Success(response.body()!!)
        }

        return  Resource.Error(resources.getString(R.string.null_data_exception))
    }
}
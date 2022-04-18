package com.mateuszchmielewski.forecastapp.api

import android.content.res.Resources
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.model.CurrentResponse
import com.mateuszchmielewski.forecastapp.model.ResponseType
import retrofit2.HttpException
import java.io.IOException

class WeatherRepository {
    private val api = ApiInstance.api
    private val resources = Resources.getSystem()

    suspend fun getCurrentWeatherForCity(city: String): ResponseType<CurrentResponse> {
        val response = try {
            api.getCurrentWeatherForCity(city)
        } catch (exception: IOException) {
            return ResponseType.Error(resources.getString(R.string.io_exception))
        } catch (exception: HttpException) {
            return ResponseType.Error(resources.getString(R.string.http_exception))
        }

        if (response.isSuccessful && response.body() != null) {
            return ResponseType.Success(response.body()!!)
        }

        return  ResponseType.Error(resources.getString(R.string.null_data_exception))
    }
}
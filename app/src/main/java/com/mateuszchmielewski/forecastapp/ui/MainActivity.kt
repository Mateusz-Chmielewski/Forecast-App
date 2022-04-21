package com.mateuszchmielewski.forecastapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.api.WeatherRepository
import com.mateuszchmielewski.forecastapp.model.ResponseType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private val weatherRepository = WeatherRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener { getWeatherBtnEvent() }
    }

    private fun getWeatherBtnEvent() = lifecycleScope.launch(Dispatchers.IO) {
        val city = etCity.text.toString()

        val response = weatherRepository.getCurrentWeatherForCity(city)

        when (response) {
            is ResponseType.Error -> Log.d(TAG, response.message)
            is ResponseType.Success -> Log.d(TAG, "We did it\n" + response.data.toString())
        }
    }
}
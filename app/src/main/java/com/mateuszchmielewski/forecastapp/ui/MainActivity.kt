package com.mateuszchmielewski.forecastapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.data.repository.WeatherRepository
import com.mateuszchmielewski.forecastapp.model.ResponseType
import com.mateuszchmielewski.forecastapp.util.makeToast
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
            is ResponseType.Error -> {
                Log.e(TAG, response.message)
                makeToast(response.message)
            }

            is ResponseType.Success -> {
                Intent(applicationContext, WeatherActivity::class.java).also {
                    it.putExtra("CITY", response.data)
                    startActivity(it)
                }
            }
        }
    }
}
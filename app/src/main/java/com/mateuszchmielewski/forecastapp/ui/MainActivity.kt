package com.mateuszchmielewski.forecastapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.api.ApiInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(Dispatchers.IO) {
            val response = ApiInstance.api.getCurrentWeatherForCity("Warszawa")

            if (response.isSuccessful && response.body() != null) {
                val body = response.body()!!
                Log.d(TAG, response.toString())

                withContext(Dispatchers.Main) {
                    etCity.setText(body.currentWeather.temperature.toString())
                }
            }
        }
    }
}
package com.mateuszchmielewski.forecastapp.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.databinding.ActivityWeatherBinding
import com.mateuszchmielewski.forecastapp.data.api.CurrentWeatherDto

class WeatherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeatherBinding
    private lateinit var city: CurrentWeatherDto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//
//        binding = ActivityWeatherBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        city = intent.getSerializableExtra("CITY") as CurrentWeatherDto
//
//
//        setSupportActionBar(findViewById(R.id.toolbar))
//        binding.toolbarLayout.title = city.cityName
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, city.localTime, Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }
}
package com.mateuszchmielewski.forecastapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.mateuszchmielewski.forecastapp.R
import com.mateuszchmielewski.forecastapp.databinding.ActivityWeatherBinding
import com.mateuszchmielewski.forecastapp.model.CurrentResponse

class WeatherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeatherBinding
    private lateinit var city: CurrentResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWeatherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        city = intent.getSerializableExtra("CITY") as CurrentResponse


        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = city.cityName
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, city.localTime, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}
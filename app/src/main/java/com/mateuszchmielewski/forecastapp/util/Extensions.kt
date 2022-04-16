package com.mateuszchmielewski.forecastapp.util

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private fun AppCompatActivity.makeToast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
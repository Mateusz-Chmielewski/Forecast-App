package com.mateuszchmielewski.forecastapp.model

sealed class ResponseType {
    data class Success<T>(val data: T) : ResponseType()
    data class Error(val message: String) : ResponseType()
}

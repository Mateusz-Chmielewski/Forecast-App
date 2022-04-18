package com.mateuszchmielewski.forecastapp.model

sealed class ResponseType<T> {
    data class Success<T>(val data: T) : ResponseType<T>()
    data class Error<T>(val message: String) : ResponseType<T>()
}

package com.mateuszchmielewski.forecastapp.model

import com.google.gson.annotations.SerializedName

data class CurrentResponse(
    @SerializedName("name") val name: String,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("dt") val time: Int,
)
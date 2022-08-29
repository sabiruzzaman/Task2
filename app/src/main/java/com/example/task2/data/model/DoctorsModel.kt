package com.example.task2.data.model


import com.google.gson.annotations.SerializedName

data class DoctorsModel(
    @SerializedName("doctors")
    val doctors: List<Doctor?>?,
    @SerializedName("msg")
    val msg: String?,
    @SerializedName("status")
    val status: String?
)
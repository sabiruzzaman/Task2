package com.example.task2.data.api

import com.example.task2.data.model.DoctorsModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiEndPoints {
    @GET("our-doctors")
    suspend fun getDoctorsList(): Response<DoctorsModel>
}
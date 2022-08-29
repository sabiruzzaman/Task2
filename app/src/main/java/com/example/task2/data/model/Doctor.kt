package com.example.task2.data.model


import com.google.gson.annotations.SerializedName

data class Doctor(
    @SerializedName("bmdc")
    val bmdc: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("department")
    val department: Department?,
    @SerializedName("doctor_department_id")
    val doctorDepartmentId: Int?,
    @SerializedName("experience")
    val experience: String?,
    @SerializedName("fee")
    val fee: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("specialist")
    val specialist: String?,
    @SerializedName("tenant_id")
    val tenantId: String?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("user")
    val user: User?,
    @SerializedName("user_id")
    val userId: Int?
)
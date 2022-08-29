package com.example.task2.data.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("address")
    val address: Any?,
    @SerializedName("age")
    val age: Int?,
    @SerializedName("agent_id")
    val agentId: Any?,
    @SerializedName("balance")
    val balance: String?,
    @SerializedName("blood_group")
    val bloodGroup: Any?,
    @SerializedName("commission")
    val commission: Any?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("department_id")
    val departmentId: String?,
    @SerializedName("designation")
    val designation: String?,
    @SerializedName("discount")
    val discount: String?,
    @SerializedName("disease")
    val disease: Any?,
    @SerializedName("disease_details")
    val diseaseDetails: Any?,
    @SerializedName("district")
    val district: String?,
    @SerializedName("division")
    val division: String?,
    @SerializedName("dob")
    val dob: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: Any?,
    @SerializedName("facebook_url")
    val facebookUrl: Any?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("gender")
    val gender: String?,
    @SerializedName("hospital_name")
    val hospitalName: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("instagram_url")
    val instagramUrl: Any?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("linkedIn_url")
    val linkedInUrl: Any?,
    @SerializedName("media")
    val media: List<Media?>?,
    @SerializedName("owner_id")
    val ownerId: String?,
    @SerializedName("owner_type")
    val ownerType: String?,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("qualification")
    val qualification: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("tenant_id")
    val tenantId: String?,
    @SerializedName("tenant_type")
    val tenantType: String?,
    @SerializedName("thana")
    val thana: String?,
    @SerializedName("twitter_url")
    val twitterUrl: Any?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("username")
    val username: Any?,
    @SerializedName("village")
    val village: Any?
)
package com.example.task2.data.model


import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName("collection_name")
    val collectionName: String?,
    @SerializedName("conversions_disk")
    val conversionsDisk: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("custom_properties")
    val customProperties: List<Any?>?,
    @SerializedName("disk")
    val disk: String?,
    @SerializedName("file_name")
    val fileName: String?,
    @SerializedName("generated_conversions")
    val generatedConversions: List<Any?>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("manipulations")
    val manipulations: List<Any?>?,
    @SerializedName("mime_type")
    val mimeType: String?,
    @SerializedName("model_id")
    val modelId: String?,
    @SerializedName("model_type")
    val modelType: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("order_column")
    val orderColumn: String?,
    @SerializedName("original_url")
    val originalUrl: String?,
    @SerializedName("preview_url")
    val previewUrl: String?,
    @SerializedName("responsive_images")
    val responsiveImages: List<Any?>?,
    @SerializedName("size")
    val size: String?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("uuid")
    val uuid: String?
)
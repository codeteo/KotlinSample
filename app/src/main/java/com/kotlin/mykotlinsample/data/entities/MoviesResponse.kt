package com.kotlin.mykotlinsample.data.entities

import com.google.gson.annotations.SerializedName


/**
 * Models the response of GET "/movies/popular" service
 */

data class MoviesResponse(
        @SerializedName("results") var results: Array<MoviesNestedItemResponse>? = null,
        @SerializedName("page") val page: Int = 0,
        @SerializedName("total_pages") var totalPages: Int = 0,
        @SerializedName("total_results") var totalResults: Int = 0
)
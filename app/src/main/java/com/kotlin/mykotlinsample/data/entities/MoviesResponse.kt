package com.kotlin.mykotlinsample.data.entities

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


/**
 * Models the response of GET "/movies/popular" service
 */

@SuppressLint("ParcelCreator")
@Parcelize
data class MoviesResponse (
        @SerializedName("results") var results: Array<MoviesNestedItemResponse>? = null,
        @SerializedName("page") val page: Int = 0,
        @SerializedName("total_pages") var totalPages: Int = 0,
        @SerializedName("total_results") var totalResults: Int = 0
) : Parcelable
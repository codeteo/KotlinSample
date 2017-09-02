package com.kotlin.mykotlinsample.data.entities

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


/**
 * Nested class of [MoviesResponse]
 */

@SuppressLint("ParcelCreator")
@Parcelize
data class MoviesNestedItemResponse (
        @SerializedName("vote_average") val voteAverage: String,
        @SerializedName("backdrop_path") val backdropPath: String,
        @SerializedName("adult") val adult: String,
        @SerializedName("id") val id: String,
        @SerializedName("title") val title: String,
        @SerializedName("overview") val overview: String,
        @SerializedName("original_language") val originalLanguage: String,
        @SerializedName("genre_ids") val genreIds: Array<String>,
        @SerializedName("release_date") val releaseData: String,
        @SerializedName("original_title") val originalTitle: String,
        @SerializedName("vote_count") val voteCount: String,
        @SerializedName("poster_path") val posterPath: String,
        @SerializedName("video") val video: String,
        @SerializedName("popularity") val popularity: String
) : Parcelable
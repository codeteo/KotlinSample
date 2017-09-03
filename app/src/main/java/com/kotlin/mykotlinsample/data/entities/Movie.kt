package com.kotlin.mykotlinsample.data.entities

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Data class contains main business model of the app.
 */

@SuppressLint("ParcelCreator")
@Parcelize
data class Movie (
        var id: String,
        var title: String,
        var overview: String,
        var voteAverage: String,
        var backdropPath: String,
        var adult: String,
        var originalLanguage: String,
        var genrgeIds: Array<String>,
        var releaseDate: String,
        var originalTitle: String,
        var voteCount: String,
        var posterPath: String,
        var video: String,
        var popularity: String
) : Parcelable
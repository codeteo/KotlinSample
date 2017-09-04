package com.kotlin.mykotlinsample.data.entities.mappers

import com.kotlin.mykotlinsample.data.entities.Movie
import com.kotlin.mykotlinsample.data.entities.MoviesNestedItemResponse

/**
 * Helper class to map objects from one type to another. In this case it
 * maps [MoviesNestedItemResponse] to [Movie]
 */

class MovieMapper(private val nestedItem: MoviesNestedItemResponse) {

    private lateinit var movie: Movie

    fun from() : Movie {

        movie = Movie(nestedItem.id, nestedItem.title, nestedItem.overview, nestedItem.voteAverage,
                    nestedItem.backdropPath, nestedItem.adult, nestedItem.originalLanguage, nestedItem.genreIds,
                    nestedItem.releaseData, nestedItem.originalTitle, nestedItem.voteCount, nestedItem.posterPath,
                    nestedItem.video, nestedItem.popularity)
        return movie
    }

}

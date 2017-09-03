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

        movie.id = nestedItem.id
        movie.title = nestedItem.title
        movie.adult = nestedItem.adult
        movie.backdropPath = nestedItem.backdropPath
        movie.genrgeIds = nestedItem.genreIds
        movie.originalLanguage = nestedItem.originalLanguage
        movie.originalTitle = nestedItem.originalTitle
        movie.overview = nestedItem.overview
        movie.popularity = nestedItem.popularity
        movie.posterPath = nestedItem.posterPath
        movie.releaseDate = nestedItem.releaseData
        movie.video = nestedItem.video
        movie.voteAverage = nestedItem.voteAverage
        movie.voteCount = nestedItem.voteCount

        return movie
    }

}

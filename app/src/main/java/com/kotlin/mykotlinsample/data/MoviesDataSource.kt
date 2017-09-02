package com.kotlin.mykotlinsample.data

import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable

/**
 * Main entry point for accessing movies.
 */

interface MoviesDataSource {

    fun loadMovies(): Observable<MoviesResponse>

    fun addMovie()

    fun addMoviesList()

}
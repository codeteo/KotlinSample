package com.kotlin.mykotlinsample.data

import com.kotlin.mykotlinsample.data.entities.Movie
import rx.Observable

/**
 * Main entry point for accessing movies.
 */

interface MoviesDataSource {

    fun loadMovies(): Observable<Array<Movie>?>

    fun addMovie()

    fun addMoviesList()

}
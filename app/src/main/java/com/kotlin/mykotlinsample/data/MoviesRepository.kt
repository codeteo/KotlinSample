package com.kotlin.mykotlinsample.data

import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable
import javax.inject.Inject

/**
 * Concrete implementation of [MoviesDataSource] to load data from
 * the data sources.
 */

class MoviesRepository
    @Inject constructor(
            @Local private val local: MoviesDataSource,
            @Remote private val  remote: MoviesDataSource) : MoviesDataSource {

    override fun loadMovies(): Observable<MoviesResponse> {
        return remote.loadMovies()
    }

    override fun addMovie() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMoviesList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
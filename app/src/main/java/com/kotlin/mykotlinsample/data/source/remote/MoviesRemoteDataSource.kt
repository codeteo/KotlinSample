package com.kotlin.mykotlinsample.data.source.remote

import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable

/**
 * Implementation of the remote data source.
 */

class MoviesRemoteDataSource : MoviesDataSource {

    override fun loadMovies(): Observable<MoviesResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMovie() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMoviesList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
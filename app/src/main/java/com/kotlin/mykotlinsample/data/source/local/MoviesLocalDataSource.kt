package com.kotlin.mykotlinsample.data.source.local

import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.entities.Movie
import rx.Observable

/**
 * Concrete implementation of a data source as a DB.
 */

class MoviesLocalDataSource : MoviesDataSource {

    override fun loadMovies(): Observable<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMovie() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMoviesList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
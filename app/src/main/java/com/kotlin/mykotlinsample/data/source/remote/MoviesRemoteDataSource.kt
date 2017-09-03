package com.kotlin.mykotlinsample.data.source.remote

import com.kotlin.mykotlinsample.Constants
import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.entities.Movie
import com.kotlin.mykotlinsample.data.entities.mappers.MovieMapper
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import rx.Observable
import javax.inject.Inject

/**
 * Implementation of the remote data source.
 */

class MoviesRemoteDataSource
    @Inject constructor(private val services: MoviesApiServices,
                        private val schedulerProvider: BaseSchedulerProvider) : MoviesDataSource {

    override fun loadMovies(): Observable<Array<Movie>?> {
        return services.getMostPopular(Constants.API_KEY)
                .map({ (results) ->
                    results
                })
                .map({ res ->

                    val movieArray: Array<Movie>? = null

                    for ((index, nestedItem) in res!!.withIndex()) {
                        movieArray?.set(index, MovieMapper(nestedItem).from())
                    }

                    return@map movieArray

                })
                .subscribeOn(schedulerProvider.io())
    }

    override fun addMovie() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMoviesList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
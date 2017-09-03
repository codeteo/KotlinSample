package com.kotlin.mykotlinsample.data.source.remote

import com.kotlin.mykotlinsample.Constants
import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import rx.Observable
import timber.log.Timber
import javax.inject.Inject

/**
 * Implementation of the remote data source.
 */

class MoviesRemoteDataSource
    @Inject constructor(private val services: MoviesApiServices,
                        private val schedulerProvider: BaseSchedulerProvider) : MoviesDataSource {

    override fun loadMovies(): Observable<MoviesResponse> {
        Timber.i("MESA STO REMOTE")
        return services.getMostPopular(Constants.API_KEY)
                .subscribeOn(schedulerProvider.io())
    }

    override fun addMovie() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addMoviesList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
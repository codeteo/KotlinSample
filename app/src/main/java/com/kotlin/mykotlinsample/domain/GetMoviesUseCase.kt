package com.kotlin.mykotlinsample.domain

import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable


/**
 * Use Case class for get movies feature.
 */

interface GetMoviesUseCase  {

    fun getMovies(): Observable<MoviesResponse>

}
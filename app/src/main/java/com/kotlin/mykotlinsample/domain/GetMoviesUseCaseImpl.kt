package com.kotlin.mykotlinsample.domain

import com.kotlin.mykotlinsample.data.MoviesRepository
import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable
import javax.inject.Inject

/**
 * Concrete implementation of [GetMoviesUseCase].
 */

class GetMoviesUseCaseImpl @Inject constructor(repository: MoviesRepository): GetMoviesUseCase {

    override fun getMovies(): Observable<MoviesResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
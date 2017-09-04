package com.kotlin.mykotlinsample.domain

import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.entities.Movie
import rx.Observable
import javax.inject.Inject

/**
 * Concrete implementation of [GetMoviesUseCase].
 */

class GetMoviesUseCaseImpl
    @Inject constructor(
            private val repository: MoviesDataSource): GetMoviesUseCase {

    override fun getMovies(): Observable<List<Movie>> {
        return repository.loadMovies()
    }
}
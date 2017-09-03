package com.kotlin.mykotlinsample.domain

import com.kotlin.mykotlinsample.data.MoviesRepository
import com.kotlin.mykotlinsample.data.entities.Movie
import rx.Observable
import javax.inject.Inject

/**
 * Concrete implementation of [GetMoviesUseCase].
 */

class GetMoviesUseCaseImpl
    @Inject constructor(
            private val repository: MoviesRepository): GetMoviesUseCase {

    override fun getMovies(): Observable<Array<Movie>?> {
        return repository.loadMovies()
    }
}
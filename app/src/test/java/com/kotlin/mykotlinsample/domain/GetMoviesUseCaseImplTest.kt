package com.kotlin.mykotlinsample.domain

import com.kotlin.mykotlinsample.data.MoviesDataSource
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

/**
 * Unit tests for [GetMoviesUseCaseImpl]
 */

class GetMoviesUseCaseImplTest {

    private var useCase: GetMoviesUseCase? = null

    @Mock
    private val repository: MoviesDataSource? = null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        useCase = GetMoviesUseCaseImpl(repository!!)
    }

    @Test
    fun getMovies() {
        useCase?.getMovies()

        verify(repository)?.loadMovies()
    }

}
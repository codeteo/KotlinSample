package com.kotlin.mykotlinsample.main.dagger.modules

import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.MoviesRepository
import com.kotlin.mykotlinsample.data.source.remote.MoviesRemoteDataSource
import com.kotlin.mykotlinsample.domain.GetMoviesUseCase
import com.kotlin.mykotlinsample.domain.GetMoviesUseCaseImpl
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Dagger Module class to provide dependencies for [GetMoviesUseCase]
 */

@Module
class GetMoviesUseCaseModule {

    @ActivityScope
    @Provides
    fun providesMoviesRepository(local:MoviesDataSource, remote: MoviesRemoteDataSource): MoviesDataSource {
        return MoviesRepository(local, remote)
    }

    @ActivityScope
    @Provides
    fun providesGetMoviesUseCase(repository: MoviesRepository): GetMoviesUseCase {
        return GetMoviesUseCaseImpl(repository)
    }

}
package com.kotlin.mykotlinsample.main.dagger.modules

import com.kotlin.mykotlinsample.data.Local
import com.kotlin.mykotlinsample.data.MoviesDataSource
import com.kotlin.mykotlinsample.data.Remote
import com.kotlin.mykotlinsample.data.source.local.MoviesLocalDataSource
import com.kotlin.mykotlinsample.data.source.remote.MoviesApiServices
import com.kotlin.mykotlinsample.data.source.remote.MoviesRemoteDataSource
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Dagger Module class to provide dependencies for [MoviesRepository].
 */

@Module
class MoviesRepositoryModule {

    @Local
    @ActivityScope
    @Provides
    fun providesMoviesLocalDataSource(): MoviesDataSource {
        return MoviesLocalDataSource()
    }

    @Remote
    @ActivityScope
    @Provides
    fun providesMoviesRemoteDataSource(services: MoviesApiServices): MoviesDataSource {
        return MoviesRemoteDataSource(services)
    }

}
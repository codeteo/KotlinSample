package com.kotlin.mykotlinsample.main.dagger.modules

import com.kotlin.mykotlinsample.data.source.remote.MoviesApiServices
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Dagger Module provides [MoviesService].
 */

@Module
class MoviesServiceModule {

    @ActivityScope
    @Provides
    fun providesMoviesService(retrofit: Retrofit): MoviesApiServices {
        return retrofit.create(MoviesApiServices::class.java)
    }
}
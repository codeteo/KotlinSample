package com.kotlin.mykotlinsample.dagger.modules

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.kotlin.mykotlinsample.Constants
import com.kotlin.mykotlinsample.utils.BaseUrlInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import javax.inject.Singleton





/**
 * Module class creates dependencies with Application(Singleton) scope.
 */

@Module
class ApplicationModule(private val application: Application) {

    private val PRODUCTION_API_BASE_URL = HttpUrl.parse(Constants.BASE_URL)

    @Provides
    @Singleton
    fun providesApplication(): Application {
        return application
    }

    @Provides
    @Singleton
    fun providesSharedPreferences(application: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    @Singleton
    fun providesBaseUrl(): HttpUrl {
        return PRODUCTION_API_BASE_URL
    }

    @Provides
    @Singleton
    fun providesBaseUrlInterceptor(): BaseUrlInterceptor {
        return BaseUrlInterceptor(Constants.BASE_URL)
    }

}


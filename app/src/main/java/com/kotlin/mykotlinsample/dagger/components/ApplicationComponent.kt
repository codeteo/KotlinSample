package com.kotlin.mykotlinsample.dagger.components

import android.app.Application
import com.kotlin.mykotlinsample.dagger.modules.ApplicationModule
import com.kotlin.mykotlinsample.utils.BaseUrlInterceptor
import dagger.Component
import okhttp3.HttpUrl
import javax.inject.Singleton

/**
 * Dagger Component for the App with [Singleton] scope
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: Application)

    // Provides

    fun application(): Application

    // exposes Interceptor to use it for testing with mockWebServer
    fun baseUrlInterceptor(): BaseUrlInterceptor

    fun baseUrl(): HttpUrl
}
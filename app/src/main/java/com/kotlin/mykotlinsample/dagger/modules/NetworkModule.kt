package com.kotlin.mykotlinsample.dagger.modules

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kotlin.mykotlinsample.utils.BaseUrlInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


/**
 * Dagger Module with network dependencies
 */

@Module
class NetworkModule() {

    val CONNECTION_TIMEOUT = 15

    @Provides
    @Singleton
    fun provisGson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    @Singleton
    fun providesOkHttpClient(baseUrlInterceptor: BaseUrlInterceptor): OkHttpClient {

        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
        client.retryOnConnectionFailure(true)
        client.addInterceptor(interceptor)
        client.addInterceptor(baseUrlInterceptor)
        client.connectTimeout(CONNECTION_TIMEOUT.toLong(), TimeUnit.SECONDS)

        return client.build()
    }

}

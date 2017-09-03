package com.kotlin.mykotlinsample.dagger.modules

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kotlin.mykotlinsample.utils.BaseUrlInterceptor
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import com.kotlin.mykotlinsample.utils.schedulers.SchedulerProvider
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit






/**
 * Dagger Module with network dependencies
 */

@Module
class NetworkModule {

    val CONNECTION_TIMEOUT = 15

    @Provides
    fun providesGson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
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

    @Provides
    fun providesRetrofit(baseUrl: HttpUrl, client: OkHttpClient, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .client(client)
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
    }

    @Provides
    fun baseSchedulerProvider(): BaseSchedulerProvider {
        return SchedulerProvider
    }

}

package com.kotlin.mykotlinsample.dagger.components

import com.kotlin.mykotlinsample.dagger.NetworkScope
import com.kotlin.mykotlinsample.dagger.modules.NetworkModule
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@NetworkScope
@Component(dependencies = arrayOf(ApplicationComponent::class),
            modules = arrayOf(NetworkModule::class))
interface NetworkComponent {

    fun okHttpClient(): OkHttpClient

    fun retrofit(): Retrofit
}
package com.kotlin.mykotlinsample

import android.app.Application
import com.kotlin.mykotlinsample.dagger.components.ApplicationComponent
import com.kotlin.mykotlinsample.dagger.components.DaggerApplicationComponent
import com.kotlin.mykotlinsample.dagger.components.DaggerNetworkComponent
import com.kotlin.mykotlinsample.dagger.components.NetworkComponent
import com.kotlin.mykotlinsample.dagger.modules.ApplicationModule
import com.kotlin.mykotlinsample.dagger.modules.NetworkModule
import timber.log.Timber
import timber.log.Timber.DebugTree



/**
 * Main entry of the app
 */

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent
    lateinit var networkComponent: NetworkComponent

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()

        networkComponent = DaggerNetworkComponent
                .builder()
                .networkModule(NetworkModule())
                .applicationComponent(applicationComponent)
                .build()
    }

}
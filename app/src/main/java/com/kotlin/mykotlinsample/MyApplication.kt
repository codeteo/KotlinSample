package com.kotlin.mykotlinsample

import android.app.Application
import com.kotlin.mykotlinsample.dagger.ApplicationComponent
import com.kotlin.mykotlinsample.dagger.ApplicationModule
import com.kotlin.mykotlinsample.dagger.DaggerApplicationComponent

/**
 * Main entry of the app
 */

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()

    }

}
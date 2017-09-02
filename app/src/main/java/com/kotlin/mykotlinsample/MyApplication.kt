package com.kotlin.mykotlinsample

import android.app.Application
import com.kotlin.mykotlinsample.dagger.components.ApplicationComponent
import com.kotlin.mykotlinsample.dagger.components.DaggerApplicationComponent
import com.kotlin.mykotlinsample.dagger.modules.ApplicationModule

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
package com.kotlin.mykotlinsample.dagger.components

import android.app.Application
import com.kotlin.mykotlinsample.dagger.modules.ApplicationModule
import com.kotlin.mykotlinsample.main.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Dagger Component for the App with [Singleton] scope
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun application(): Application

}
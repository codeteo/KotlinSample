package com.kotlin.mykotlinsample.dagger

import com.kotlin.mykotlinsample.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Dagger Component for the App with [Singleton] scope
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(activity: MainActivity)

}
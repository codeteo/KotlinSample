package com.kotlin.mykotlinsample.main.dagger.components

import com.kotlin.mykotlinsample.dagger.components.ApplicationComponent
import com.kotlin.mykotlinsample.main.MainActivity
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import com.kotlin.mykotlinsample.main.dagger.modules.MainModule
import dagger.Component

/**
 * It's a Dagger Component for [MainActivity].
 */

@ActivityScope
@Component(modules = arrayOf(MainModule::class),
            dependencies = arrayOf(ApplicationComponent::class))
interface MainComponent {

    fun inject(activity: MainActivity)

}
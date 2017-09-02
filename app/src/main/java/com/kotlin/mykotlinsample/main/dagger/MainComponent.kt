package com.kotlin.mykotlinsample.main.dagger

import com.kotlin.mykotlinsample.main.MainActivity
import dagger.Component

/**
 * It's a Dagger Component for [MainActivity].
 */
@ActivityScope
@Component(modules = arrayOf(MainModule::class))
interface MainComponent {

    fun inject(activity: MainActivity)

}
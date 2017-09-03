package com.kotlin.mykotlinsample.main.dagger.components

import com.kotlin.mykotlinsample.dagger.components.NetworkComponent
import com.kotlin.mykotlinsample.main.MainActivity
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import com.kotlin.mykotlinsample.main.dagger.modules.GetMoviesUseCaseModule
import com.kotlin.mykotlinsample.main.dagger.modules.MainModule
import com.kotlin.mykotlinsample.main.dagger.modules.MoviesRepositoryModule
import com.kotlin.mykotlinsample.main.dagger.modules.MoviesServiceModule
import dagger.Component

/**
 * It's a Dagger Component for [MainActivity].
 */

@ActivityScope
@Component(modules = arrayOf(MainModule::class, GetMoviesUseCaseModule::class,
                MoviesRepositoryModule::class, MoviesServiceModule::class),
            dependencies = arrayOf(NetworkComponent::class))
interface MainComponent {

    fun inject(activity: MainActivity)

}
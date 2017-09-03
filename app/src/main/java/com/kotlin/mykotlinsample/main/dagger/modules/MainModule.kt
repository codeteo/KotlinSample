package com.kotlin.mykotlinsample.main.dagger.modules

import com.kotlin.mykotlinsample.domain.GetMoviesUseCase
import com.kotlin.mykotlinsample.main.MainMVP
import com.kotlin.mykotlinsample.main.MainPresenter
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import dagger.Module
import dagger.Provides



/**
 * Dagger Module for [MainActivity]
 */

@Module
class MainModule(private val view: MainMVP.View) {

    @Provides
    @ActivityScope
    fun providesMainPresenter(getMoviesUseCase: GetMoviesUseCase, schedulerProvider: BaseSchedulerProvider): MainMVP.Presenter {
        return MainPresenter(view, getMoviesUseCase, schedulerProvider)
    }

}
package com.kotlin.mykotlinsample.main.dagger.modules

import com.kotlin.mykotlinsample.main.MainMVP
import com.kotlin.mykotlinsample.main.MainPresenter
import com.kotlin.mykotlinsample.main.dagger.ActivityScope
import dagger.Module
import dagger.Provides



/**
 * Dagger Module for [MainActivity]
 */

@Module
class MainModule(private val view: MainMVP.View) {

    @Provides
    @ActivityScope
    fun providesMainPresenter(): MainMVP.Presenter {
        return MainPresenter(view)
    }

}
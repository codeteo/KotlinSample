package com.kotlin.mykotlinsample.main.dagger

import com.kotlin.mykotlinsample.main.MainMVP
import com.kotlin.mykotlinsample.main.MainPresenter
import dagger.Module
import dagger.Provides



/**
 * Dagger Module for []
 */
@Module
class MainModule {

    private val view: MainMVP.View? = null

    @ActivityScope
    @Provides
    fun providersMainPresenter(): MainMVP.Presenter {
        return MainPresenter()
    }

}
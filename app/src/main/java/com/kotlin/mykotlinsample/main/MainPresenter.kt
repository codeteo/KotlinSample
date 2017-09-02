package com.kotlin.mykotlinsample.main

import android.util.Log
import javax.inject.Inject

/**
 * Presenter class for [MainActivity]
 */

class MainPresenter @Inject constructor(private val view: MainMVP.View) : MainMVP.Presenter {

    override fun doSomething() {
        Log.i("something", "here")
        view.showToast()
    }

}
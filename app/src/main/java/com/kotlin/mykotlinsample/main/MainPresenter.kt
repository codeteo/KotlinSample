package com.kotlin.mykotlinsample.main

import com.kotlin.mykotlinsample.data.MoviesRepository
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import timber.log.Timber
import javax.inject.Inject

/**
 * Presenter class for [MainActivity]
 */

class MainPresenter
@Inject constructor(
        private val view: MainMVP.View,
        private val repository: MoviesRepository,
        private val schedulerProvider: BaseSchedulerProvider) : MainMVP.Presenter {

    override fun loadMovies() {
        repository.loadMovies()
                .observeOn(schedulerProvider.androidMainThread())
                .subscribe({
                    Timber.i("Hello World-- NEXT")
                    view.showToast("Success")
                }, {
                    Timber.i("Hello World--- ERROR")
                    view.showToast("Error")
                })
    }

}
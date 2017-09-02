package com.kotlin.mykotlinsample.main

import android.util.Log
import com.kotlin.mykotlinsample.data.MoviesRepository
import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable
import javax.inject.Inject

/**
 * Presenter class for [MainActivity]
 */

class MainPresenter
    @Inject constructor(
        private val view: MainMVP.View,
        private val repository: MoviesRepository) : MainMVP.Presenter {

    override fun loadMovies(): Observable<MoviesResponse> {
        return repository.loadMovies()
    }

    override fun doSomething() {
        Log.i("something", "here")
        view.showToast()
    }

}
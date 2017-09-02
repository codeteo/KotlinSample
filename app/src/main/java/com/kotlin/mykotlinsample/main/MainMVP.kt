package com.kotlin.mykotlinsample.main

import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import rx.Observable

/**
 * Contract class for [MainActivity] between View and Presenter. Helps to implement
 * MVP pattern
 */
interface MainMVP {

    interface View {
        fun showToast()
    }

    interface Presenter {
        fun doSomething()

        fun loadMovies(): Observable<MoviesResponse>
    }

}
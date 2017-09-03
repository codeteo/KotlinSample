package com.kotlin.mykotlinsample.main

/**
 * Contract class for [MainActivity] between View and Presenter. Helps to implement
 * MVP pattern
 */
interface MainMVP {

    interface View {
        fun showToast(msg: String)
    }

    interface Presenter {
        fun loadMovies()
        fun unsubscribe()
    }

}
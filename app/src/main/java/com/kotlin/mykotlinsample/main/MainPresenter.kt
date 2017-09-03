package com.kotlin.mykotlinsample.main

import com.kotlin.mykotlinsample.data.MoviesRepository
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import rx.Subscription
import rx.subscriptions.CompositeSubscription
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

    private val subscriptions: CompositeSubscription = CompositeSubscription()

    override fun loadMovies() {
        val sub: Subscription = repository.loadMovies()
                .observeOn(schedulerProvider.androidMainThread())
                .subscribe({
                    Timber.i("Hello World-- NEXT")
                    view.showToast("Success")
                }, {
                    Timber.i("Hello World--- ERROR")
                    view.showToast("Error")
                })

        subscriptions.add(sub)
    }

    override fun unsubscribe() {
        if (subscriptions.hasSubscriptions()) {
            subscriptions.clear()
        }
    }
}
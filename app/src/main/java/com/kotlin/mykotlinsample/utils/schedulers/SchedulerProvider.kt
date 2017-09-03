package com.kotlin.mykotlinsample.utils.schedulers

import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Provides different types of schedulers.
 */

class SchedulerProvider
    private constructor() // Prevent direct instantiation.
        : BaseSchedulerProvider {

    override fun computation(): Scheduler {
        return Schedulers.computation()
    }

    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun androidMainThread(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

}
package com.kotlin.mykotlinsample.utils.schedulers

import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Provides different types of schedulers.
 *
 * Kotlin is an amazing language and all we need to do to get a Singleton
 * class is to use **object** keyword.
 * Read more about objects in Kotlin [here](https://antonioleiva.com/objects-kotlin/).
 */

object SchedulerProvider : BaseSchedulerProvider {

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
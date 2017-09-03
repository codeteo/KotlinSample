package com.kotlin.mykotlinsample.utils.schedulers

import rx.Scheduler

/**
 * Allow providing different types of [Scheduler]s.
 */

interface BaseSchedulerProvider {

    fun computation(): Scheduler

    fun io(): Scheduler

    fun androidMainThread(): Scheduler

}
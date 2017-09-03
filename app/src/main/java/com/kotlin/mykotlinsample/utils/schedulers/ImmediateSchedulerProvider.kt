package com.kotlin.mykotlinsample.utils.schedulers

import rx.Scheduler
import rx.schedulers.Schedulers


/**
 * Implementation of the [BaseSchedulerProvider] making all [Scheduler]s immediate.
 */

class ImmediateSchedulerProvider : BaseSchedulerProvider {

    override fun computation(): Scheduler {
        return Schedulers.immediate()
    }

    override fun io(): Scheduler {
        return Schedulers.immediate()
    }

    override fun androidMainThread(): Scheduler {
        return Schedulers.immediate()
    }
}
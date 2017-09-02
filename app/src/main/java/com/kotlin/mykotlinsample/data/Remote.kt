package com.kotlin.mykotlinsample.data

import javax.inject.Qualifier

/**
 * Annotation to differentiate remote from local [MoviesDataSource].
 */

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Remote
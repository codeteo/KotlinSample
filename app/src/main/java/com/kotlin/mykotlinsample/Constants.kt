package com.kotlin.mykotlinsample

/**
 *
 * Contains various constants used in our project
 *
 * The 'object' keyword in Kotlin creates a singleton.
 * You can read more [here](https://blog.egorand.me/where-do-i-put-my-constants-in-kotlin/)
 * about how to define your constants in Kotlin.
 */

object Constants {

    const val BASE_URL = "http://api.themoviedb.org/3/"

    const val API_KEY = BuildConfig.API_KEY

    /* images url */
    const val BASE_IMAGE_URL = "http://image.tmdb.org/t/p/"
    const val URL_PART_IMAGE_SIZE = "w185"

}
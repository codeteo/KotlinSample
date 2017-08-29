package com.kotlin.mykotlinsample

/**
 *
 * The 'object' keyword in Kotlin creates a singleton.
 * How to define constants you can read more [here](https://blog.egorand.me/where-do-i-put-my-constants-in-kotlin/)
 */
object Constants {

    const val BASE_URL = "https://api.unsplash.com/"

    const val API_KEY = BuildConfig.API_KEY

}
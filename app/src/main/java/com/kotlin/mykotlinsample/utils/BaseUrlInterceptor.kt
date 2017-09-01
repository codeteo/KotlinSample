package com.kotlin.mykotlinsample.utils

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

/**
 * An interceptor that allows runtime changes to the URL hostname.
 * Usually used in combination with MockWebServer.
 */

class BaseUrlInterceptor(private val realBaseUrl: String) : Interceptor {

    @Volatile private var host: String? = null

    fun setBaseUrl(host: String) {
        this.host = host
    }

    fun resetBaseUrl() {
        this.host = realBaseUrl
    }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        if (host != null && realBaseUrl != host) {
            val newUrl = HttpUrl.parse(host!!)
            request = request.newBuilder()
                    .url(newUrl)
                    .build()
        }
        return chain.proceed(request)
    }

}
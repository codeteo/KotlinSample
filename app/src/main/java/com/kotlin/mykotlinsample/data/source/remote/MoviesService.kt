package com.kotlin.mykotlinsample.data.source.remote

import com.kotlin.mykotlinsample.data.entities.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Retrofit service for api calls
 */

interface MoviesApiServices {

    @GET("movie/popular")
    fun getMostPopular(@Query("api_key") apiKey: String): Observable<MoviesResponse>

    @GET("movie/top_rated")
    fun getTopRated(@Query("api_key") apiKey: String): Observable<MoviesResponse>

}
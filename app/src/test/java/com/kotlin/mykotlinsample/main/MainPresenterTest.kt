package com.kotlin.mykotlinsample.main

import com.kotlin.mykotlinsample.data.entities.Movie
import com.kotlin.mykotlinsample.domain.GetMoviesUseCase
import com.kotlin.mykotlinsample.utils.schedulers.BaseSchedulerProvider
import com.kotlin.mykotlinsample.utils.schedulers.ImmediateSchedulerProvider
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import rx.Observable
import rx.observers.TestSubscriber



/**
 * Unit tests for [MainPresenter]
 */

class MainPresenterTest {

    private val view: MainMVP.View = mock(MainMVP.View::class.java)
    private val getMoviesUseCase: GetMoviesUseCase = mock(GetMoviesUseCase::class.java)
    private val baseScheduler: BaseSchedulerProvider = ImmediateSchedulerProvider()

    // Unit under test
    private val presenter = MainPresenter(view, getMoviesUseCase, baseScheduler)

    private lateinit var testSubscriber: TestSubscriber<Array<Movie>>

    @Before
    fun setup() {
        testSubscriber = TestSubscriber()
    }

    @Test
    fun `loadMovies() with correct data should show Success`() {
        // given
        `when`(getMoviesUseCase.getMovies()).thenReturn(Observable.just(arrayOfMovies()))

        // when
        presenter.loadMovies()
        getMoviesUseCase.getMovies().subscribe(testSubscriber)

        // then
        verify(view).showToast("Success")
        testSubscriber.assertNoErrors()
    }

    @Test
    fun `loadMovies() with Exception should show Error`() {
        val exception = RuntimeException()

        // given
        `when`(getMoviesUseCase.getMovies()).thenReturn(Observable.error(exception))

        // when
        presenter.loadMovies()
        getMoviesUseCase.getMovies().subscribe(testSubscriber)

        // then
        verify(view).showToast("Error")
        testSubscriber.assertError(exception)
    }

    private fun arrayOfMovies(): Array<Movie>{

        val movie1 = Movie("id1", "title1", "overview", "vote",
                "backdrop", "adult", "lang", arrayOf("genre1","genre2"), "date",
                "origTitle", "votes", "poster", "video", "pop")

        val movie2 = Movie("id2", "title2", "overview", "vote",
                "backdrop", "adult", "lang", arrayOf("genre1","genre2"), "date",
                "origTitle", "votes", "poster", "video", "pop")

        return arrayOf(movie1, movie2)
    }

}
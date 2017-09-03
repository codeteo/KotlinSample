package com.kotlin.mykotlinsample.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import butterknife.bindView
import com.kotlin.mykotlinsample.MyApplication
import com.kotlin.mykotlinsample.R
import com.kotlin.mykotlinsample.main.dagger.components.DaggerMainComponent
import com.kotlin.mykotlinsample.main.dagger.components.MainComponent
import com.kotlin.mykotlinsample.main.dagger.modules.MainModule
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainMVP.View {

    val tvIncrement: TextView by bindView(R.id.tv_increment)
    val btnHi: Button by bindView(R.id.btn_hi)

    @Inject
    lateinit var presenter: MainMVP.Presenter

    private val component: MainComponent by lazy {
        DaggerMainComponent
                .builder()
                .networkComponent((application as MyApplication).networkComponent)
                .mainModule(MainModule(this))
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        presenter.loadMovies()

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unsubscribe()
    }

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

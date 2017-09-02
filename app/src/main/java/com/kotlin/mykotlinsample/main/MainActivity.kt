package com.kotlin.mykotlinsample.main

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import butterknife.bindView
import com.kotlin.mykotlinsample.MyApplication
import com.kotlin.mykotlinsample.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val tvHello: TextView by bindView(R.id.tv_hello)
    val tvIncrement: TextView by bindView(R.id.tv_increment)
    val btnHi: Button by bindView(R.id.btn_hi)

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).applicationComponent.inject(application)

        tvHello.text = resources.getString(R.string.tv_hello)

        btnHi.setOnClickListener{
            toast(increment().toString())
        }

    }

    fun toast(msg: String) {
        Toast.makeText(this, "Clicked : $msg", Toast.LENGTH_LONG).show()
    }

    fun increment(): Int {
        val counterString = tvIncrement.text.toString()

        var counter: Int = Integer.parseInt(counterString)
        counter++

        tvIncrement.text = counter.toString()

        return counter
    }

}

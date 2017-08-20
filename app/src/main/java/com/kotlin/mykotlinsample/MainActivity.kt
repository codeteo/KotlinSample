package com.kotlin.mykotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import butterknife.bindView

class MainActivity : AppCompatActivity() {

    val tvHello: TextView by bindView(R.id.tv_hello)
    val tvIncrement: TextView by bindView(R.id.tv_increment)
    val btnHi: Button by bindView(R.id.btn_hi)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

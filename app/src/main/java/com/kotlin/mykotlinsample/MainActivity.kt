package com.kotlin.mykotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import butterknife.bindView

class MainActivity : AppCompatActivity() {

    val tvHello: TextView by bindView(R.id.tv_hello)
    val btnHi: Button by bindView(R.id.btn_hi)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello.text = resources.getString(R.string.tv_hello)

        btnHi.setOnClickListener{
            toast()
        }

    }

    fun toast() {
        Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
    }

}

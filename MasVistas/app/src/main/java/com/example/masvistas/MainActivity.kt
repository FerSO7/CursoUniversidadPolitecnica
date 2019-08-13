package com.example.masvistas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sePulsa(view :View)
    {
        salida?.setText((java.lang.Float.parseFloat(
            entrada?.getText().toString()) * 2.0).toString())
    }

    fun sePulsa0(view :View)
    {
        entrada?.setText(entrada?.getText().toString() + view?.tag as String)
    }
}

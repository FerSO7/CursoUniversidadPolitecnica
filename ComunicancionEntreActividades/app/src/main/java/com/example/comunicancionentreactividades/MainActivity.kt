package com.example.comunicancionentreactividades

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verificar(view: View)
    {
        val i = Intent(this,SegundaActividad :: class.java )
        val usuario :String = nombre.text.toString()
        i.putExtra("usuario",usuario)
        startActivityForResult(i, 1234)

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int,
                                  data: Intent?) {
        if (requestCode == 1234 && resultCode == Activity.RESULT_OK) {
            val res = data?.extras?.getString("resultado") ?: "sin resultado"
            t_resultado.setText("Resultado:" + res)
        }
        else{
            val res = data?.extras?.getString("resultado") ?: "sin resultado"
            t_resultado.setText("Resultado:" + res)
        }

    }
}

package com.example.comunicancionentreactividades

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_segunda_actividad.*

class SegundaActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)
        setInfomacion()
    }

    fun setInfomacion()
    {

        val extras = intent.extras // esto da null
        val usuario = extras?.getString("usuario")?:"Sin Usuario"
        t_texto.setText("Hola " + usuario+" ¿Aceptas las condiciones?")
    }
    fun respuestaPositiva( view: View)
    {
        val intent = Intent( )
        intent.putExtra("resultado", "El usuario acepta las condiciones")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
    fun respuestaNegativa (view : View)
    {
        val intent = Intent( )
        intent.putExtra("resultado", "El usuario no acepta las condiciones")
        setResult(Activity.RESULT_CANCELED, intent)
        finish()
    }
}

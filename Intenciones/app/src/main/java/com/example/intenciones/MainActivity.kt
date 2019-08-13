package com.example.intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun paginaWeb(view: View)
    {
        intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.mdzol.com"))
        startActivity(intent)
    }

    fun llamadaTelefono(view :View) = startActivity(
        Intent (Intent.ACTION_DIAL, Uri.parse("tel:2634431472")))

    fun googleMaps(view: View) = startActivity(
        Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q")))

    fun tomarFoto(view: View) = startActivity(
        Intent(MediaStore.ACTION_IMAGE_CAPTURE))

    fun mandarCorreo(view: View) = startActivity(
        Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, "asunto")
            putExtra(Intent.EXTRA_TEXT, "texto del correo")
            putExtra(Intent.EXTRA_EMAIL, arrayOf("jtomas@upv.es"))})
}

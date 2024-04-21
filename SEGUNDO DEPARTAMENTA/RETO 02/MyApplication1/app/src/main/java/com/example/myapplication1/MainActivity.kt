package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAceptar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {
            val editTextNombre = findViewById<EditText>(R.id.editTextNombre)
            val editTextApellidos = findViewById<EditText>(R.id.editTextApellidos)
            val editTextTelefono = findViewById<EditText>(R.id.editTextTelefono)
            val editTextCorreo = findViewById<EditText>(R.id.editTextCorreo)
            val imageViewResultado = findViewById<ImageView>(R.id.imageViewResultado)

            if (editTextNombre.text.isNotEmpty() &&
                editTextApellidos.text.isNotEmpty() &&
                editTextTelefono.text.isNotEmpty() &&
                editTextCorreo.text.isNotEmpty()) {
                // Todos los campos están llenos
                imageViewResultado.setImageResource(R.drawable.ic_check_green) // Imagen de palomita verde
            } else {
                // Uno o más campos están vacíos
                imageViewResultado.setImageResource(R.drawable.ic_check_red) // Imagen de palomita roja
            }

            // Cambiar la visibilidad de la imagen de resultado
            imageViewResultado.visibility = ImageView.VISIBLE
            // Deshabilitar el botón
            btnAceptar.isEnabled = false
            // Ocultar el texto del botón
            btnAceptar.text = ""
        }
    }
}
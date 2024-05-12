package com.example.myapplicationspn

import android.content.DialogInterface
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var countrySpinner: Spinner
    lateinit var nextButton: Button
    lateinit var selectCountryTextView: TextView
    lateinit var headerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countrySpinner = findViewById(R.id.countrySpinner)
        nextButton = findViewById(R.id.nextButton)
        selectCountryTextView = findViewById(R.id.selectCountryTextView)
        headerTextView = findViewById(R.id.headerTextView)

        // Lista de países
        val countries = arrayOf("USA", "México", "Brasil", "France", "Deutsch", "Italia")

        // Adaptador para el spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySpinner.adapter = adapter

        // Listener para el botón Next
        nextButton.setOnClickListener {
            val selectedCountry = countrySpinner.selectedItem.toString()

            // Cambiar el texto del TextView y del botón al idioma seleccionado
            val selectedLanguage = getLanguage(selectedCountry)
            selectCountryTextView.text = getSelectCountryText(selectedCountry)
            nextButton.text = getNextButtonText(selectedCountry)

            val welcomeMessage = getWelcomeMessage(selectedCountry)
            showWelcomeAlert(welcomeMessage)
        }
    }

    // Función para obtener el mensaje de bienvenida en el idioma seleccionado
    private fun getWelcomeMessage(country: String): String {
        return when (country) {
            "USA" -> getString(R.string.welcome_message_usa)
            "México" -> getString(R.string.welcome_message_mexico)
            "Brasil" -> getString(R.string.welcome_message_brasil)
            "France" -> getString(R.string.welcome_message_france)
            "Deutsch" -> getString(R.string.welcome_message_deutsch)
            "Italia" -> getString(R.string.welcome_message_italia)
            else -> getString(R.string.welcome_message_default)
        }
    }

    // Función para obtener el texto del país seleccionado
    private fun getSelectCountryText(country: String): String {
        return when (country) {
            "USA" -> getString(R.string.country_usa)
            "México" -> getString(R.string.country_mexico)
            "Brasil" -> getString(R.string.country_brasil)
            "France" -> getString(R.string.country_france)
            "Deutsch" -> getString(R.string.country_deutsch)
            "Italia" -> getString(R.string.country_italia)
            else -> ""
        }
    }

    // Función para obtener el texto del botón "Next" en el idioma seleccionado
    private fun getNextButtonText(country: String): String {
        return when (country) {
            "USA" -> getString(R.string.next_usa)
            "México" -> getString(R.string.next_mexico)
            "Brasil" -> getString(R.string.next_brasil)
            "France" -> getString(R.string.next_france)
            "Deutsch" -> getString(R.string.next_deutsch)
            "Italia" -> getString(R.string.next_italia)
            else -> getString(R.string.next)
        }
    }

    // Función para obtener el idioma según el país seleccionado
    private fun getLanguage(country: String): String {
        return when (country) {
            "USA" -> "English"
            "México" -> "Spanish"
            "Brasil" -> "Portugués"
            "France" -> "Francés"
            "Deutsch" -> "Alemán"
            "Italia" -> "Italiano"
            else -> "English" // Idioma predeterminado
        }
    }

    // Función para mostrar el alerta de bienvenida
    private fun showWelcomeAlert(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Welcome")
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialogInterface: DialogInterface, i: Int ->
            dialogInterface.dismiss()
        }
        builder.show()
    }
}
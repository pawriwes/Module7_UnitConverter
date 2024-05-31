package com.parivesh.unitconverter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val conversion = Converter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField: EditText = findViewById(R.id.inputField)
        val conversionTypeSpinner: Spinner = findViewById(R.id.conversionTypeSpinner)
        val convertButton: Button = findViewById(R.id.convertButton)
        val resultView: TextView = findViewById(R.id.resultView)

        val conversionTypes = ConversionType.entries.map { it.displayName }
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, conversionTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        conversionTypeSpinner.adapter = adapter

        convertButton.setOnClickListener {
            val input = inputField.text.toString().toDoubleOrNull()
            if (input != null) {
                val selectedType = conversionTypeSpinner.selectedItem.toString()
                val conversionType = ConversionType.entries.first { it.displayName == selectedType }
                val result = conversion.convertUnits(input, conversionType)
                resultView.text = result.toString()
            } else {
                resultView.text = "Invalid input"
            }
        }
    }
}
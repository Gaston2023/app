package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity

import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val buttonCompare = findViewById<Button>(R.id.buttonCompare)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonCompare.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1 == text2) {
                textResult.text = "Los textos son iguales."
            } else {
                textResult.text = "Los textos son diferentes."
            }
        }
    }
}







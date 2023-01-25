package com.example.practica1listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.security.SecureRandom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val correo = findViewById<TextInputEditText>(R.id.idCorreo)
        val dni = findViewById<TextInputEditText>(R.id.idDNI)
        val password = findViewById<TextInputEditText>(R.id.idPassword)
        val profesor = findViewById<RadioButton>(R.id.radioButton)
        val alumno = findViewById<RadioButton>(R.id.radioButton2)
        val carnet = findViewById<CheckBox>(R.id.checkBox)
        val edad = findViewById<CheckBox>(R.id.checkBox2)
        val login = findViewById<Button>(R.id.button)
        val borrar = findViewById<Button>(R.id.button2)
        val genPass = findViewById<Button>(R.id.button3)
        val info = findViewById<TextView>(R.id.textView)

        login.setOnClickListener {
            if(correo.text!!.isEmpty() && dni.text!!.isEmpty() && password.text!!.isEmpty()){
                Toast.makeText(this, "Faltan campos por rellenar", Toast.LENGTH_SHORT).show()
            } else{
                info.text = correo.text.toString() + "\n" + dni.text.toString() + "\n" + password.text.toString() + "\n" + if(profesor.isChecked) {"Profesor"} else {"Alumno"} + "\n" + if(carnet.isChecked) {"Tiene carnet"} else {"No tiene carnet"} + "\n" + if(edad.isChecked) {"Es mayor de edad"} else {"No es mayor de edad"}
            }
        }

        borrar.setOnClickListener {
            correo.setText("")
            dni.setText("")
            password.setText("")
            profesor.isChecked = false
            alumno.isChecked = false
            carnet.isChecked = false
            edad.isChecked = false
            info.setText("")
        }

        genPass.setOnClickListener {
            val commonPass: String = "bJcK#768lhS1"
            password.setText(commonPass)
        }

    }
}
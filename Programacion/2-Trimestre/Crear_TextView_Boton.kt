package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding
import java.nio.channels.FileLock

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var numAlmacenado : String
    var digito1 : Float = 0F
    var digito2 : Float = 0F
    var isSuma : Boolean = false
    var isResta : Boolean = false
    var isMult : Boolean = false
    var isDiv : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonC.setOnClickListener {
            binding.textView5.text = "0"
        }

        binding.button1.setOnClickListener {
            compCero("1")
        }

        binding.button2.setOnClickListener {
            compCero("2")
        }

        binding.button3.setOnClickListener {
            compCero("3")
        }

        binding.button4.setOnClickListener {
            compCero("4")
        }

        binding.button5.setOnClickListener {
            compCero("5")
        }

        binding.button6.setOnClickListener {
            compCero("6")
        }

        binding.button7.setOnClickListener {
            compCero("7")
        }

        binding.button8.setOnClickListener {
            compCero("8")
        }

        binding.button9.setOnClickListener {
            compCero("9")
        }

        binding.button0.setOnClickListener {
            compCero("0")
        }

        binding.buttonM.setOnClickListener {
            numAlmacenado = binding.textView5.text.toString()
            Toast.makeText(this, "Numero guardado", Toast.LENGTH_SHORT).show()
        }

        binding.buttonMr.setOnClickListener {
           compCero(numAlmacenado.toString())
        }

        binding.buttonPunto.setOnClickListener {
            binding.textView5.setText(binding.textView5.text.toString() + ".")
        }

        binding.buttonSum.setOnClickListener {
            primerDig()
            borrarPantalla()
            isSuma = true
        }

        binding.buttonRest.setOnClickListener {
            primerDig()
            borrarPantalla()
            isResta = true
        }

        binding.buttonMult.setOnClickListener {
            primerDig()
            borrarPantalla()
            isMult = true
        }

        binding.buttonDiv.setOnClickListener {
            primerDig()
            borrarPantalla()
            isDiv = true
        }

        binding.buttonIgual.setOnClickListener {
            segunDig()
            if(isSuma){
                binding.textView5.setText((digito1 + digito2).toString())
            } else if(isResta){
                binding.textView5.setText((digito1 - digito2).toString())
            } else if(isMult){
                binding.textView5.setText((digito1 * digito2).toString())
            } else if(isDiv){
                binding.textView5.setText((digito1 / digito2).toString())
            } else{
                Toast.makeText(this, "No has indicado la operacion", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun compCero(num : String){
        if(binding.textView5.text.toString() == "0"){
            binding.textView5.setText(num.toString())
        } else{
            binding.textView5.setText(binding.textView5.text.toString() + num.toString())
        }
    }

    fun borrarPantalla(){
        binding.textView5.text = ""
    }

    fun primerDig(){
        digito1 = binding.textView5.text.toString().toFloat()
    }

    fun segunDig(){
        digito2 = binding.textView5.text.toString().toFloat()
    }

}
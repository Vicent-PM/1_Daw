package com.example.cambiovistas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cambiovistas.databinding.ActivityMainBinding
import com.example.cambiovistas.databinding.SecondActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("title", "Pelicula")
            intent.putExtra("number", 6)

            startActivity(intent)
        }
    }


}
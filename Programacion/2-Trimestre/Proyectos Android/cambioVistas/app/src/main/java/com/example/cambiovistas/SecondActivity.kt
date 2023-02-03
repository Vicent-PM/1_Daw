package com.example.cambiovistas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.example.cambiovistas.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: SecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if(bundle != null){
            if(bundle.containsKey("title") && bundle.containsKey("number")){
                val title = bundle.getString("title")
                val number = bundle.getInt("number")

                binding.textView.text = title
                binding.textView2.text = number.toString()
            }
        }
    }


}
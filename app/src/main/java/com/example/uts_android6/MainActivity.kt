package com.example.uts_android6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_android6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up button click listener
        binding.buttonCalculate.setOnClickListener {
            val length = binding.editTextLength.text.toString().toDoubleOrNull()
            val width = binding.editTextWidth.text.toString().toDoubleOrNull()

            if (length != null && width != null) {
                val area = length * width
                binding.textViewArea.text = "Area: $area"
            } else {
                binding.textViewArea.text = "Please enter valid numbers"
            }
        }
    }
}

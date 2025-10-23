package com.example.prak3_255

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prak3_255.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fullName = intent.getStringExtra("FULLNAME")
        val username = intent.getStringExtra("USERNAME")
        val age = intent.getStringExtra("AGE")
        val email = intent.getStringExtra("EMAIL")
        val gender = intent.getStringExtra("GENDER")

        binding.tvFullName.text = "Full Name: $fullName"
        binding.tvUsername.text = "Username: $username"
        binding.tvAge.text = "Age: $age"
        binding.tvEmail.text = "Email: $email"
        binding.tvGender.text = "Gender: $gender"
    }
}

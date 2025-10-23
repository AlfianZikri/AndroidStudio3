package com.example.prak3_255

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prak3_255.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val fullName = binding.etFullName.text.toString()
            val username = binding.etUsername.text.toString()
            val age = binding.etAge.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()
            val gender = if (binding.rbMale.isChecked) "Laki-laki" else if (binding.rbFemale.isChecked) "Perempuan" else ""

            if (fullName.isEmpty() || username.isEmpty() || age.isEmpty() || email.isEmpty() ||
                password.isEmpty() || confirmPassword.isEmpty() || gender.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Password tidak sama!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("FULLNAME", fullName)
                putExtra("USERNAME", username)
                putExtra("AGE", age)
                putExtra("EMAIL", email)
                putExtra("GENDER", gender)
            }
            startActivity(intent)
        }
    }
}

package com.cs4520.assignment1

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.cs4520.assignment1.databinding.LoginLayoutBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginLayoutBinding

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        binding = LoginLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.username.setOnClickListener {
            binding.username.setTextColor(R.color.teal_200.toInt())
        }


        binding.password.setOnClickListener {
            binding.password.setTextColor(R.color.teal_200.toInt())
        }

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "admin" && binding.password.text.toString() == "admin") {
                // move to the next page
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
package com.cs4520.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cs4520.assignment1.databinding.MainActivityLayoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        binding = MainActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
}

}
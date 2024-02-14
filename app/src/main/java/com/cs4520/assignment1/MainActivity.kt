package com.cs4520.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.cs4520.assignment1.databinding.MainActivityLayoutBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainerView, LoginFragment())
                    .commitAllowingStateLoss()
            }
        }
    }
}
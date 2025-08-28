package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen3Activity : AppCompatActivity() {

    private lateinit var btnRegister: Button
    private lateinit var btnLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_scrn3)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        btnRegister = findViewById(R.id.btnRegister)
        btnLogin = findViewById(R.id.btnLogin)
    }

    private fun setupClickListeners() {
        btnRegister.setOnClickListener {
            navigateToRegister()
        }

        btnLogin.setOnClickListener {
            navigateToLogin()
        }
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
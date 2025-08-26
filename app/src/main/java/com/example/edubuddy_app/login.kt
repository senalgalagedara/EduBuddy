package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnGoogleLogin: ImageButton
    private lateinit var btnFacebookLogin: ImageButton
    private lateinit var tvRegisterLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin)
        btnFacebookLogin = findViewById(R.id.btnFacebookLogin)
        tvRegisterLink = findViewById(R.id.tvRegisterLink)
    }

    private fun setupClickListeners() {
        btnLogin.setOnClickListener {
            // Go directly to Home screen
            navigateToHome()
        }

        btnGoogleLogin.setOnClickListener {
            // For now, also go to Home
            navigateToHome()
        }

        btnFacebookLogin.setOnClickListener {
            // For now, also go to Home
            navigateToHome()
        }

        tvRegisterLink.setOnClickListener {
            navigateToRegister()
        }
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.transition.side_in_right, R.transition.side_out_left)
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish() // so user can’t come back to login with back button
        overridePendingTransition(R.transition.side_in_right, R.transition.side_out_left)
    }
}

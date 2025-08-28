package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

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
        btnLogin = findViewById(R.id.btnLogin)
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin)
        btnFacebookLogin = findViewById(R.id.btnFacebookLogin)
        tvRegisterLink = findViewById(R.id.tvRegisterLink)
    }

    private fun setupClickListeners() {
        btnLogin.setOnClickListener {
            navigateToHome()
        }

        btnGoogleLogin.setOnClickListener {
            navigateToHome()
        }

        btnFacebookLogin.setOnClickListener {
            navigateToHome()
        }

        tvRegisterLink.setOnClickListener {
            navigateToRegister()
        }
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}

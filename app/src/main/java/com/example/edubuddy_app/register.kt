package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnRegister: Button
    private lateinit var btnGoogleSignUp: ImageButton
    private lateinit var btnFacebookSignUp: ImageButton
    private lateinit var tvLoginLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        btnRegister = findViewById(R.id.btnRegister)
        btnGoogleSignUp = findViewById(R.id.btnGoogleSignUp)
        btnFacebookSignUp = findViewById(R.id.btnFacebookSignUp)
        tvLoginLink = findViewById(R.id.tvLoginLink)
    }

    private fun setupClickListeners() {
        btnRegister.setOnClickListener {
            navigateToLogin()
        }


        btnGoogleSignUp.setOnClickListener {
            navigateToLogin()
        }

        btnFacebookSignUp.setOnClickListener {
            navigateToLogin()
        }

        tvLoginLink.setOnClickListener {
            navigateToLogin()
        }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}

package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen2Activity : AppCompatActivity() {

    private lateinit var btnNext: Button
    private lateinit var btnSkip: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_scrn2)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        btnNext = findViewById(R.id.btnNext)
        btnSkip = findViewById(R.id.btnSkip)
    }

    private fun setupClickListeners() {
        btnNext.setOnClickListener {
            navigateToScreen3()
        }

        btnSkip.setOnClickListener {
            navigateToRegister()
        }
    }

    private fun navigateToScreen3() {
        val intent = Intent(this, OnboardScreen3Activity::class.java)
        startActivity(intent)
        overridePendingTransition(R.transition.side_in_right, R.transition.side_out_left)
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }
}
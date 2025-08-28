package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen1Activity : AppCompatActivity() {

    private lateinit var btnNext: Button
    private lateinit var btnSkip: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_scrn1)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        btnNext = findViewById(R.id.btnNext)
        btnSkip = findViewById(R.id.btnSkip)
    }

    private fun setupClickListeners() {
        btnNext.setOnClickListener {
            navigateToScreen2()
        }

        btnSkip.setOnClickListener {
            navigateToRegister()
        }
    }

    private fun navigateToScreen2() {
        val intent = Intent(this, OnboardScreen2Activity::class.java)
        startActivity(intent)
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }
}
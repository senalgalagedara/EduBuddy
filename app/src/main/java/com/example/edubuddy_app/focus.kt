package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class FocusActivity : AppCompatActivity() {

    private lateinit var navHome: LinearLayout
    private lateinit var navLessons: LinearLayout
    private lateinit var navFocus: LinearLayout
    private lateinit var navTodoList: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_focus)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        navHome = findViewById(R.id.navHome)
        navLessons = findViewById(R.id.navLessons)
        navFocus = findViewById(R.id.navFocus)
        navTodoList = findViewById(R.id.navTodoList)
        navProfile = findViewById(R.id.navProfile)
    }

    private fun setupClickListeners() {
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        navHome.setOnClickListener {
            navigateToHome()
        }

        navLessons.setOnClickListener {
            navigateToLessons()
        }

        navFocus.setOnClickListener {
        }

        navTodoList.setOnClickListener {
            navigateToTodo()
        }

        navProfile.setOnClickListener {
            navigateToProfile()
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToLessons() {
        val intent = Intent(this, LessonsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodo() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}

package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class LessonsActivity : AppCompatActivity() {

    private lateinit var etSearch: EditText
    private lateinit var navHome: LinearLayout
    private lateinit var navLessons: LinearLayout
    private lateinit var navFocus: LinearLayout
    private lateinit var navTodoList: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        etSearch = findViewById(R.id.etSearch)
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
            // Already on Lessons → do nothing
        }

        navFocus.setOnClickListener {
            navigateToFocus()
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
        overridePendingTransition(R.transition.side_in_left, R.transition.side_out_right)
    }

    private fun navigateToFocus() {
        val intent = Intent(this, FocusActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.transition.side_in_left, R.transition.side_out_right)
    }

    private fun navigateToTodo() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.transition.side_in_left, R.transition.side_out_right)
    }

    private fun navigateToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.transition.side_in_left, R.transition.side_out_right)
    }
}

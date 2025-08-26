package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var tvViewAll: TextView
    private lateinit var navHome: LinearLayout
    private lateinit var navLessons: LinearLayout
    private lateinit var navFocus: LinearLayout
    private lateinit var navTodoList: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        tvViewAll = findViewById(R.id.tvViewAll)
        navHome = findViewById(R.id.navHome)
        navLessons = findViewById(R.id.navLessons)
        navFocus = findViewById(R.id.navFocus)
        navTodoList = findViewById(R.id.navTodoList)
        navProfile = findViewById(R.id.navProfile)
    }

    private fun setupClickListeners() {
        tvViewAll.setOnClickListener {
            navigateToLessons()
        }
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        navHome.setOnClickListener {
            // Already on Home → do nothing
        }

        navLessons.setOnClickListener {
            navigateToLessons()
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

    private fun navigateToLessons() {
        val intent = Intent(this, LessonsActivity::class.java)
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

package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class TodoActivity : AppCompatActivity() {

    private lateinit var taskContainer: LinearLayout
    private lateinit var etNewTask: EditText
    private lateinit var btnAddTask: Button
    private lateinit var navHome: LinearLayout
    private lateinit var navLessons: LinearLayout
    private lateinit var navFocus: LinearLayout
    private lateinit var navTodoList: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        initViews()
        setupBottomNavigation()
    }

    private fun initViews() {
        taskContainer = findViewById(R.id.taskContainer)
        etNewTask = findViewById(R.id.etNewTask)
        btnAddTask = findViewById(R.id.btnAddTask)
        navHome = findViewById(R.id.navHome)
        navLessons = findViewById(R.id.navLessons)
        navFocus = findViewById(R.id.navFocus)
        navTodoList = findViewById(R.id.navTodoList)
        navProfile = findViewById(R.id.navProfile)
    }

    private fun setupBottomNavigation() {
        navHome.setOnClickListener {
            navigateToHome()
        }

        navLessons.setOnClickListener {
            navigateToLessons()
        }

        navFocus.setOnClickListener {
            navigateToFocus()
        }

        navTodoList.setOnClickListener {

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

    private fun navigateToProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.transition.side_in_right, R.transition.side_out_left)
    }
}

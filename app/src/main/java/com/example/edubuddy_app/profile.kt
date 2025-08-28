package com.studyboost.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var btnSettings: TextView
    private lateinit var btnBadges: TextView
    private lateinit var settingsContent: LinearLayout
    private lateinit var badgesContent: LinearLayout
    private lateinit var btnLogOut: Button
    private lateinit var btnDeleteAccount: Button
    private lateinit var navHome: LinearLayout
    private lateinit var navLessons: LinearLayout
    private lateinit var navFocus: LinearLayout
    private lateinit var navTodoList: LinearLayout
    private lateinit var navProfile: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        btnSettings = findViewById(R.id.btnSettings)
        btnBadges = findViewById(R.id.btnBadges)
        settingsContent = findViewById(R.id.settingsContent)
        badgesContent = findViewById(R.id.badgesContent)
        btnLogOut = findViewById(R.id.btnLogOut)
        btnDeleteAccount = findViewById(R.id.btnDeleteAccount)
        navHome = findViewById(R.id.navHome)
        navLessons = findViewById(R.id.navLessons)
        navFocus = findViewById(R.id.navFocus)
        navTodoList = findViewById(R.id.navTodoList)
        navProfile = findViewById(R.id.navProfile)
    }

    private fun setupClickListeners() {
        btnSettings.setOnClickListener {
            showSettings()
        }

        btnBadges.setOnClickListener {
            showBadges()
        }

        btnLogOut.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnDeleteAccount.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        setupEditButtons()
        setupBottomNavigation()
    }

    private fun setupEditButtons() {
        val editButtons = listOf(
            R.id.btnEditName,
            R.id.btnEditEmail,
            R.id.btnEditPassword,
            R.id.btnEditPhone
        )

        editButtons.forEach { id ->
            findViewById<TextView>(id)?.setOnClickListener {

            }
        }
    }

    private fun showSettings() {
        settingsContent.visibility = LinearLayout.VISIBLE
        badgesContent.visibility = LinearLayout.GONE

        btnSettings.setBackgroundResource(R.drawable.toggle_active_background)
        btnSettings.setTextColor(resources.getColor(R.color.text_white, null))
        btnBadges.setBackgroundResource(R.drawable.toggle_inactive_background)
        btnBadges.setTextColor(resources.getColor(R.color.text_secondary, null))
    }

    private fun showBadges() {
        settingsContent.visibility = LinearLayout.GONE
        badgesContent.visibility = LinearLayout.VISIBLE

        btnBadges.setBackgroundResource(R.drawable.toggle_active_background)
        btnBadges.setTextColor(resources.getColor(R.color.text_white, null))
        btnSettings.setBackgroundResource(R.drawable.toggle_inactive_background)
        btnSettings.setTextColor(resources.getColor(R.color.text_secondary, null))
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
            navigateToTodo()
        }

        navProfile.setOnClickListener {
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

    private fun navigateToFocus() {
        val intent = Intent(this, FocusActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodo() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
}

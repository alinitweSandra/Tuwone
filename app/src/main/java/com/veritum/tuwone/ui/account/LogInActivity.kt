package com.veritum.tuwone.ui.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.veritum.tuwone.R
import com.veritum.tuwone.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        btnLogIn.setOnClickListener {
            logInUser()
        }
    }

    private fun logInUser() {

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
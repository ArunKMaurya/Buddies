
package com.shivam.new_buddy.message

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RelativeLayout
import com.shivam.new_buddy.DashboardActivity
import com.shivam.new_buddy.MessageActivity
import com.shivam.new_buddy.R

class SearchProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_profile)
        val btBack = findViewById<RelativeLayout>(R.id.rl_return)
        btBack.setOnClickListener {
            onBackPressed()
        }
    }
}




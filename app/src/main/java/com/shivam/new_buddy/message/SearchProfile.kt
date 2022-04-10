
package com.shivam.new_buddy.message
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RelativeLayout
import com.shivam.new_buddy.R
import com.shivam.new_buddy.ui.activities.MessageActivity

class SearchProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_profile)
        val btback= findViewById<RelativeLayout>(R.id.rl_back)
        btback.setOnClickListener(){
            onBackPressed()
        }


    }
}






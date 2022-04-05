
package com.shivam.new_buddy.message
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.shivam.new_buddy.R
class SearchProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_profile)
        val btback=findViewById<RelativeLayout>(R.id.rl_return)
        btback.setOnClickListener(){
            onBackPressed()
        }
    }
}


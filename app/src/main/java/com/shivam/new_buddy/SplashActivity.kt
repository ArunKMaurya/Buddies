package com.shivam.new_buddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.shivam.new_buddy.databinding.ActivityDashboardBinding
import com.shivam.new_buddy.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

   private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Handler().postDelayed( { //This method will be executed once the timer is over
            // Start your app main activity
//            val i = Intent(this, DashboardActivity::class.java)
            val i = Intent(this, DashboardActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 3000)
    }
}



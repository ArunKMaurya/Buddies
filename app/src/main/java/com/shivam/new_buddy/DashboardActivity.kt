package com.shivam.new_buddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.shivam.new_buddy.databinding.ActivityDashboardBinding
import kotlinx.coroutines.handleCoroutineException
import kotlin.concurrent.fixedRateTimer

//import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        swapFragments(HomeFragment())
        setContentView(view)
        binding.btBottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.m_home -> {
                    swapFragments(HomeFragment())
                    // Respond to navigation item 1 click
//                    showToast("home")
                    true
                }
                R.id.m_global -> {
                    // Respond to navigation item 2 click
                    swapFragments(GlobalFragment())
//                    showToast("global")
                    true
                }
                R.id.m_notify -> {
                    // Respond to navigation item 2 click
                    swapFragments(NotifyFragment())
//                    showToast("notify")
                    true
                }
                R.id.m_profile -> {
                    // Respond to navigation item 2 click
                    swapFragments(ProfileFragment())
//                    showToast("profile")
                    true
                }
                else -> false
            }
        }
    }
    private fun swapFragments(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_nav, fragment)
            .commit()
    }
//    fun showToast(msg : String){
//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

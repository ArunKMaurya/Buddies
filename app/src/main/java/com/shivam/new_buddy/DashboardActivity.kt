package com.shivam.new_buddy

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class DashboardActivity : AppCompatActivity() {
     private val homeFragment = HomeFragment()
     private val globalFragment = GlobalFragment()
     private val notifyFragment = NotifyFragment()
     private val profileFragment = ProfileFragment()


     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_dashboard)
         replaceFragment(homeFragment)





     }

     private  fun replaceFragment(fragment:Fragment){

         if (fragment !=null){
             val transaction=supportFragmentManager.beginTransaction()
             transaction.replace(R.id.fl_nav,fragment)
             transaction.commit()

         }

     }
 }

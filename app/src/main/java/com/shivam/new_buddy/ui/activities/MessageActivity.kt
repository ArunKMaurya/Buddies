package com.shivam.new_buddy.ui.activities
import android.content.Intent
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.*
import com.shivam.new_buddy.ui.adapters.AdapterClass
import com.shivam.new_buddy.models.DataRec
import com.shivam.new_buddy.R
import com.shivam.new_buddy.databinding.ActivityMessageBinding
import com.shivam.new_buddy.message.SearchProfile
class MessageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvMsg.apply{
            layoutManager=LinearLayoutManager(this@MessageActivity)
        }
        fetchData()
    }

    private fun fetchData() {

        FirebaseFirestore.getInstance().collection("dataRec")
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    val user=documents.toObjects(DataRec::class.java)
                    binding.rvMsg.adapter=AdapterClass(this,user)

                }
            }
            .addOnFailureListener {

            }
        val button=findViewById<ImageButton>(R.id.ib_msg)
        button.setOnClickListener(){
            val intent = Intent(this, SearchProfile::class.java)
            startActivity(intent)
        }



    }
}


















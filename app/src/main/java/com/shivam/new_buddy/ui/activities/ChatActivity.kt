package com.shivam.new_buddy.ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shivam.new_buddy.databinding.ActivityChatBinding
import com.shivam.new_buddy.models.Chat
import com.shivam.new_buddy.ui.adapters.ChatAdapter

class ChatActivity : AppCompatActivity() {

    lateinit var chatList: ArrayList<Chat>
    lateinit var binding: ActivityChatBinding
    val partnerProfileImage =
        "https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bGFkeXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"

    val noteLink =
        "https://images.unsplash.com/photo-1518976024611-28bf4b48222e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=685&q=80"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        chatList = ArrayList()
        setUpDummyData()

        val cAdapter = ChatAdapter(this)
        cAdapter.diff.submitList(chatList)
        binding.chatsRecycler.apply {
            adapter = cAdapter
            layoutManager = LinearLayoutManager(this@ChatActivity)
        }
        binding.backBtn.setOnClickListener {
            finish()
        }

    }

    fun setUpDummyData() {
        chatList.add(Chat("1", "1001", "hello", partnerProfileImage))
        chatList.add(Chat("2", "1002", "hi", partnerProfileImage))
        chatList.add(Chat("3", "1001", "what r u doning", partnerProfileImage))
        chatList.add(Chat("4", "1002", "Nothing Just sleeping", partnerProfileImage))
        chatList.add(Chat("5", "1001", "ok can you do something for me?", partnerProfileImage))
        chatList.add(Chat("6", "1002", "yes sure !", partnerProfileImage))
        chatList.add(Chat("7", "1001", "i need ur help badly", partnerProfileImage))
        chatList.add(
            Chat(
                "8",
                "1002",
                "i try to help please let me know what can i do for you ?",
                partnerProfileImage
            )
        )
        chatList.add(
            Chat(
                "9",
                "1001",
                "I am sending You a note can you teach me about this topic",
                partnerProfileImage
            )
        )
        chatList.add(Chat("10", "1001", noteLink, partnerProfileImage))
        chatList.add(
            Chat(
                "11",
                "1002",
                "hmm .. well i my self dont understand what it is ? how can i teach you",
                partnerProfileImage
            )
        )
        chatList.add(Chat("12", "1001", "hmmm its ok thanks", partnerProfileImage))
        chatList.add(Chat("13", "1002", "welcome", partnerProfileImage))
    }
}
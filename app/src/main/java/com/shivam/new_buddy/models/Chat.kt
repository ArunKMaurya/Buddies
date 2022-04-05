package com.shivam.new_buddy.models

data class Chat(
    val id: String,
    val userId: String,
    val message: String,
    val partnerProfileImgUrl: String
)

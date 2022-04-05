package com.shivam.new_buddy.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.URLUtil
import android.widget.Toast
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shivam.new_buddy.databinding.ChatItemBinding
import com.shivam.new_buddy.models.Chat

class ChatAdapter(val ctx: Context) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    companion object {
        val myUserId = "1002"
    }

    class ChatViewHolder(val binding: ChatItemBinding) : RecyclerView.ViewHolder(binding.root)

    private val differ = object : DiffUtil.ItemCallback<Chat>() {
        override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
            return oldItem == newItem
        }

    }

    val diff = AsyncListDiffer(this, differ)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder(
            ChatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chat = diff.currentList[position]
        if (myUserId == chat.userId) {
            holder.binding.partnerMsgSection.visibility = View.GONE
            holder.binding.myMsgSection.visibility = View.VISIBLE

            if (URLUtil.isValidUrl(chat.message)) {
                holder.binding.myTextMsg.visibility = View.GONE
                holder.binding.myImgView.visibility = View.VISIBLE
                Glide.with(ctx).load(chat.message).into(holder.binding.myImgView)
            } else {
                holder.binding.myTextMsg.visibility = View.VISIBLE
                holder.binding.myImgView.visibility = View.GONE
                holder.binding.myTextMsg.text = chat.message
            }


        } else {
            holder.binding.partnerMsgSection.visibility = View.VISIBLE
            holder.binding.myMsgSection.visibility = View.GONE
            Glide.with(ctx).load(chat.partnerProfileImgUrl).into(holder.binding.partnerProfileImg)

            if (URLUtil.isValidUrl(chat.message)) {
                holder.binding.partnerTextMsg.visibility = View.GONE
                holder.binding.partnerImgView.visibility = View.VISIBLE
                Glide.with(ctx).load(chat.message).into(holder.binding.partnerImgView)
            } else {
                holder.binding.partnerTextMsg.visibility = View.VISIBLE
                holder.binding.partnerTextMsg.text = chat.message
                holder.binding.partnerImgView.visibility = View.GONE

            }

        }

        if (position == (itemCount - 1)) {
            Toast.makeText(ctx, "Last", Toast.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
        return diff.currentList.size
    }
}
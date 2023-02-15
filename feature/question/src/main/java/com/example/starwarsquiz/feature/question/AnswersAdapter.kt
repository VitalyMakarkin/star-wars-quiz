package com.example.starwarsquiz.feature.question

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.starwarsquiz.core.model.data.Person
import com.example.starwarsquiz.feature.question.databinding.ItemAnswerBinding

class AnswersAdapter : ListAdapter<Person, RecyclerView.ViewHolder>(AnswersDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return AnswerViewHolder(ItemAnswerBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is AnswerViewHolder -> holder.bind(getItem(position))
        }
    }

//    override fun getItemViewType(position: Int): Int {
//        return when (getItem(position)) {
//            is Person -> 0
//        }
//    }

    object AnswersDiffUtil : DiffUtil.ItemCallback<Person>() {
        override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
            return oldItem == newItem
        }

    }

    class AnswerViewHolder(private val binding: ItemAnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(answer: Person) {
            binding.answerText.text = answer.name
        }
    }
}
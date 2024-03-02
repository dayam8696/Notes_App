package com.example.notes_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.notes_app.databinding.FragmentHomeNoteBinding
import com.example.notes_app.databinding.NoteLayoutBinding
import com.example.notes_app.model.Note

class NoteAdapter:RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(val binding: NoteLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<Note>() {
        override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
            return oldItem.id == newItem.id &&
                    oldItem.noteDesc == newItem.noteDesc &&
                    oldItem.noteTittle == newItem.noteTittle
        }

        override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
              return  oldItem==newItem
        }



    }
    val differ = AsyncListDiffer(this, differCallback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
            return NoteViewHolder(
                NoteLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            )
    }

    override fun getItemCount(): Int {
       return differ.currentList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
            val currentNote =differ.currentList[position]
        holder.binding.noteTitle.text = currentNote.noteTittle
        holder.binding.noteDesc.text = currentNote.noteDesc


    }
}
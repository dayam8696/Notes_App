package com.example.notes_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notes_app.databinding.FragmentAddNoteBinding

class AddNoteFragment :BaseFragment(){
    private val binding by lazy { FragmentAddNoteBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

}
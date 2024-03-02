package com.example.notes_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "notes")

data class Note(
    @PrimaryKey(autoGenerate = true)
    val id :Int,
    val noteTittle :String,
    val noteDesc: String
) :Serializable

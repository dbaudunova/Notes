package com.geektech.notes.data.local

import androidx.room.*
import com.geektech.notes.data.model.NoteEntity

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAllNotes(): List<NoteEntity>

    @Insert
    fun createNotes(noteEntity: NoteEntity)

    @Update
    fun updateNotes(noteEntity: NoteEntity)

    @Delete
    fun deleteNotes(noteEntity: NoteEntity)
}
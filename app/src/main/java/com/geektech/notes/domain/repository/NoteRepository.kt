package com.geektech.notes.domain.repository

import com.geektech.notes.domain.model.Note

interface NoteRepository {

    fun getAllNotes(): List<Note>

    fun createNote(note: Note)

    fun updateNote(note: Note)

    fun deleteNote(note: Note)

}
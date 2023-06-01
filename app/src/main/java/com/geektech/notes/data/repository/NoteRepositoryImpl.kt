package com.geektech.notes.data.repository

import com.geektech.notes.data.local.NoteDao
import com.geektech.notes.data.mapper.toEntity
import com.geektech.notes.data.mapper.toNote
import com.geektech.notes.domain.model.Note
import com.geektech.notes.domain.repository.NoteRepository

class NoteRepositoryImpl(

    private val noteDao: NoteDao

) : NoteRepository {
    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map {
            it.toNote()
        }
    }

    override fun createNote(note: Note) {
        noteDao.createNotes(note.toEntity())
    }

    override fun updateNote(note: Note) {
        noteDao.updateNotes(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNotes(note.toEntity())
    }
}
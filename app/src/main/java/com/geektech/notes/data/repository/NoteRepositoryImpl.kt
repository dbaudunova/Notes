package com.geektech.notes.data.repository

import com.geektech.notes.data.local.NoteDao
import com.geektech.notes.data.mapper.toEntity
import com.geektech.notes.data.mapper.toNote
import com.geektech.notes.domain.model.Note
import com.geektech.notes.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(

    private val noteDao: NoteDao

) : NoteRepository {
    override fun getAllNotes(): List<Note> {
        /*val listEntity = noteDao.getAllNotes()
        val listOfNote = mutableListOf<Note>()

        for (item in listEntity){
            listOfNote.add(item.toNote())
        }
        return listOfNote*/

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
package com.geektech.notes.domain.usecase

import com.geektech.notes.domain.model.Note
import com.geektech.notes.domain.repository.NoteRepository

class CreateNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun createNote(note: Note) = noteRepository.createNote(note)

}
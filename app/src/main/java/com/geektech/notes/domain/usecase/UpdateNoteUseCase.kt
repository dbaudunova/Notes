package com.geektech.notes.domain.usecase

import com.geektech.notes.domain.model.Note
import com.geektech.notes.domain.repository.NoteRepository

class UpdateNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun updateNote(note: Note) = noteRepository.updateNote(note)

}
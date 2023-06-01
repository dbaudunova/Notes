package com.geektech.notes.domain.usecase

import com.geektech.notes.domain.model.Note
import com.geektech.notes.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)

}
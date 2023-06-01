package com.geektech.notes.domain.usecase

import com.geektech.notes.domain.repository.NoteRepository

class GetAllNotesUseCase(
    private val noteRepository: NoteRepository
) {

    fun getAllNotes() = noteRepository.getAllNotes()

}
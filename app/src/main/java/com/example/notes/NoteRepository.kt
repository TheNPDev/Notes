package com.example.notes

import androidx.lifecycle.LiveData


class NoteRepository(private val noteDao: NoteDao) {

    val allNote : LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note){
        noteDao.Insert(note)
    }

    suspend fun delete(note: Note){
        noteDao.Delete(note)
    }
}
package com.jetbrains.cristi.notite.criptate.service;

import com.jetbrains.cristi.notite.criptate.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note createNote(Note note);
    Note updateNote(Long id, Note note);
    void deleteNote(Long id);
}

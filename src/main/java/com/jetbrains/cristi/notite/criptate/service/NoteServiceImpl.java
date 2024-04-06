package com.jetbrains.cristi.notite.criptate.service;

import com.jetbrains.cristi.notite.criptate.model.Note;
import com.jetbrains.cristi.notite.criptate.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Long id, Note note) {
        Note existingNote = noteRepository.findById(id).orElse(null);
        if (existingNote != null) {
            existingNote.setTitle(note.getTitle());
            existingNote.setContent(note.getContent());
            return noteRepository.save(existingNote);
        }
        return null;
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}

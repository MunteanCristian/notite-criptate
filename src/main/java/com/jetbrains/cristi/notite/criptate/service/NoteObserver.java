package com.jetbrains.cristi.notite.criptate.service;

import com.jetbrains.cristi.notite.criptate.model.Note;

public interface NoteObserver {
    void notifyNoteUpdate(Note note);
}

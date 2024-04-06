package com.jetbrains.cristi.notite.criptate.controller;


import com.jetbrains.cristi.notite.criptate.model.Note;
import com.jetbrains.cristi.notite.criptate.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/id")
    public Note getNoteById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }

    @PostMapping("/add")
    public Note createNote(@RequestBody Note note){
        return noteService.createNote(note);
    }

    @PutMapping("/update/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note){
        return noteService.updateNote(id, note);
    }

    @DeleteMapping("/id")
    public void delteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }
}

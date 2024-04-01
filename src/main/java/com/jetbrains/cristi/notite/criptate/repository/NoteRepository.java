package com.jetbrains.cristi.notite.criptate.repository;

import com.jetbrains.cristi.notite.criptate.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}

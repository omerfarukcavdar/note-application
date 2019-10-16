package com.project.noteservice.service;

import com.project.noteservice.entity.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    List<Note> findAll();

    Note save(Note note);

    Note findById(String id);

    Note update(Note note);
}

package com.project.noteservice.service;

import com.project.noteservice.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> findAll();

    Note save(Note note);
}

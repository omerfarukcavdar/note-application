package com.project.noteservice.service.impl;

import com.project.noteservice.entity.Note;
import com.project.noteservice.repository.NoteRepository;
import com.project.noteservice.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> findAll() {
       return noteRepository.findAll();
    }

    public Note save(Note note){
        return noteRepository.save(note);
    }
}

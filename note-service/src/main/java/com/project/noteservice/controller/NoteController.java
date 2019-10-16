package com.project.noteservice.controller;

import com.project.noteservice.entity.Note;
import com.project.noteservice.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/notes")
    public List<Note> AllNotes(){
        return  noteService.findAll();
    }

    @PostMapping("/note")
    public void saveNote(@RequestBody Note note){

        noteService.save(note);
    }
}

package com.project.noteservice.controller;

import com.project.noteservice.entity.Note;
import com.project.noteservice.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Note saveNote(@RequestBody Note note){

        return noteService.save(note);
    }

    @PostMapping("/note/{id}")
    public Note updateNote(@RequestBody Note note,@PathVariable("id") String id){
        note.setId(id);
        return noteService.update(note);
    }
}

package com.project.noteservice.controller;

import com.project.noteservice.dto.UserDto;
import com.project.noteservice.entity.Note;
import com.project.noteservice.service.NoteService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

        String userId=note.getUserId();

        ResponseEntity<UserDto> responseEntity = new RestTemplate().getForEntity
                ("http://localhost:8001/user/{id}",
                        UserDto.class,userId);

        if(responseEntity.hasBody())
            return noteService.save(note);
        else
            return null;
    }

    @PostMapping("/note/{id}")
    public Note updateNote(@RequestBody Note note,@PathVariable("id") String id){
        note.setId(id);
        return noteService.update(note);
    }
}

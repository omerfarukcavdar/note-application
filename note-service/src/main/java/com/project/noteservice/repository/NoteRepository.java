package com.project.noteservice.repository;

import com.project.noteservice.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note,Integer> {
}

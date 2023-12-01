package com.cg.mentorservice.controller;

import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.service.MentorService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/mentors")
public class MentorController {


    private MentorService mentorService;
    @PostMapping
    public ResponseEntity<MentorDto> saveMentor(@Valid @RequestBody MentorDto mentor){
        MentorDto savedMentor = mentorService.saveMentor(mentor);
        return new ResponseEntity<>(savedMentor, HttpStatus.CREATED);
    }
    //build getUserById RESTAPI
    @GetMapping("{mentorId}")
    public ResponseEntity<MentorDto> getByMentorId(@PathVariable Long mentorId){
        MentorDto mentorDto = mentorService.getByMentorId(mentorId);
        return new ResponseEntity<>(mentorDto, HttpStatus.OK);

    }
    @GetMapping
    public  ResponseEntity<List<MentorDto>> getAllMentors(){
        List<MentorDto> mentors = mentorService.getAllMentors();
        return new ResponseEntity<>(mentors, HttpStatus.OK);
    }



}

package com.cg.mentorservice.service;

import com.cg.mentorservice.dto.APIResponseDto;
import com.cg.mentorservice.dto.MentorDto;

import java.util.List;

public interface MentorService  {

    MentorDto getByMentorId(Long id);
    List<MentorDto> getAllMentors();

    MentorDto saveMentor(MentorDto mentorDto);

//    APIResponseDto getBYMentorId(Long mentorId);

//    MentorDto updateMentor(MentorDto mentorDto);
//
//    void  deleteUser(Long userId);
}

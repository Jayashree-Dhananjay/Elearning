package com.cg.mentorservice.mapper;

import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.entity.Mentor;

public class MentorMapper {

    public  static MentorDto mapToMentorDto(Mentor mentor){
        MentorDto mentorDto = new MentorDto(
                mentor.getMentorId(),
                mentor.getExpertise(),

                mentor.getMentorName()

        );
        return mentorDto;
    }
    public static Mentor mapToMentor(MentorDto mentorDto){
        Mentor mentor = new Mentor(
                mentorDto.getMentorId(),
                mentorDto.getExpertise(),
                mentorDto.getMentorName()

        );
        return mentor;
    }

}

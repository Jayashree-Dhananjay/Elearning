package com.cg.mentorservice.mapper;

import com.cg.mentorservice.dto.MentorDto;
import com.cg.mentorservice.entity.Mentor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoMentorMapper {
    AutoMentorMapper MAPPER = Mappers.getMapper(AutoMentorMapper.class);
    MentorDto mapToMentorDto(Mentor mentor);
    Mentor mapToMentor(MentorDto mentorDto);

}

package com.cg.mentorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MentorDto {

    private Long mentorId;

    private String mentorName;
    private String expertise;

}
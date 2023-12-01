package com.cg.userservice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long userId;

    private String userName;
    private String mentorName;
    private String startDate;
    private String endDate;
    private int workedHours;

}


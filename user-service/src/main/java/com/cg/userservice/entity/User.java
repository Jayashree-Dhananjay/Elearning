package com.cg.userservice.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(nullable = false, unique = true)
    private Long userId;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private  String mentorName;
    @Column(nullable = false)
    private String startDate;

    private String endDate;
    private int workedHours;

}
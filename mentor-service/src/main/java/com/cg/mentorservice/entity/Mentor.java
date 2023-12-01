package com.cg.mentorservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Mentors")
public class Mentor {
    @Id
    @Column(nullable = false, unique = true)
    private Long mentorId;
    @Column(nullable = false)
    private String mentorName;
    @Column(nullable = false)
    private String expertise;
}

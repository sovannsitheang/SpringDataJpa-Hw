package kh.edu.istad.m2_springdatajpahw.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class Instructor {

    @Id
    private String userId;

    private String biography;

    private String facebookLink;

    private String githubLink;

    private String jobTitle;

    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
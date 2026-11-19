
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
@Table(name = "student_profiles")
public class Student {

    @Id
    private String userId;

    private String biography;

    private String facebookLink;

    private String githubLink;

    private String major;

    private String phoneNumber;

    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}

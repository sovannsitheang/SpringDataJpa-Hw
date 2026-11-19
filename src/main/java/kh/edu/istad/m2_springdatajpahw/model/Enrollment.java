
package kh.edu.istad.m2_springdatajpahw.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime enrolledAt;

    private LocalDateTime paymentAt;

    private String paymentMethod;

    private Boolean paymentStatus;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Student student;
}

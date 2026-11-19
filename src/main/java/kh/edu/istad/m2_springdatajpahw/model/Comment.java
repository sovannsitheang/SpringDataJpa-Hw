
package kh.edu.istad.m2_springdatajpahw.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime createdAt;

    private Boolean isDeleted;

    private String text;

    // reply -> parent comment (self reference)
    @ManyToOne
    private Comment parent;

    @OneToMany(mappedBy = "parent")
    private List<Comment> replies;

    @ManyToOne
    private Video video;
}

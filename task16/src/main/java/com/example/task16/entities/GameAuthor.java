package com.example.task16.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Indexed;
import java.util.Date;


@Entity
@Table(name ="game_author")
@Indexed
@Setter
@Getter
public class GameAuthor {
    @Id
    @SequenceGenerator(name = "game_author_seq", sequenceName =
            "game_author_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "game_author_seq", strategy =
            GenerationType.SEQUENCE)
    @Column(name = "game_author_id")
    private Integer gameAuthorId;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "birth_date")
    private Date birthDate;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
}
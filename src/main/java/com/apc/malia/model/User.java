package com.apc.malia.model;

import com.apc.malia.model.enums.Genre;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity{


    @Column(name = "raison")
    private String raison;

    @Column(name = "username")
    private String username;

    @Enumerated(EnumType.STRING)
    private Genre genre;

}

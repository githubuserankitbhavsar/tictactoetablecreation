package com.example.tictactoetablecreation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Player {

    @Id
    @GeneratedValue
    private Long id;
//    private String uuid;

    private String name;

    private Integer age;

}

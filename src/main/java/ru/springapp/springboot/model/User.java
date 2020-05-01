package ru.springapp.springboot.model;

import lombok.Data;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}
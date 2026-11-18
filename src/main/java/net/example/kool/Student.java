package net.example.kool;

import jakarta.persistence.Entity;
import jakarta.persistence.PersistenceContext;

@Entity
public class Student {
    long id;
    String name;
    int age;
    String email;
    public Student(){}

}

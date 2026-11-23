package net.example.kool;

import jakarta.persistence.*;

/* @Entity
public class Student {
    public Student(long id, String name, int age, String email){

    }
}
*/


@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 255)
    private String nimi;

    @Column(nullable = false, length = 255)
    private int age;

    @Column(unique = true, length = 255)
    private String email;

}
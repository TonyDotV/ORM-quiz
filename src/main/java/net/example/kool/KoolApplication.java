package net.example.kool;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(KoolApplication.class, args);
	}

    @Bean
    CommandLineRunner initData(StudentRepository studentRepository){
        return args -> {
            studentRepository.save(new Student(1, "Mart", 16, "mart.juur@mail.com"));
            studentRepository.save(new Student(2, "Mari", 20, "mari.maasikas@mail.com"));
        };
    }

}

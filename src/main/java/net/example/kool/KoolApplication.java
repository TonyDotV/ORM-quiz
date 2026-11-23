package net.example.kool;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(KoolApplication.class, args);
	}

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("net.example.kool");
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Bean
    CommandLineRunner initData(StudentRepository studentRepository){
        return args -> {
            studentRepository.save(new Student());
            studentRepository.save(new Student());
        };
    }

}

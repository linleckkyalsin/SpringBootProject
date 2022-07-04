package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student shishu= new Student(

                    "ShiShu",

                    LocalDate.of(2001, OCTOBER,5),
                    "shi@gmail.com"

            );
            Student Toke= new Student(

                    "Toke",

                    LocalDate.of(2001, FEBRUARY,5),
                    "toke@gmail.com"

            );
            repository.saveAll(
                    List.of(shishu,Toke)
            );
        };

    }
}

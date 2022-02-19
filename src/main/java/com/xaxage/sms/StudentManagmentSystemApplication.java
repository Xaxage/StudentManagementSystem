package com.xaxage.sms;

import com.xaxage.sms.model.Student;
import com.xaxage.sms.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagmentSystemApplication.class, args);
    }


    private final StudentRepository studentRepository;

    public StudentManagmentSystemApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Xaxage", "Xaxagyan", "xaxage@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("z", "z", "z@gmail.com");
        studentRepository.save(student2);
    }
}

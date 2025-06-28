package com.example.CouirseBooking.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int StudentId;
    private String name;
    private  String emailId;
    private String courseId;

    public Students(String name, String emailId, String courseId) {

        this.name = name;
        this.emailId = emailId;
        this.courseId = courseId;
    }
}

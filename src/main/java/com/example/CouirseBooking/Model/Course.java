package com.example.CouirseBooking.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Course {
    @Id
    private String CourseId;
    private String courseName;
    private String trainer;
    private int durationInWeek;
}

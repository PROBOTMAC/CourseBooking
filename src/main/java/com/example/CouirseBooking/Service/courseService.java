package com.example.CouirseBooking.Service;


import com.example.CouirseBooking.Model.Course;
import com.example.CouirseBooking.Model.Students;
import com.example.CouirseBooking.Repository.courseRepo;
import com.example.CouirseBooking.Repository.studentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class courseService {
    private  final courseRepo repo;
    private  final studentsRepo stdRepo;

    @Autowired
    public courseService(courseRepo repo,studentsRepo stdRepo) {
        this.repo = repo;
        this.stdRepo = stdRepo;
    }


    public List<Course> getCourses() {
        return repo.findAll();

    }

    public List<Students> getEnrolledStudents() {
        return stdRepo.findAll();
    }

    public void courseRegister(String name, String emailId, String courseId) {
        Students std = new Students(name,emailId,courseId);
        stdRepo.save(std);

    }
    public String getCourseNameById(String courseId) {
        Optional<Course> course = repo.findById(courseId);
        return course.map(Course::getCourseName).orElse("Unknown course");

    }
}

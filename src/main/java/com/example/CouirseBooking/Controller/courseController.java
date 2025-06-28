package com.example.CouirseBooking.Controller;

import com.example.CouirseBooking.Model.Course;
import com.example.CouirseBooking.Model.Students;
import com.example.CouirseBooking.Repository.studentsRepo;
import com.example.CouirseBooking.Service.courseService;
import org.hibernate.sql.ast.tree.expression.SqlTuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:5500")
public class courseController {

    private final courseService service;

    @Autowired
    public courseController(courseService service) {
        this.service = service;
    }

    @GetMapping("courses")
    public List<Course> getCourses(){
        return service.getCourses();
    }
    @GetMapping("courses/enrolled")
    public List<Students>getEnrolledStudents(){

        return service.getEnrolledStudents();
    }

    @PostMapping("course/register")
    public String courseRegister(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("courseId") String courseId){
        service.courseRegister(name,emailId,courseId);
        String courseName = service.getCourseNameById(courseId);
        return "Congratulation "+name+" for Registering "+courseName;
    }

}

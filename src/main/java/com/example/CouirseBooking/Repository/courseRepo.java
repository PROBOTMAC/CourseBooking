package com.example.CouirseBooking.Repository;


import com.example.CouirseBooking.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo extends JpaRepository<Course,String> {

}

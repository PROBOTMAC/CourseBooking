package com.example.CouirseBooking.Repository;


import com.example.CouirseBooking.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentsRepo extends JpaRepository<Students,Integer> {
}

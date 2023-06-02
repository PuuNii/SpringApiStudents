package com.waheed.studentapi.Repository;
import com.waheed.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student , Long > {



}

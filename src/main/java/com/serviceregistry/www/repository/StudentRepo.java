package com.serviceregistry.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serviceregistry.www.entity.Student;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Long>{

	 Student findByDepartmentid(int departmentId);



}

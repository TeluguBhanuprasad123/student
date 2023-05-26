package com.serviceregistry.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceregistry.www.entity.Student;
import com.serviceregistry.www.externalclient.Departmentclient;
import com.serviceregistry.www.reponse.Departmentreponse;
import com.serviceregistry.www.reponse.Studentresponse;
import com.serviceregistry.www.repository.StudentRepo;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

    @Autowired
    private Departmentclient departmentClient;

    @Autowired
    private StudentRepo studentRepository;

    

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return ResponseEntity.ok(savedStudent);
    }

    
    @GetMapping("/departments/{departmentId}/students")
    public Studentresponse getStudentsByDepartmentId(@PathVariable int departmentId) {
        // Fetch department details
        Departmentreponse department = departmentClient.getDepartmentById(departmentId);

        // Fetch student details for the department
        Studentresponse student = getStudentDetailsByDepartmentId(departmentId); // Updated method name

        // Set the department details and student details in the response object
        Studentresponse response = new Studentresponse();
        response.setDepartment(department); // Updated setter method

        response.setStudentId(student.getStudentId());
        response.setFirstName(student.getFirstName());
        response.setLastName(student.getLastName());
        response.setEmail(student.getEmail());

        return response;
    }

    private Studentresponse getStudentDetailsByDepartmentId(int departmentId) {
        // Replace this with your actual implementation to retrieve student details based on the departmentId
        // For now, this is a sample implementation

        // Assuming you have a student repository or service to fetch student details
        Student student = studentRepository.findByDepartmentid(departmentId);

        // Create and return the Studentresponse object
        if (student != null) {
            Departmentreponse department = departmentClient.getDepartmentById(student.getDepartmentid());
            return new Studentresponse(
                student.getStudentId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                department
            );
        } else {
            // Return null or handle the case when student details are not found
            return null;
        }
    }



  
}

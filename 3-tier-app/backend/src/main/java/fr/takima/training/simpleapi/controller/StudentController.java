package fr.takima.training.simpleapi.controller;

import fr.takima.training.simpleapi.model.Student;
import fr.takima.training.simpleapi.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/{department}/students")
    public List<Student> getStudentsByDepartment(@PathVariable String department) {
        return studentRepository.findByDepartment_Name(department);
    }
}

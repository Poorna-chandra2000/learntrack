package service;

import entity.Student;
import exception.EntityNotFoundException;
import utils.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(String fn, String ln, String email, String batch) {
        students.add(new Student(
                IdGenerator.getNextStudentId(),
                fn, ln, email, batch
        ));
    }

    public List<Student> listStudents() {
        return students;
    }

    public Student findStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new EntityNotFoundException("Student not found"));
    }

    public void deactivateStudent(int id) {
        findStudentById(id).setActive(false);
    }
}


package service;

import entity.Enrollment;
import enums.EnrollmentStatus;
import utils.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(int studentId, int courseId) {
        enrollments.add(new Enrollment(
                IdGenerator.getNextEnrollmentId(),
                studentId, courseId
        ));
    }

    public List<Enrollment> getEnrollmentsByStudent(int studentId) {
        List<Enrollment> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getStudentId() == studentId) {
                result.add(e);
            }
        }
        return result;
    }

    public void updateStatus(Enrollment e, EnrollmentStatus status) {
        e.setStatus(status);
    }
}


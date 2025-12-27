package service;

import entity.Course;
import exception.EntityNotFoundException;
import utils.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public void addCourse(String name, String desc, int weeks) {
        courses.add(new Course(
                IdGenerator.getNextCourseId(),
                name, desc, weeks
        ));
    }

    public List<Course> listCourses() {
        return courses;
    }

    public Course findCourseById(int id) {
        return courses.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(()->new EntityNotFoundException("Course not found"));
    }

    public void deactivateCourse(int id) {
        findCourseById(id).setActive(false);
    }
}


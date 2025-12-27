import service.CourseService;
import service.EnrollmentService;
import service.StudentService;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while (true) {
            try {
                System.out.println("\n1 Add Student");
                System.out.println("2 View Students");
                System.out.println("3 Add Course");
                System.out.println("4 View Courses");
                System.out.println("5 Enroll Student");
                System.out.println("0 Exit");

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1 -> {
                        System.out.print("First Name: ");
                        String fn = sc.nextLine();
                        System.out.print("Last Name: ");
                        String ln = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Batch: ");
                        String batch = sc.nextLine();
                        studentService.addStudent(fn, ln, email, batch);
                        System.out.println("Student added");
                    }

                    case 2 -> studentService.listStudents()
                            .forEach(s ->
                                    System.out.println(s.getDisplayName()));

                    case 3 -> {
                        System.out.print("Course Name: ");
                        String name = sc.nextLine();
                        courseService.addCourse(name, "Basic course", 12);
                        System.out.println("Course added");
                    }

                    case 4 -> courseService.listCourses()
                            .forEach(c ->
                                    System.out.println(c.getCourseName()));

                    case 5 -> {
                        System.out.print("Student ID: ");
                        int sid = Integer.parseInt(sc.nextLine());
                        System.out.print("Course ID: ");
                        int cid = Integer.parseInt(sc.nextLine());
                        enrollmentService.enrollStudent(sid, cid);
                        System.out.println("Enrollment successful");
                    }

                    case 0 -> {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }

                    default -> System.out.println("Invalid option");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
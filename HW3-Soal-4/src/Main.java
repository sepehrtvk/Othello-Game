import java.util.ArrayList;
import java.util.Scanner;

/**
 * the Main class that gets inputs and manages the portal program.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.03.20
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //list of courses.
        ArrayList<Course> courses = new ArrayList<Course>();
        //list of students.
        ArrayList<Student> students = new ArrayList<Student>();
        //getting course input.
        int courseNumberInput = scan.nextInt();
        for (int i = 0; i < courseNumberInput; i++) {
            Course course = new Course(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            courses.add(course);
        }
        //getting students input.
        int studentNumberInput = scan.nextInt();
        for (int i = 0; i < studentNumberInput; i++) {
            Student student = new Student(scan.next(), scan.nextInt(), scan.nextInt());
            students.add(student);
            int courseInput = scan.nextInt();
            for (int j = 0; j < courseInput; j++) {
                int courseId = scan.nextInt();
                for (int k = 0; k < courses.size(); k++) {
                    if (courses.get(k).getCourseId() == courseId) {
                        student.addCourse(courses.get(k));
                        courses.get(k).addStudent(student);
                    }
                }
            }
        }
        //changing student' courses.(add or remove)
        int studentInput = scan.nextInt();
        for (int j = 0; j < studentInput; j++) {
            String name = scan.next();
            int input2 = scan.nextInt();
            for (int y = 0; y < input2; y++) {
                int courseId = scan.nextInt();
                for (Student std : students) {
                    for (Course crs : courses) {
                        if (std.getStudentName().equals(name) && crs.getCourseId() == courseId && !std.courses.contains(crs)) {
                            std.addCourse(crs);
                            crs.addStudent(std);
                        } else if (std.getStudentName().equals(name) && crs.getCourseId() == courseId && std.courses.contains(crs)) {
                            std.removeCourse(crs);
                            crs.removeStudent(std);
                        }
                    }
                }
            }
        }
        //printing courses.
        for (Course course : courses) {
            course.printCourse();
        }
        //printing students.
        for (Student student : students) {
            student.printStudentInformation();
        }
    }
}

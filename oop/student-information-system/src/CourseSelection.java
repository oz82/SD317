import java.util.ArrayList;
import java.util.HashMap;

public class CourseSelection {
    static HashMap<Course, ArrayList<Student>> mapCourseStudents;

    static void selectCourse(Course course, Student student) {
        if (mapCourseStudents == null) mapCourseStudents = new HashMap<>();
        ArrayList<Student> listStudent = mapCourseStudents.get(course);
        if (listStudent == null) {
            listStudent = new ArrayList<Student>();
        }
        listStudent.add(student);
        mapCourseStudents.put(course, listStudent);
    }

    static void listStudents(Course course) {
        ArrayList<Student> listStudent = mapCourseStudents.get(course);
        for (Student s : listStudent) {
            System.out.println(s);
        }
    }
}
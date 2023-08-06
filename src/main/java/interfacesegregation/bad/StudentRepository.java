package interfacesegregation.bad;

import interfacesegregation.Course;
import interfacesegregation.Student;

public interface StudentRepository {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(Student student);

    void addCourse(Course course);

    void editCourse(Course course);

    void deleteCourse(Course course);

}

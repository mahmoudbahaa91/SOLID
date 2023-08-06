package interfacesegregation.good;

import interfacesegregation.Course;

public interface CourseRepository {

    void addCourse(Course course);

    void editCourse(Course course);

    void deleteCourse(Course course);

}

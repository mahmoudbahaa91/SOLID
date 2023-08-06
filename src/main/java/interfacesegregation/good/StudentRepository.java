package interfacesegregation.good;

import interfacesegregation.Student;

public interface StudentRepository {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(Student student);

}

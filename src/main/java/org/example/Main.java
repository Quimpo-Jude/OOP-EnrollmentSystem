package org.example;
import org.example.model.Course;
import org.example.model.Student;
import org.example.service.CourseRegistratiion;
import org.example.service.StudentRegistration;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {

        StudentRegistration studentRegistration = new StudentRegistration();
        CourseRegistratiion courseRegistratiion = new CourseRegistratiion();

        studentRegistration.addStudent(new Student("John", "2023","IT"));
        studentRegistration.addStudent(new Student("Ash", "2024", "CS"));
        studentRegistration.displayAll();
        studentRegistration.updateStudentRecord(new Student("John", "2023", "CS"));
        studentRegistration.displayAll();
        studentRegistration.deleteStudentRecord("2024");
        studentRegistration.displayAll();

        courseRegistratiion.addCourse(new Course("Interprog", "01", "IT"));
        courseRegistratiion.addCourse(new Course("ITsyde", "02", "CS"));
        courseRegistratiion.displayAll();
        courseRegistratiion.updateCourseRecord(new Course("ITsyde", "02", "IT"));
        courseRegistratiion.displayAll();
        courseRegistratiion.deleteCourseRecord("02");

    }

}

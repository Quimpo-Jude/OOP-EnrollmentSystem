package org.example.service;
import org.example.model.Course;

public interface CourseReg {
    void addCourse(Course course);
    void displayAll();
    void updateCourseRecord(Course course);
    String deleteCourseRecord(String courseID);
}

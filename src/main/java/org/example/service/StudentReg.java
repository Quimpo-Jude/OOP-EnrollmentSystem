package org.example.service;
import org.example.model.Student;
public interface StudentReg {
    void addStudent(Student student);
    void displayAll();
    void updateStudentRecord(Student student);
    String deleteStudentRecord(String studentID);}

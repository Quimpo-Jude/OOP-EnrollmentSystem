package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    Student student = new Student();
    student.setName("John Doe");
    student.setStudentID("000123");
    student.setProgram("Information Technology");
    Student student1 = new Student();
    student1.setName("Jane Doe");
    student1.setStudentID("000124");
    student1.setProgram("Information Technology");

    Course cor = new Course();
    cor.setCourseName("Integrative Programming");
    cor.setCourseID("00001");
    cor.setProgram("Information Technology");
    System.out.println("Student ID: " + student.getStudentID());
    System.out.println("Student Name: " + student.getName());
    System.out.println("Program: " + student.getProgram());
    System.out.println("-------------------------------------");
    System.out.println("Student ID: " + student1.getStudentID());
    System.out.println("Student Name: " + student1.getName());
    System.out.println("Program: " + student1.getProgram());
    System.out.println("-------------------------------------");
    System.out.println("Course ID: " + cor.getCourseID());
    System.out.println("Course Name: " + cor.getCourseName());
    System.out.println("Program: " + cor.getProgram());
    }

}

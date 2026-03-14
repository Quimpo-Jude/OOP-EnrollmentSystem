package org.example.model;

import java.util.ArrayList;

public class Instructor extends Person {
    private String Courses;
    public void mainTask(){
        System.out.println("Teach");
    }
    public Instructor() {
    }
    public Instructor(String personName, String personID, String Course) {
        super(personName, personID);
        this.Courses = Courses;
    }
    public String getCourses(){
        return Courses;
    }
    public void Courses(String Courses){
        this.Courses = Courses;
    }
}
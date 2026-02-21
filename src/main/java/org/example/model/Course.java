package org.example;

public class Course {
    private String courseName;
    private String courseID;
    private String program;

    public Course(){

    }
    public Course(String courseName, String courseID, String program){
        this.courseName = courseName;
        this.courseID = courseID;
        this.program = program;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseID(){
        return courseID;
    }
    public String getProgram(){
        return program;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public void setProgram(String program){
        this.program = program;
    }
}

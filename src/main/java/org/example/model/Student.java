package org.example.model;

public class Student {
    private String name;
    private String studentID;
    private String program;

    public Student(){

    }
    public Student(String studentID) {
        this.studentID = studentID;
    }
    public Student(String name, String studentID, String program){
        this.name = name;
        this.studentID = studentID;
        this.program = program;

    }
    public String getName(){
        return name;
    }
    public String getStudentID(){
        return studentID;
    }
    public String getProgram(){
        return program;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}

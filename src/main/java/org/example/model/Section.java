package org.example.model;

import java.util.List;

public class Section {
    private String sectionID;
    private String sectionName;
    private List<Student> studentList;
    private int maxCap;
    private Instructor assignedInstructor;

    public Section(String sectionID, String sectionName, List<Student> studentList, int maxCapacity){
        this.sectionID = sectionID;
        this.sectionName = sectionName;
        this.studentList = studentList;
        this.maxCap = maxCapacity;
    }

    public String getSectionID() {
        return sectionID;
    }

    public String getSectionName(){
        return sectionName;
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public int getMaxCap(){
        return maxCap;
    }

    public void setMaxCap(int maxCap){
        this.maxCap = maxCap;
    }

    public Instructor getAssignedInstructor(){
        return assignedInstructor;
    }

    public void setAssignedInstructor(Instructor assignedInstructor){
        this.assignedInstructor = assignedInstructor;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionID='" + sectionID + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", studentList=" + studentList +
                ", maxCapacity=" + maxCap +
                '}';
    }
}
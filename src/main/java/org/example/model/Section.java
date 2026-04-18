package org.example.model;

import java.util.List;

public class Section {
    private String sectionID;
    private String sectionName;
    private List<Student> studentList;

    public Section(String sectionID, String sectionName, List<Student> studentList){
        this.sectionID = sectionID;
        this.sectionName = sectionName;
        this.studentList = studentList;
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

    @Override
    public String toString() {
        return "Section{" +
                "sectionID='" + sectionID + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

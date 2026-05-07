package org.example.model;
import java.util.List;

public class Department {
    private String departmentID;
    private String departmentName;
    private List<Instructor> instructorList;
    private List<Section> sectionList;

    public Department(String departmentID, String departmentName,List<Instructor> instructoList,List<Section> sectionList){
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.instructorList = instructoList;
        this.sectionList = sectionList;
    }
    public String getDepartmentID(){
        return departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }
    public List<Section> getSectionList(){
        return sectionList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", instructorList=" + instructorList +
                ", sectionList=" + sectionList +
                '}';
    }
}


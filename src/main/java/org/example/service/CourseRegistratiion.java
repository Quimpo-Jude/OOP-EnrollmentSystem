package org.example.service;
import org.example.model.Course;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class CourseRegistratiion implements CourseReg{
    private ArrayList<Course> courseLists = new ArrayList();
    @Override
    public void addCourse (Course course){
        courseLists.add(course);
    }
    @Override
    public void displayAll(){

        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.printf("%-15s | %-40s | %-10s%n", "COURSE ID", "COURSE NAME", "PROGRAM");
        System.out.println("------------------------------------------------------------------------------------------");

        for (Course c : courseLists){
            System.out.printf("%-15s | %-40s | %-10s%n",
                    c.getCourseID(),
                    c.getCourseName(),
                    c.getProgram());
        }

        System.out.println("------------------------------------------------------------------------------------------\n");
    }
    @Override
    public void updateCourseRecord(Course course){
        for(int i = 0; i < courseLists.size(); i++){
            if(courseLists.get(i).getCourseID().equals(course.getCourseID())){
                courseLists.set(i, course);
                break;
            }
        }
    }
    @Override
    public String deleteCourseRecord(String courseID){
        for(int i = 0; i< courseLists.size(); i++){
            if(courseLists.get(i).getCourseID().equals(courseID)){
                courseLists.remove(i);
                return "Success";
            }

        }
        return "Error";
    }
}

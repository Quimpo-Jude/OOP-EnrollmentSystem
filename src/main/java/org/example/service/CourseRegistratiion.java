package org.example.service;
import org.example.model.Course;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class CourseRegistratiion {
    private ArrayList<Course> courseLists = new ArrayList();
    public void addCourse (Course course){
        courseLists.add(course);
    }
    public void displayAll(){
        for (Course c : courseLists){
            System.out.println(c.getCourseName());
            System.out.println(c.getProgram());
            System.out.println(c.getCourseID());
        }
    }
    public void updateCourseRecord(Course course){
        for(int i = 0; i < courseLists.size(); i++){
            if(courseLists.get(i).getCourseID().equals(course.getCourseID())){
                courseLists.set(i, course);
                break;
            }
        }
    }
    public void deleteCourseRecord(String courseID){
        for(int i = 0; i< courseLists.size(); i++){
            if(courseLists.get(i).getCourseID().equals(courseID)){
                courseLists.remove(i);
                break;
            }

        }
    }
}

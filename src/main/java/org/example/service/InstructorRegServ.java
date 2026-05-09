package org.example.service;

import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorRegServ implements InstructorRegistration{

    private List<Instructor> instructorList;

    public InstructorRegServ(){
        instructorList = new ArrayList<>();
    }

    @Override
    public void saveInstructor(Instructor instructor){

        for(Instructor i : instructorList){
            if(i.getPersonID().equals(instructor.getPersonID())){
                System.out.println("Duplicate Instructor ID.");
                return;
            }
        }

        instructorList.add(instructor);
    }

    public List<Instructor> displayAll(){

        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.printf("%-15s | %-30s | %-20s%n", "ID", "NAME", "COURSE");
        System.out.println("------------------------------------------------------------------------------------------");

        for(Instructor i : instructorList){
            System.out.printf("%-15s | %-30s | %-20s%n",
                    i.getPersonID(),
                    i.getPersonName(),
                    i.getCourses());
        }

        System.out.println("------------------------------------------------------------------------------------------\n");

        return instructorList;
    }
}
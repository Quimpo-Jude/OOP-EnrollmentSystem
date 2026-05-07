package org.example.service;

import org.example.model.Student;
import org.example.model.Section;

import java.util.ArrayList;
import java.util.List;

public class SectionRegistrationS implements SectionRegistration{
    private List<Student> studentList;
    private List<Section> sectionList;

    public SectionRegistrationS(){
        this.sectionList = new ArrayList<>();
        this.studentList = new ArrayList<>();

    }
    @Override
    public void addSection(Section section){
        sectionList.add(section);
    }
    @Override
    public List<Section> displayAll(){

        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.printf("%-15s | %-40s | %-10s%n", "SECTION ID", "SECTION NAME", "STUDENTS");
        System.out.println("------------------------------------------------------------------------------------------");

        for (Section s : sectionList){
            System.out.printf("%-15s | %-40s | %-10s%n",
                    s.getSectionID(),
                    s.getSectionName(),
                    s.getStudentList().size());
        }

        System.out.println("------------------------------------------------------------------------------------------\n");

        return sectionList.stream().toList();
    }

}

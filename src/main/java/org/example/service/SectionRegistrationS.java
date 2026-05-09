package org.example.service;

import org.example.exception.SectionFullExcep;
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
        System.out.printf("%-15s | %-25s | %-15s | %-15s%n", "SECTION ID", "SECTION NAME", "STUDENTS", "CAPACITY");
        System.out.println("------------------------------------------------------------------------------------------");

        for (Section s : sectionList){
            System.out.printf("%-15s | %-25s | %-15s | %-15s%n",
                    s.getSectionID(),
                    s.getSectionName(),
                    s.getStudentList().size(),
                    s.getStudentList().size() + "/" + s.getMaxCap());
        }

        System.out.println("------------------------------------------------------------------------------------------\n");

        return sectionList.stream().toList();
    }

    @Override
    public void enrollStudent(Section section, Student student) throws SectionFullExcep {

        if(section.getStudentList().size() >= section.getMaxCap()){
            throw new SectionFullExcep("Section is already full.");
        }

        section.getStudentList().add(student);
    }
}
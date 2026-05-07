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
        return sectionList.stream().toList();
    }

}

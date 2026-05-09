package org.example.service;

import org.example.exception.SectionFullExcep;
import org.example.model.Section;
import org.example.model.Student;

import java.util.List;

public interface SectionRegistration {
    void addSection(Section section);

    List<Section> displayAll();

    void enrollStudent(Section section, Student student) throws SectionFullExcep;
}
package org.example.service;
import org.example.exception.SectionFullExcep;
import org.example.model.Section;
import org.example.model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentServiceTest {

    @Test
    public void testEnrollStudentSuccessfully() {
        Section section = new Section(
                "SEC1",
                "BSIT-1A",
                new ArrayList<>(),
                2
        );

        Student student = new Student(
                "John",
                "S001",
                "BSIT"
        );

        SectionRegistrationS service = new SectionRegistrationS();

        service.enrollStudent(section, student);

        assertEquals(1, section.getStudentList().size());
    }

    @Test
    public void testEnrollStudentSectionFull() {
        Section section = new Section(
                "SEC1",
                "BSIT-1A",
                new ArrayList<>(),
                1
        );

        Student student1 = new Student(
                "John",
                "S001",
                "BSIT"
        );

        Student student2 = new Student(
                "Jane",
                "S002",
                "BSIT"
        );

        SectionRegistrationS service = new SectionRegistrationS();

        service.enrollStudent(section, student1);

        assertThrows(
                SectionFullExcep.class,
                () -> service.enrollStudent(section, student2)
        );
    }
}
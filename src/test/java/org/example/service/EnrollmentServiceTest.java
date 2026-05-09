package org.example.service;

import org.example.exception.SectionFullExcep;
import org.example.model.Section;
import org.example.model.Student;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentServiceTest {

    @Test
    public void testEnrollStudent_SectionIsFull_FailsToEnroll() throws SectionFullExcep {
        // 1. ARRANGE: Set up a section with a max capacity of 2
        Section testSection = new Section("SEC1", "BSIT-1A", new ArrayList<>(), 2);
        Student student1 = new Student("Alice", "S01", "BSIT");
        Student student2 = new Student("Bob", "S02", "BSIT");
        Student student3 = new Student("Charlie", "S03", "BSIT"); // The extra student

        SectionRegistrationS enrollmentService = new SectionRegistrationS();

        // Fill the section to capacity
        enrollmentService.enrollStudent(testSection, student1);
        enrollmentService.enrollStudent(testSection, student2);

        // 2. ACT + 3. ASSERT: Verify the enrollment was rejected via Exception
        assertThrows(SectionFullExcep.class, () -> {
            enrollmentService.enrollStudent(testSection, student3);
        }, "The system should have thrown SectionFullExcep!");

        // Verify section size stayed at 2
        assertEquals(2, testSection.getStudentList().size(), "Section size should remain 2.");
    }
}
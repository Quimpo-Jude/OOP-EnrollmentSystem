package org.example.service;
import org.example.model.Student;

import java.util.ArrayList;

public class StudentRegistration implements StudentReg{
    private ArrayList<Student> studentLists = new ArrayList();

    @Override
    public void addStudent(Student student){
        studentLists.add(student);
    }
    @Override
    public void displayAll() {
        System.out.println("\n------------------------------------------------------------------------------------------");
        // This creates a header with specific spacing
        System.out.printf("%-15s | %-40s | %-10s%n", "ID", "NAME", "PROGRAM");
        System.out.println("------------------------------------------------------------------------------------------");

        for (Student s : studentLists) {
            // %-15s means: String, left-justified, 15 characters wide
            System.out.printf("%-15s | %-40s | %-10s%n",
                    s.getPersonID(),
                    s.getPersonName(),
                    s.getProgram());
        }
        System.out.println("------------------------------------------------------------------------------------------\n");
    }
    @Override
    public void updateStudentRecord(Student student){
        for(int i = 0; i<studentLists.size(); i++){
            if(studentLists.get(i).getPersonID().equals(student.getPersonID())){
                studentLists.set(i , student);
                break;
            }
        }
    }
    @Override
    public String deleteStudentRecord(String studentID) {
        for (int i = 0; i < studentLists.size(); i++) {
            if (studentLists.get(i).getPersonID().equals(studentID)) {
                studentLists.remove(i);
                return "Success";
            }
        }

        return "Error";
    }
}

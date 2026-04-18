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
    public void displayAll(){
        for (Student s : studentLists){
            System.out.println(s.getPersonName());
            System.out.println(s.getPersonID());
            System.out.println(s.getProgram());
        }
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

package org.example.service;
import org.example.model.Student;

import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> studentLists = new ArrayList();

    public void addStudent(Student student){
        studentLists.add(student);
    }
    public void displayAll(){
        for (Student s : studentLists){
            System.out.println(s.getPersonName());
            System.out.println(s.getPersonID());
            System.out.println(s.getProgram());
        }
    }
    public void updateStudentRecord(Student student){
        for(int i = 0; i<studentLists.size(); i++){
            if(studentLists.get(i).getPersonID().equals(student.getPersonID())){
                studentLists.set(i , student);
                break;
            }
        }
    }
    public void deleteStudentRecord(String studentID){
        for(int i = 0; i<studentLists.size(); i++){
            if(studentLists.get(i).getPersonID().equals(studentID)){
                studentLists.remove(i);
                break;
            }
        }
    }

}

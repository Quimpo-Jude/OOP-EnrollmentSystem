package org.example;
import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Student;
import org.example.model.Section;
import org.example.service.SectionRegistrationS;
import org.example.service.*;
import org.example.service.DepartmentRegistrationService;
import java.util.List;
import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        StudentRegistration studentreg = new StudentRegistration();
        CourseRegistratiion course = new CourseRegistratiion();
        Scanner scan = new Scanner(System.in);
        int ch1;

        do {
            System.out.print("----------------------------------\n\t\tEnrollment System\n----------------------------------\nWelcome! \nHow may I assist you today? \n[1] Student Management \n[2] Course Management \n[3] Enrollment \n[4] Tuition Fee Payment \n[5] View Departments \n[0] Exit \nEnter your choice: ");
            ch1 = scan.nextInt();
            switch (ch1) {
                case 1:
                    //Student Man
                    System.out.println("----------------------------------\n\t\tStudent Management\n----------------------------------\n[1] Add Student \n[2] View All Students \n[3] Update Student \n[4] Remove Student \n[0] Back");
                    int stch1 = scan.nextInt();
                    scan.nextLine();
                    switch(stch1){
                        case 1:
                            System.out.print("Enter Student Name: ");
                            String name = scan.nextLine();

                            System.out.print("Enter Student ID: ");
                            String id = scan.nextLine();

                            System.out.print("Enter Program: ");
                            String program = scan.nextLine();

                            Student student = new Student(name, id, program);
                            studentreg.addStudent(student);

                            System.out.println("Successfully added student");
                            break;
                        case 2:
                            studentreg.displayAll();

                    }
                    break;
                case 2:
                    //Course Man
                    System.out.println("----------------------------------\n\t\tCourse Management\n----------------------------------\n[1] Add Course \n[2] View Courses \n[3] Update Course \n[4] Remove Course \n[0] Back");
                    break;
                case 3:
                    //Enrollment Management
                    System.out.println("----------------------------------\n\t\tEnrollment Management\n----------------------------------\n[1] Create Section \n[3] View Sections \n[4] Enroll Student \n[0] Back");
                    break;
                case 4:
                    //Tuition
                    System.out.println("----------------------------------\n\t\tTuition Fee Payment\n----------------------------------\n[1] Calculate Tuition \n[2] Make Payment \n[3] View Balance \n[0] Back");
                    break;
                case 5:
                    //Dept
                    System.out.println("----------------------------------\n\t\tDepartment Overview\n----------------------------------");
                    break;
                case 0:
                    System.out.println("Until next time");
                    break;
                default:
                    System.out.println("Please try again");
                    break;
            }

        }
        while (ch1 != 0);
        scan.close();

    }
}

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
public class Main {
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("----------------------------------\n\t\tEnrollment System\n----------------------------------\nWelcome! \nHow may I assist you today? \n[1] Student Management \n[2] Course Management \n[3] Enrollment \n[4] Tuition Fee Payment \n[5] View Departments \n[0] Exit \nEnter your choice: ");

    //Student Man
    System.out.println("----------------------------------\n\t\tStudent Management\n----------------------------------\n[1] Add Student \n[2] View All Students \n[3] Update Student \n[4] Remove Student \n[0] Back");

    //Course Man
    System.out.println("----------------------------------\n\t\tCourse Management\n----------------------------------\n[1] Add Course \n[2] View Courses \n[3] Update Course \n[4] Remove Course \n[0] Back");

    //Enrollment Management
    System.out.println("----------------------------------\n\t\tStudent Management\n----------------------------------\n[1] Create Section \n[3] View Sections \n[4] Enroll Student \n[0] Back");

    //Tuition
    System.out.println("----------------------------------\n\t\tStudent Management\n----------------------------------\n12] Calculate Tuition \n[2] Make Payment \n[3] View Balance \n[0] Back");

    //Dept
    System.out.println("----------------------------------\n\t\tDepartment Overview\n----------------------------------");
    }

}

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
        SectionRegistrationS sectionreg = new SectionRegistrationS();
        TuitionFeePayment tuition = new TuitionFeePayment();
        DepartmentRegistrationService dept = new DepartmentRegistrationService();

        Scanner scan = new Scanner(System.in);
        int ch1;

        do {
            System.out.print("----------------------------------\n\t\tEnrollment System\n----------------------------------\nWelcome! \nHow may I assist you today? \n[1] Student Management \n[2] Course Management \n[3] Enrollment \n[4] Tuition Fee Payment \n[5] View Departments \n[0] Exit \nEnter your choice: ");
            ch1 = scan.nextInt();
            switch (ch1) {
                case 1:
                    int stch1;
                    do{
                        System.out.println("----------------------------------\n\t\tStudent Management\n----------------------------------\n[1] Add Student \n[2] View All Students \n[3] Update Student \n[4] Remove Student \n[0] Back");
                        stch1 = scan.nextInt();
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
                                break;

                            case 3:
                                System.out.print("Enter Student ID: ");
                                String updid = scan.nextLine();

                                System.out.print("Enter Updated Student Name: ");
                                String updname = scan.nextLine();

                                System.out.print("Enter Updated Program: ");
                                String updprogram = scan.nextLine();

                                Student upstudent = new Student(updname, updid, updprogram);
                                studentreg.updateStudentRecord(upstudent);

                                System.out.println("Successfully updated student");
                                break;

                            case 4:
                                System.out.print("Enter Student ID to Remove: ");
                                String delid = scan.nextLine();

                                System.out.println(studentreg.deleteStudentRecord(delid));
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Please try again");
                                break;
                        }

                    }while(stch1 != 0);

                    break;

                case 2:
                    int cch1;

                    do{
                        System.out.println("----------------------------------\n\t\tCourse Management\n----------------------------------\n[1] Add Course \n[2] View Courses \n[3] Update Course \n[4] Remove Course \n[0] Back");

                        cch1 = scan.nextInt();
                        scan.nextLine();

                        switch(cch1){

                            case 1:
                                System.out.print("Enter Course Name: ");
                                String cname = scan.nextLine();

                                System.out.print("Enter Course ID: ");
                                String cid = scan.nextLine();

                                System.out.print("Enter Program: ");
                                String cprog = scan.nextLine();

                                Course course1 = new Course(cname, cid, cprog);
                                course.addCourse(course1);

                                System.out.println("Successfully added course");
                                break;

                            case 2:
                                course.displayAll();
                                break;

                            case 3:
                                System.out.print("Enter Course ID: ");
                                String ucid = scan.nextLine();

                                System.out.print("Enter Updated Course Name: ");
                                String ucname = scan.nextLine();

                                System.out.print("Enter Updated Program: ");
                                String ucprog = scan.nextLine();

                                Course upcourse = new Course(ucname, ucid, ucprog);
                                course.updateCourseRecord(upcourse);

                                System.out.println("Successfully updated course");
                                break;

                            case 4:
                                System.out.print("Enter Course ID to Remove: ");
                                String dcid = scan.nextLine();

                                System.out.println(course.deleteCourseRecord(dcid));
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Please try again");
                                break;
                        }

                    }while(cch1 != 0);

                    break;

                case 3:
                    int ench1;

                    do{
                        System.out.println("----------------------------------\n\t\tEnrollment Management\n----------------------------------\n[1] Create Section \n[2] View Sections \n[3] Enroll Student \n[0] Back");

                        ench1 = scan.nextInt();
                        scan.nextLine();

                        switch(ench1){

                            case 1:
                                System.out.print("Enter Section ID: ");
                                String secid = scan.nextLine();

                                System.out.print("Enter Section Name: ");
                                String secname = scan.nextLine();

                                List<Student> studentList = new ArrayList<>();

                                Section sec = new Section(secid, secname, studentList);
                                sectionreg.addSection(sec);

                                System.out.println("Successfully added section");
                                break;

                            case 2:
                                List<Section> sections = sectionreg.displayAll();

                                for(Section s : sections){
                                    System.out.println("Section ID: " + s.getSectionID());
                                    System.out.println("Section Name: " + s.getSectionName());
                                    System.out.println("Students: " + s.getStudentList());
                                }
                                break;

                            case 3:
                                System.out.print("Enter Student Name: ");
                                String enname = scan.nextLine();

                                System.out.print("Enter Student ID: ");
                                String enid = scan.nextLine();

                                System.out.print("Enter Program: ");
                                String enprog = scan.nextLine();

                                Student enstudent = new Student(enname, enid, enprog);

                                List<Section> seclist = sectionreg.displayAll();

                                for(int i = 0; i < seclist.size(); i++){
                                    System.out.println("[" + i + "] " + seclist.get(i).getSectionName());
                                }

                                System.out.print("Choose Section: ");
                                int secchoice = scan.nextInt();

                                seclist.get(secchoice).getStudentList().add(enstudent);

                                System.out.println("Successfully enrolled student");
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Please try again");
                                break;
                        }

                    }while(ench1 != 0);

                    break;

                case 4:
                    int tch1;

                    do{
                        System.out.println("----------------------------------\n\t\tTuition Fee Payment\n----------------------------------\n[1] Calculate Tuition \n[2] Make Payment \n[3] View Balance \n[0] Back");

                        tch1 = scan.nextInt();

                        switch(tch1){

                            case 1:
                                System.out.print("Enter Units: ");
                                int units = scan.nextInt();

                                System.out.print("Enter Discount Rate: ");
                                double discount = scan.nextDouble();

                                System.out.println("Total Tuition Fee: " + tuition.calculateTuitionFee(units, discount));
                                break;

                            case 2:
                                System.out.print("Enter Payment Amount: ");
                                double payment = scan.nextDouble();

                                tuition.makePayment(payment);

                                System.out.println("Payment Successful");
                                break;

                            case 3:
                                System.out.println("Remaining Balance: " + tuition.getBalance());

                                if(tuition.isFullyPaid()){
                                    System.out.println("Fully Paid");
                                }
                                else{
                                    System.out.println("Not Fully Paid");
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Please try again");
                                break;
                        }

                    }while(tch1 != 0);

                    break;

                case 5:
                    System.out.println("----------------------------------\n\t\tDepartment Overview\n----------------------------------");
                    dept.displayAll();
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
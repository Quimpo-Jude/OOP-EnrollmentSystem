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
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {

        CampusRegistrar campusRegistrar = new CampusRegistrar(new CourseRegistratiion(), new StudentRegistration(), new DepartmentRegistrationService(), new SectionRegistrationS());
        //TuitionFeePayment tutionFeePayment = new TuitionFeePayment();

        //campusRegistrar.addStudent(new Student("John", "2023","IT"));
        //campusRegistrar.addStudent(new Student("Ash", "2024", "CS"));
        //campusRegistrar.displayStudent();
        //campusRegistrar.updateStudentRecord(new Student("John", "2023", "CS"));
        //campusRegistrar.displayStudent();
        //campusRegistrar.deleteStudentRecord("2024");
        //campusRegistrar.displayStudent();

        //campusRegistrar.addCourse(new Course("Interprog", "01", "IT"));
        //campusRegistrar.addCourse(new Course("ITsyde", "02", "CS"));
        //campusRegistrar.displayCourse();
        //campusRegistrar.updateCourseRecord(new Course("ITsyde", "02", "IT"));
        //campusRegistrar.displayCourse();
        //campusRegistrar.deleteCourseRecord("02");

        //System.out.println(tutionFeePayment.calculateTuitionFee(7, 0.5));
        //tutionFeePayment.makePayment(1000);

        //System.out.println(tutionFeePayment.getBalance());


        //Department
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Uan","10003","IT");
        studentList.add(student1);
        List<Instructor> instructorList = new ArrayList<>();
        Instructor instructor1 = new Instructor("John Doe","20003", "IT");
        instructorList.add(instructor1);
        List<Section> sectionList = new ArrayList<>();
        Section section1 = new Section("1234", "IT2D", studentList);
        sectionList.add(section1);
        campusRegistrar.saveDepartment("CITE","College of Information Technology and Engineering", instructorList, sectionList);
        campusRegistrar.displayDepartment();
    }

}

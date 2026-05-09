package org.example.service;

import org.example.exception.SectionFullExcep;
import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Instructor;
import org.example.model.Section;
import org.example.model.Department;

import java.util.List;

public class CampusRegistrar {

    private CourseReg courseRegistration;
    private StudentReg studentRegistration;
    private DepartmentRegistration departmentRegistration;
    private SectionRegistration sectionRegistration;

    public CampusRegistrar(CourseReg courseRegistration,
                           StudentReg studentRegistration,
                           DepartmentRegistration departmentRegistration,
                           SectionRegistration sectionRegistration) {

        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
        this.departmentRegistration = departmentRegistration;
        this.sectionRegistration = sectionRegistration;
    }

    public String addCourse(Course course) {
        courseRegistration.addCourse(course);
        return "Successfully Added Course";
    }

    public String displayCourse() {
        courseRegistration.displayAll();
        return "Successfully Displayed Courses";
    }

    public String updateCourseRecord(Course course) {
        courseRegistration.updateCourseRecord(course);
        return "Successfully Updated Records";
    }

    public String deleteCourseRecord(String courseID) {
        courseRegistration.deleteCourseRecord(courseID);
        return "Successfully Deleted Course";
    }

    public String saveDepartment(String departmentID,
                                 String departmentName,
                                 List<Instructor> instructorList,
                                 List<Section> sectionList) {

        departmentRegistration.saveDepartment(
                new Department(departmentID,
                        departmentName,
                        instructorList,
                        sectionList)
        );

        return "Successfully Added Department";
    }

    public String displayDepartment() {

        List<Department> departments = departmentRegistration.displayAll();

        if (departments.isEmpty()) {

            System.out.println("No departments found.");

        } else {

            for (Department dept : departments) {

                System.out.println(
                        "ID: " + dept.getDepartmentID() +
                                " | Name: " + dept.getDepartmentName()
                );

                for (Section sec : dept.getSectionList()) {

                    System.out.println("\tSection: " + sec.getSectionName());

                    System.out.println("\tCapacity: "
                            + sec.getStudentList().size()
                            + "/" +
                            sec.getMaxCap());

                    System.out.println("\tInstructor: "
                            + sec.getAssignedInstructor());

                    System.out.println("\tStudents: ");

                    for (Student s : sec.getStudentList()) {

                        System.out.println("\t\t"
                                + s.getPersonName()
                                + " - "
                                + s.getPersonID());
                    }
                }
            }
        }

        return "Success";
    }

    public String addSection(String sectionID,
                             String sectionName,
                             List<Student> studentList,
                             int maxCapacity) {

        sectionRegistration.addSection(
                new Section(sectionID,
                        sectionName,
                        studentList,
                        maxCapacity)
        );

        return "Success";
    }

    public String displaySection() {

        List<Section> sections = sectionRegistration.displayAll();

        if (sections.isEmpty()) {

            System.out.println("No sections found.");

        } else {

            for (Section sec : sections) {

                System.out.println(
                        "ID: " + sec.getSectionID() +
                                " | Name: " + sec.getSectionName() +
                                " | Students: " + sec.getStudentList().size() +
                                "/" + sec.getMaxCap()
                );
            }
        }

        return "Success";
    }

    public String enrollStudent(Section section,
                                Student student) {

        try {

            sectionRegistration.enrollStudent(section, student);

            return "Successfully enrolled student";

        } catch (SectionFullExcep e) {

            return e.getMessage();
        }
    }

    public String addStudent(String personID,
                             String personName,
                             String couse) {

        studentRegistration.addStudent(
                new Student(personName,
                        personID,
                        couse)
        );

        return "Success";
    }
}
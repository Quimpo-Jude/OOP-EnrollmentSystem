package org.example.service;
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

    public CampusRegistrar(CourseReg courseRegistration, StudentReg studentRegistration, DepartmentRegistration departmentRegistration, SectionRegistrationS sectionRegistration) {
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
        this.departmentRegistration = departmentRegistration;
        this.sectionRegistration = sectionRegistration;
    }

    //    public String addStudent(Student student){
//        studentRegistration.addStudent(student);
//        return "Successfully Added Student";
//    }
//    public String displayStudent(){
//        studentRegistration.displayAll();
//        return "Successfully Displayed Students";
//    }
//    public String updateStudentRecord(Student student){
//        studentRegistration.updateStudentRecord(student);
//        return "Successfully Updated Records";
//    }
//    public String deleteStudentRecord(String studentID){
//        studentRegistration.deleteStudentRecord(studentID);
//        return "Successfully Deleted Student";
//    }
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

    public String saveDepartment(String departmentID, String departmentName, List<Instructor> instructorList, List<Section> sectionList) {
        departmentRegistration.saveDepartment(new Department(departmentID, departmentName, instructorList, sectionList));
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
                                " | Name: " + dept.getDepartmentName() +
                                " | Instructors: " + dept.getInstructorList() +
                                " | Sections: " + dept.getSectionList()
                );
            }
        }
        return "Success";
    }

    public String addSection(String sectionID, String sectionName, List<Student> studentList) {
        sectionRegistration.addSection(new Section(sectionID, sectionName, studentList));
        return "Success";
    }

    public String displaySection() {
        List<Section> sections = sectionRegistration.displayAll();
        if (sections.isEmpty()) {
            System.out.println("No sections found.");
        } else {
            for (Section sec : sections) {
                System.out.println("ID: " + sec.getSectionID() +
                        " | Name: " + sec.getSectionName() +
                        " | Instructors: " + sec.getStudentList());


            }

        }
        return "Success";
    }
    public String addStudent(String personID, String personName, String couse){
        studentRegistration.addStudent(new Student(personID, personName, couse));
        return "Success";
    }

}
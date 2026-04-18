    package org.example.service;

    import org.example.model.Department;
    import org.example.model.Instructor;
    import org.example.model.Section;

    import java.util.ArrayList;
    import java.util.List;

    public class DepartmentRegistrationService implements DepartmentRegistration{
        private List<Department> departmentList;
        private List<Instructor> instructorList;
        private List<Section> sectionList;

        public DepartmentRegistrationService(){
            this.departmentList = new ArrayList<>();
            this.instructorList = new ArrayList<>();
            this.sectionList = new ArrayList<>();

        }
        @Override
        public void saveDepartment(Department department){
            departmentList.add(department);
        }
        @Override
        public List<Department> displayAll(){
            return departmentList.stream().toList();
        }

    }

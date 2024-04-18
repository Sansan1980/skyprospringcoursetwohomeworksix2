package pro.sky.skyprospringcoursetwohomeworksix;

import java.util.List;

public interface EmployeeService {
    public String addEmployee(String name, String surname) ;


    public Employee findEmployee(String name, String surname);

    public void deleteEmployee(String name, String surname);

    public List<Employee> printData();
    }

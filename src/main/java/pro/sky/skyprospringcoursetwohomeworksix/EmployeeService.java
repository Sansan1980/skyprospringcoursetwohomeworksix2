package pro.sky.skyprospringcoursetwohomeworksix;

public interface EmployeeService {
    public String addEmployee(String name, String surname) ;


    public Employee findEmployee(String name, String surname);

    public void deleteEmployee(String name, String surname);

    public String printData();
    }

package pro.sky.skyprospringcoursetwohomeworksix;

public interface EmployeeService {
    String addEmployee(String name, String surname);

    Employee findEmployee(String name, String surname);

    void deleteEmployee(String name, String surname);

    String printData();

}

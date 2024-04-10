package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeesList = new ArrayList<>();
    private final int numberEmployees = 11;

    public void addEmployee(String name, String surname) {
        employeesList.add(new Employee(name, surname));

    }
    public Employee findEmployee(String name, String surname) {
        for (Employee employee : employeesList) {
            if (employee.getName().equals(name)&&employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException ();
    }
    public void deleteEmployee(String name, String surname) {
        employeesList.remove(new Employee(name, surname));
    }



    //--//--
}

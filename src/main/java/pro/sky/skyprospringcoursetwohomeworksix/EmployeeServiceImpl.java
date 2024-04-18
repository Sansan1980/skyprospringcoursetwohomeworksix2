package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeesList = new ArrayList<>();




    private final int numberEmployees = 11;


    public String addEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeesList.size() >= numberEmployees) {
            throw new EmployeeStorageIsFullException();
        }
        if (employeesList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeesList.add(employee);
        return employee.getFulName();
    }

    public Employee findEmployee(String name, String surname) {
        for (Employee employee : employeesList) {
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

    public void deleteEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (!employeesList.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        employeesList.remove(employee);

    }

    public List<Employee> printData() {
        return employeesList;
    }

    //--//--
}

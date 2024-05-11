package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    // private List<Employee> employeesList = new ArrayList<>();
    private Map<String, Employee> employeesMap = new HashMap<>();
    private final int numberEmployees = 11;

    public String addEmployee(String name, String surname) {
        //  employeesList.add(new Employee(name, surname));
        String key = getEmployeeKey(name, surname);
        employeesMap.put(key, new Employee(name, surname));

        return key;
    }

    public Employee findEmployee(String name, String surname) {
        Employee employee = employeesMap.get(getEmployeeKey(name, surname));
        employee.hashCode();
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }

      /*  for (Employee employee : employeesList)0 {
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException();*/
        return employee;
    }

    public void deleteEmployee(String name, String surname) {
       // employeesList.remove(new Employee(name, surname));
        Employee employee = employeesMap.remove(getEmployeeKey(name, surname));
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }
    }


    public String printData() {
        return employeesMap.toString();

    }

    public static String getEmployeeKey(String name, String surname) {

        return name + " " + surname;
    }

    //--//--
}

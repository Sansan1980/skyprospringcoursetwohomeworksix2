package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping
@RestController
public class EmpioyeeController {
    private final EmployeeService employeeService;

    public EmpioyeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = ("/addEmployee"))
    public String addEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return employeeService.addEmployee(name, surname);

    }

    @GetMapping(path = ("/findEmployee"))
    public Employee findEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return employeeService.findEmployee(name, surname);
    }


    @GetMapping(path = "/deleteEmployee")
    public void deleteEmployee(@RequestParam(value = "name" ) String name, @RequestParam(value = "surname") String surname) {
        employeeService.deleteEmployee(name, surname);
    }

    @GetMapping(path = ("/printData"))
    public List<Employee> printData() {
        return employeeService.printData();
    }
}

package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpioyeeController {
    private final EmployeeService employeeService;

    public EmpioyeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = ("/addEmployee"))
    public String addEmployee(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname) {
        return employeeService.addEmployee(name, surname);

    }

    @GetMapping(path = ("/findEmployee"))
    public String findEmployee(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname) {
        return employeeService.addEmployee(name, surname);
    }


    @GetMapping(path = "/deleteEmployee")
    public void deleteEmployee(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname) {
        employeeService.deleteEmployee(name, surname);
    }

    @GetMapping(path = ("/printData"))
    public String printData() {
        return employeeService.printData();
    }
}

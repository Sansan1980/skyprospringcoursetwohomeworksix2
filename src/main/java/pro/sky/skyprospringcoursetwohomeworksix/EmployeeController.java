package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping (path = ("/addEmployee"))
    public String addEmployee(@RequestParam(value = "name" ) String name,@RequestParam(value = "surname") String surname){
        return employeeService.addEmployee(name,surname);
    }

    @GetMapping(path = ("/findEmployee"))
    public Employee findEmployee(@RequestParam(value = "name" ) String name,@RequestParam(value = "surname") String surname) {
                return  employeeService.findEmployee(name,surname);

        }

        @GetMapping(path = ("/deleteEmployee"))
    public void deleteEmployee(String name, String surname) {
        employeeService.deleteEmployee(name, surname);
    }
    @GetMapping(path = ("/printData"))
    public String printData() {
        return employeeService.printData();

    }
}

package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloservice) {
        this.helloService = helloservice;
    }

    @GetMapping

    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/Hello")
    public String fio(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return helloService.fio(name,surname);
    }

}

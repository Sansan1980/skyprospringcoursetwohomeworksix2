package pro.sky.skyprospringcoursetwohomeworksix;

import org.springframework.stereotype.Service;

@Service

public class HelloServiceImpl implements HelloService {
    public String hello() {
        return " hellllo";
    }

    public String fio(String name,String surname) {
        return "Здравствуйте " + name + " " + surname;
    }
}

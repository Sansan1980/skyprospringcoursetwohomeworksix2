package pro.sky.skyprospringcoursetwohomeworksix;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException() {
        super ("Такой сотрудник уже существует");
    }
}

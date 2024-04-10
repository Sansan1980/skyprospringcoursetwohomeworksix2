package pro.sky.skyprospringcoursetwohomeworksix;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("Сотрудник ненайден");
    }
}

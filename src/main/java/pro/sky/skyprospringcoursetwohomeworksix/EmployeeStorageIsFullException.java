package pro.sky.skyprospringcoursetwohomeworksix;

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException() {
        super("Превышен лемит количества сотрудников в фирме");
    }
}

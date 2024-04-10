package pro.sky.skyprospringcoursetwohomeworksix;

import java.util.Objects;

public class Employee {
    /*
    - **Базовая сложность**
        1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
        Отделы для простоты должны быть названы от 1 до 5.
        2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
        6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id,
         который нужно получить из счетчика).

     */
    private String name;
    private String surname;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getFulName() {

        return name + ", " + surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

package ru.leshchev.task_3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(5);
        employees.add(new Employee("Иванов Иван Иванович", 25, "Разработка", 90000.0));
        employees.add(new Employee("Петров Пётр Петрович", 30, "Продажи", 70000.0));
        employees.add(new Employee("Сидорова Анна Сергеевна", 31, "Бухгалтерия", 80000.0));
        employees.add(new Employee("Смирнов Алексей Олегович", 42, "Разработка", 120000.0));
        employees.add(new Employee("Кузнецова Мария Андреевна", 36, "Кадры", 75000.0));

        employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .forEach(System.out::println);
    }
}

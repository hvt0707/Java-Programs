package com.company.List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Harshvardhan", "Thakur", 0707));
        employeeList.add(new Employee("Samyak", "Shah", 0420));
        employeeList.add(new Employee("Kushal", "Jha2", 6969));
        employeeList.add(new Employee("Adit", "Goyal", 0000));
        //System.out.println(employeeList);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}

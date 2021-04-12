package com.company.List;

public class Main {

    public static void main(String[] args) {
	    Employee employee1 = new Employee("Harshvardhan", "Thakur", 255);
        Employee employee2 = new Employee("Samyak", "Shah", 245);
        Employee employee3 = new Employee("Kushal", "Jha2", 210);
        Employee employee4 = new Employee("Roshan", "lsdfjl", 252);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);
        System.out.println(list.size());
        list.printList();
        System.out.println(list.removeFromFront());
        System.out.println(list.size());
        list.printList();
    }
}

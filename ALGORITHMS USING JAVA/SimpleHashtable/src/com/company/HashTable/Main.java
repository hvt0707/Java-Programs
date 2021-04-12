package com.company.HashTable;

public class Main {

    public static void main(String[] args) {
        SimpleHashtable ht = new SimpleHashtable();

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ht.put(janeJones,"Jones");
        ht.put(johnDoe,"Doe");
        ht.put(marySmith,"Smith");
        ht.put(mikeWilson,"Wilson");
        ht.put(billEnd,"End");
        ht.printTable();
        System.out.println("==================================");
        //System.out.println("Retrieving employee: "+ht.get("Smith"));
        ht.remove("Jones");
        ht.remove("Wilson");
        ht.printTable();
        System.out.println("==================================");
        System.out.println("Retrieving employee: "+ht.get("Smith"));
    }
}

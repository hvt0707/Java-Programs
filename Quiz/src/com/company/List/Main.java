package com.company.List;

class Parent {

    public final void show() {

        System.out.println("Parent::show() called");

    }

}

class Child extends Base {

    public void show() {

        System.out.println("Child::show() called");

    }

}

public class Main {

    public static void main(String[] args) {

        Parent b = new Child();;

        b.show();

    }

}
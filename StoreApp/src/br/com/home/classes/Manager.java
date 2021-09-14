package br.com.home.classes;

public class Manager extends Employee {

    double wage = 25000;

    public Manager(String name, int age, String area, String store) {
        super(name, age, "Manager", area, store);
    }
}

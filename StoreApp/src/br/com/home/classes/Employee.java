package br.com.home.classes;

import br.com.home.interfaces.FuncID;

import java.util.Random;

public class Employee implements FuncID {

    private final String name;
    private final int age;
    private long id;
    private final String function;
    private final String area;
    private final String store;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getArea() {
        return area;
    }

    public String getFunction() {
        return function;
    }

    public long getId() {
        return id;
    }

    public String getStore() {
        return store;
    }

    public Employee(String name, int age, String function, String area, String store) {
        this.name = name;
        this.age = age;
        this.function = function;
        this.area = area;
        this.store = store;
        createId();
        System.out.println("A new " + function + " was created");
    }

    @Override
    public void createId() {
        Random random = new Random();
        id = random.nextInt((int) FuncID.id);
    }

    public void getDescription(){

        System.out.println("Employee name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Function: " + function);
        System.out.println("Employee ID: " + id);
        System.out.println("Store: " + store);
        System.out.println("Area: " + area);
    }
}

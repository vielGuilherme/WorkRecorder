package br.com.home.classes;

public class SubManager extends Employee{

    double wage = 15000;

    public SubManager(String name, int age, String area, String store) {
        super(name, age, "Sub Manager", area, store);
    }

    @Override
    public void getDescription() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Employee ID: " + super.getId());
        System.out.println("Function: " + super.getFunction());
        System.out.println("Store: " + super.getStore());
        System.out.println("Area: " + getArea());
    }
}

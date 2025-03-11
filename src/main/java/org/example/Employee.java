package org.example;
import java.io.*;
public class Employee implements Serializable {
    String name;
    String address;
    int age;
    int number;

    public Employee(String name, String address, int age, int number) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', address='" + address + "', age=" + age + ", number=" + number + '}';
    }
}




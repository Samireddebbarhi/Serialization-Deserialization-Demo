package org.example;
import java.io.*;
public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int age;
    public int number;
    public void mailCheck() {
        System.out.println("Sending mail to " + name+ " with address " + address);
    }

}

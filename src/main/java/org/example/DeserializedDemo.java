package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo implements Runnable {
    private final String fileName;

    public DeserializedDemo(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {

            Employee employee = (Employee) objIn.readObject();
            System.out.println("Deserialization completed. Retrieved Employee data: " + employee);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed: " + e.getMessage());
        }
    }
}



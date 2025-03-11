package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo implements Runnable {
    private final String fileName;
    private final Employee employee;

    public SerializedDemo(String fileName, Employee employee) {
        this.fileName = fileName;
        this.employee = employee;
    }

    @Override
    public void run() {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

            objOut.writeObject(employee);
            System.out.println("Serialization completed and saved to: " + fileName);

        } catch (IOException e) {
            System.err.println("Serialization failed: " + e.getMessage());
        }
    }
}




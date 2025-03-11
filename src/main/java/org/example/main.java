package org.example;

public class main {
    public static void main(String[] args) {
        String fileName = "employee.ser";
        Employee emp = new Employee("Samir", "123 Main St", 25, 123456789);
        // Create tasks
        SerializedDemo serializationTask = new SerializedDemo(fileName, emp);
        DeserializedDemo deserializationTask = new DeserializedDemo(fileName);

        Thread serializationThread = new Thread(serializationTask);
        Thread deserializationThread = new Thread(deserializationTask);

        // Start threads for parallel execution
        serializationThread.start();
        deserializationThread.start();
        try {
            serializationThread.join();
            deserializationThread.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Both threads have completed.");
    }
}


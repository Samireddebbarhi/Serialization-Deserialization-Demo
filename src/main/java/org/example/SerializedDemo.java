package org.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo {
    public static void main(String[] args) {
        {
            Employee emp = new Employee();
            emp.name = "Samir";
            emp.address = "123 Main St";
            emp.age = 25;
            emp.number = 123456789;
        }
        try{
            FileOutputStream filOut= new FileOutputStream("employee.ser");
            ObjectOutputStream objOut=new ObjectOutputStream(filOut);
            objOut.writeObject(new Employee());
            System.out.println("Serialized data is saved in employee.ser");
            objOut.close();
            filOut.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

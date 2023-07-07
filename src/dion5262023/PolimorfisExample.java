/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion5262023;

/**
 *
 * @author LAB-MM
 */
public class PolimorfisExample {
    public static void main(String[] args){
        Person ref;
        student studentObject = new student();
        Employee employeeObject = new Employee();
        
        studentObject.setName("Dion");
        employeeObject.setName("Pratama");
        
        ref = studentObject;
        System.out.println("Nama  :"+ref.getName());
        
        ref = employeeObject;
        System.out.println("Nama  :"+ref.getName());
        printInformation(studentObject);
        printInformation(employeeObject);
    }
    
    public static void printInformation(Person ref){
        if(ref instanceof student){
            System.out.println("Nama      Student  :"+ref.getName());
            System.out.println("Alamat    Student  :"+ref.getAddress());
        }else if(ref instanceof Employee){
            System.out.println("Nama    Employee  :"+ref.getName());
            System.out.println("Nama    Employee  :"+ref.getName());
        }
    }
}

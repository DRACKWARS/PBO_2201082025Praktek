/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion5262023;

/**
 *
 * @author LAB-MM
 */
public class student extends Person {

    public student(){
        super();
        super.name = "Dion";
        super.adrees = "Padang";
        System.out.println("Inside Person:Constructor");
    }
    
    public String getName() {
        System.out.println("Student : getName");
        return name;
    }
    
    public static void main(String [] args){
        student anna = new student();
        System.out.println("Nama      "+ anna.name);
        System.out.println("Adrees    "+ anna.adrees);
    }
}

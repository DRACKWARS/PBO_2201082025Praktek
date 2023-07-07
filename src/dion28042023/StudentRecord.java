/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion28042023;

/**
 *
 * @author ASUS
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private Double mathGrade;
    private Double englishGrade;
    private Double scienceGrade;
    private Double average;
    private char nilaiAngka;
    
    private static int studentCount;
    
    public StudentRecord(){
        studentCount++;
    }
    public StudentRecord(String temp){
       this.name = temp;
       studentCount++;
    }
    public StudentRecord(String name, String address){
       this.name = name;
       this.address=address;
       studentCount++;
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
       mathGrade = mGrade;
       englishGrade=eGrade;
       scienceGrade=sGrade;
       studentCount++;
    }
    
    
    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getAddress (){
        return address;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public int getAge (){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
    public Double getMathGrade (){
        return mathGrade;
    }
    public void setMathGrade (double mathGrade){
        this.mathGrade = mathGrade;
    }
    public Double getEnglishGrade (){
        return englishGrade;
    }
    public void setEnglishGrade (double englishGrade){
        this.englishGrade = englishGrade;
    }
    public Double getScienceGrade (){
        return scienceGrade;
    }
    public void setScienceGrade (double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public Double getAverage (){
        average = (mathGrade+englishGrade+scienceGrade)/3;
        return average;
    }
    
    public static int getStudentCount (){
        return studentCount;
    }
    
    public char getNilaiAngka(){
        if(average > 80 && average <= 100){
           nilaiAngka = 'A'; 
        }
        else if(average > 65){
           nilaiAngka = 'B'; 
        }
        else if(average > 55){
           nilaiAngka = 'C';
        }
        else if(average > 40){
           nilaiAngka = 'D';
        }
        else if(average >= 0){
           nilaiAngka = 'E';
        }
        return nilaiAngka;
    }
    public void print (String temp){
        System.out.println("Nama : "+name);
        System.out.println("Alamat : "+address);
        System.out.println("Umur : "+age);    
    }
    public void print (double mGrade, double eGrade, double sGrade){
        System.out.println("Nama : "+name);
        System.out.println("Nilai MTK : "+mGrade);
        System.out.println("Nilai Inggris : "+eGrade);
        System.out.println("Nilai Ilmiah : "+sGrade);   
    }
}

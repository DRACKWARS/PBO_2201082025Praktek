/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion28042023;

/**
 *
 * @author ASUS
 */
public class StudentReportExample {
    public static void main (String[] args){
        StudentRecord annaRecord = new StudentRecord();
        ///Membuat data
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        
        ///Menampilkan data
        System.out.println("\nNama : "+annaRecord.getName());
        System.out.println("\nAlamat : "+annaRecord.getAddress());
        System.out.println("\nUmur : "+annaRecord.getAge());
        System.out.println("\nNilai MTK : "+annaRecord.getMathGrade());
        System.out.println("\nNilai Inggris : "+annaRecord.getEnglishGrade());
        System.out.println("\nNilai Ilmiah : "+annaRecord.getScienceGrade());
        System.out.println("\nRata-rata Nilai : "+annaRecord.getAverage());
        System.out.println("\nNilai Angka : "+annaRecord.getNilaiAngka());
        
        StudentRecord aliRecord = new StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Payakumbuh");
        aliRecord.print("");
        aliRecord.print(80,70,80);
        
        StudentRecord budiRecord = new StudentRecord("Budi","Padang");
        budiRecord.print("");
        
        System.out.println("\nJumlah siswa : "+StudentRecord.getStudentCount());
    }
}

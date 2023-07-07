/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

import java.util.Scanner;

/**
 *
 * @author LAB-MM
 */
public class Gaji {
    
 //atribut
    private String NIM;
    private String nama;
    private String golongan;
    private double gaji_pokok;
    private double tunjangan;
    private double total;

    public Gaji(String NIP, String nama, String golongan, double gaji_pokok) {
        this.NIM = NIM;
        this.nama = nama;
        this.golongan = golongan;
        this.gaji_pokok = gaji_pokok;
        this.tunjangan = 0;
        this.total = 0;
    }

    public void hitungTunjangan() {
        this.tunjangan = 0.05 * this.gaji_pokok;
    }

    public void hitungTotal() {
        this.total = this.gaji_pokok + this.tunjangan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan golongan (3A, 3B, 3C): ");
        String golongan = input.nextLine();

        double gaji_pokok;
        if (golongan.equals("3A")) {
            gaji_pokok = 1000000;
        } else if (golongan.equals("3B")) {
            gaji_pokok = 2000000;
        } else if (golongan.equals("3C")) {
            gaji_pokok = 3000000;
        } else {
            System.out.println("Golongan yang dimasukkan tidak valid.");
            return;
        }

        // Buat objek karyawan
        Gaji karyawan = new Gaji(NIM, nama, golongan, gaji_pokok);

        // Hitung tunjangan dan total
        karyawan.hitungTunjangan();
        karyawan.hitungTotal();

        // Cetak data karyawan
        System.out.println("\nData Karyawan");
        System.out.println("NIM: " +NIM);
        System.out.println("Nama: " + nama);
        System.out.println("golongan: "+ golongan);
        System.out.println("gaji pokok: " + gaji_pokok);
        System.out.println("Tunjangan: " + karyawan.tunjangan);
        System.out.println("Total gaji: " + karyawan.total);
    }
}

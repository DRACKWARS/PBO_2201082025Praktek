/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dion552023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class MenuBukuAlamat {
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int pil=0;
        try{
            
            while(pil!=5){
                System.out.println("1. Input data\n2. Hapus data\n3. Update data\n4. Tampilkan\n5. Keluar\n");
                System.out.print("Pilihan anda : ");
                pil = Integer.parseInt(dataIn.readLine());
                switch(pil){
                    case 1:
                        BukuAlamat temp = new BukuAlamat();
                        System.out.print("Nama    : ");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Alamat  : ");
                        temp.setAlamat(dataIn.readLine());
                        System.out.print("No telpon  : ");
                        temp.setNotelp(dataIn.readLine());
                        System.out.print("Email    : ");
                        temp.setEmail(dataIn.readLine());
                }
            }
            
        }catch(NumberFormatException ex){
            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program ini tentang menghitung bilangan dengan OO.
 */
public class PBO210117048Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner value = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        
        System.out.println("========Aplikasi Kalkulator Bilangan======");
        System.out.print("Masukkan Angka ke-1 = " );
        Double value1 = value.nextDouble();
        System.out.print("Masukkan Angka ke-2 = " );
        Double value2 = value.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan(value1,
                value2));
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan(value1,
                value2));
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan(value1,
                value2));
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan(value1,
                value2));
        System.out.println("Hasil Sisa Pembagian : " + kal.sisaBilangan(value1,
                value2));
    
        
        
    }

}

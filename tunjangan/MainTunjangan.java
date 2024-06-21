/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tunjangan;

import java.time.LocalDate;

/**
 * 
 * @author user
 */
public class MainTunjangan {

    public static void main(String[] args) {
          // Test case Manusia
        Manusia lakiMenikah = new Manusia("Mariadi", true, "111", true);
        Manusia perempuanMenikah = new Manusia("Maria", false, "222", true);
        Manusia belumMenikah = new Manusia("Ade", true, "333", false);

        System.out.println("========== Test Case Manusia ==========");
        System.out.println("\na. Manusia Laki-laki telah menikah. ");
        System.out.println(lakiMenikah);
        System.out.println("=========================================");
        System.out.println("b.Perempuan telah menikah. " );
        System.out.println(perempuanMenikah);
        System.out.println("=========================================");
        System.out.println("c.Belum menikah. ");
        System.out.println(belumMenikah);

        // Test case MahasiswaFilkom
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Oliv", false, "111", false, "165150300111100", 2.95);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Putri", true, "222", false, "205150700111100", 3.45);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Arwidi", true, "333", true, "235150600111100", 4.0);

        System.out.println("\n========== Test Case Mahasiswa Filkom ==========");
        System.out.println("\na. Ipk < 3");
        System.out.println(mahasiswa1);
        System.out.println("=========================================");
        System.out.println("b. Ipk 3 – 3.5 ");
        System.out.println(mahasiswa2);
        System.out.println("=========================================");
        System.out.println("c. Ipk 3.5 – 4");
        System.out.println(mahasiswa3);

        // Test case Pekerja
       LocalDate tahunMasuk1 = LocalDate.of(2022 ,3, 25);
       LocalDate tahunMasuk2 = LocalDate.of(2015, 3, 25);
       LocalDate tahunMasuk3 = LocalDate.of(2004, 3, 25);

        Pekerja pekerja1 = new Pekerja("Olivia", true, "111", true, 1000, tahunMasuk1, 2);
        Pekerja pekerja2 = new Pekerja("Putri", false, "222", false, 1000, tahunMasuk2, 0);
        Pekerja pekerja3 = new Pekerja("Arwidiyanti", true, "333", false, 1000, tahunMasuk3, 10);
        
        System.out.println("\n========== Test Case Pekerja ==========");
        System.out.println("\na.Lama bekerja 2 tahun, anak 2 ");
        System.out.println(pekerja1);
        System.out.println("=========================================");
        System.out.println("b.Lama bekerja 9 tahun");
        System.out.println(pekerja2);
        System.out.println("=========================================");
        System.out.println("c.Lama bekerja 20 tahun, anak 10 ");
        System.out.println(pekerja3);
        
        Manager manager1 = new Manager("Oliv", true , "111", true, 7500, LocalDate.of(2005 ,3, 25), 3, "Manager");
         System.out.println("\n========== Test Case Manager ==========");
        System.out.println("\na.Manager, lama bekerja 15 tahun dengan gaji $7500");
        System.out.println(manager1);
    }
}

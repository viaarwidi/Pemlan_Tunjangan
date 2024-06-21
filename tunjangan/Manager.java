/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tunjangan;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Manager extends Pekerja {
     private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji,
                   LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }
    
    public void setDepartemen(String departemen){
        this.departemen=departemen;
    }
    
    public String getDepartemen(){
        return departemen;
    }
    
     @Override
    public double getTunjangan() {
        return super.getTunjangan() + 0.10 * getGaji();
    }

     @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}



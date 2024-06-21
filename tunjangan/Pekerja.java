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
public class Pekerja extends Manusia    {
     private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk,
            int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public double getBonus() {
        int lamakerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamakerja>0 && lamakerja <= 5)
            return 0.05 * getGaji();
        else if (lamakerja >5 && lamakerja <= 10)
            return 0.10 * getGaji();
        else if(lamakerja>10)
            return  0.15 * getGaji();
        else
            return 0;
        
    }
    
    public double getTunjangan(){
        return super.getTunjangan()+(getJumlahAnak()*20.0);
    }

    @Override
    public double getPendapatan() {
        return getGaji() + getTunjangan() + getBonus();
    }
    
     @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getDayOfMonth() + " " + 
                                                      tahunMasuk.getMonthValue() + " " + 
                                                      tahunMasuk.getYear() +
                                  "\nJumlah Anak: " + jumlahAnak+
                                  "\nGaji: " + getGaji();
    }
}

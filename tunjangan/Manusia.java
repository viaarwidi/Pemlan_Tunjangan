/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tunjangan;

/**
 *
 * @author user
 */
public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNIK(String nik){
        this.nik=nik;
    }
    
    public String getNIK(){
        return nik;
    }
    
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) 
                return 25;//cowo
            else 
                return 20;//cewe
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    
    public String toString() {
        return "Nama: " + nama + 
                "\nNIK: " + nik + 
                "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan")+
                "\nStatus: "+(menikah ? "Kawin":"Belum Kawin")+
                "\nPendapatan: $" + getPendapatan();
    }
}

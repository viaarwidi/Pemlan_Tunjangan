/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tunjangan;

/**
 *
 * @author user
 */
public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setIPK(double ipk){
        this.ipk=ipk;
    }
    
    public double getIPK(){
        return ipk;
    }
    
    public String getStatus() {
        String prodi;
        String angkatan = "20" +nim.substring(0, 2);
        switch (nim.charAt(6)) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak valid";
        }
        return prodi + " " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk <= 3.5 && ipk >= 3.0)
            return 50;
        else if (ipk >3.5 && ipk <= 4.0)
            return 75;
        else
            return 0;
    }
    
    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + nim + 
                                  "\nIPK: " + ipk + 
                                  "\nStatus: " + getStatus();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Mobil extends Transportasi{
    private String kapasitasPenumpang;

    public Mobil(String kapasitasPenumpang, String namaPenumpang, String tujuan, double bayar) {
        super(namaPenumpang, tujuan, bayar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(String kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Transportasi Mobil Online");
        System.out.println("Kapasitas Penumpang: " +kapasitasPenumpang);
        System.out.println("Nama Penumpang: "+namaPenumpang);
        System.out.println("Tujuannya: "+tujuan);
        System.out.println("Total Bayar: "+bayar);
    }
    
}
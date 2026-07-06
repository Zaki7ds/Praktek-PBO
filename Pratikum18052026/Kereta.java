/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Kereta extends Transportasi{
    private String jumlahTiket;

    public Kereta(String jumlahTiket, String namaPenumpang, String tujuan, double bayar) {
        super(namaPenumpang, tujuan, bayar);
        this.jumlahTiket = jumlahTiket;
    }


    public String getJumlahGerbong() {
        return jumlahTiket;
    }

    public void setJumlahGerbong(String jumlahGerbong) {
        this.jumlahTiket = jumlahGerbong;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Transportasi Kereta Woosh");
        System.out.println("Jumlah Tiket: " +jumlahTiket);
        System.out.println("Nama Penumpang: "+namaPenumpang);
        System.out.println("Tujuannya: "+tujuan);
        System.out.println("Total Bayar: "+bayar);
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Motor extends Transportasi {
    private String jenisOjol;

    public Motor(String jenisOjol, String namaPenumpang, String tujuan, double bayar) {
        super(namaPenumpang, tujuan, bayar);
        this.jenisOjol = jenisOjol;
    }

    public String getJenisOjol() {
        return jenisOjol;
    }

    public void setJenisOjol(String jenisOjol) {
        this.jenisOjol = jenisOjol;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Transportasi Ojek Motor");
        System.out.println("Jenis Platform Ojek: " +jenisOjol);
        System.out.println("Nama Penumpang: "+namaPenumpang);
        System.out.println("Tujuannya: "+tujuan);
        System.out.println("Total Bayar: "+bayar);
    }
    
}

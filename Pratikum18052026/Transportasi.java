/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026.Tugas;

/**
 *
 * @author LAB-SI-PC
 */
public abstract class Transportasi {
    protected String namaPenumpang;
    protected String tujuan;
    protected double bayar;

    public Transportasi(String namaPenumpang, String tujuan, double bayar) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.bayar = bayar;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }
    
    public abstract void prosesPembayaran();
}

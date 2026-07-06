/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Bis extends Transportasi{
    private String jenisBis;

    public Bis(String jenisBis, String namaPenumpang, String tujuan, double bayar) {
        super(namaPenumpang, tujuan, bayar);
        this.jenisBis = jenisBis;
    }

    public String getJenisBis() {
        return jenisBis;
    }

    public void setJenisBis(String jenisBis) {
        this.jenisBis = jenisBis;
    }
    
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Transportasi Bis");
        System.out.println("Jenis Bis (Tingkat 1 / 2): " +jenisBis);
        System.out.println("Nama Penumpang: "+namaPenumpang);
        System.out.println("Tujuannya: "+tujuan);
        System.out.println("Total Bayar: "+bayar);
    }
    
    
}

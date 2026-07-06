/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author zakiv
 */
public class PembayaranEWallet extends Pembayaran implements Cetak{
    private String namaEWallet;

    public PembayaranEWallet(String namaEWallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet");
        System.out.println("E-Wallet: "+ namaEWallet);
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar : "+ jumlahBayar);
    }
    @Override
    public void CetakStruk(){
        System.out.println("=====Bukti Pembayaran=====");
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Total pembayaran : Rp "+ jumlahBayar);
        System.out.println("Pembayaran dilakukan secara tunai ");
    }
}

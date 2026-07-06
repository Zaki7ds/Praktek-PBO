/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author zakiv
 */
public class Transfer extends Pembayaran implements Cetak{
    private String namaBank;

    public Transfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui Transfer");
        System.out.println("Bank Tujuan: "+ namaBank);
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

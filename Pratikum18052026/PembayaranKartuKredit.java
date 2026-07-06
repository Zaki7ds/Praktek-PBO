/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author zakiv
 */
public class PembayaranKartuKredit extends Pembayaran implements Cetak{
    private String nomorKartu;

    public PembayaranKartuKredit(String nomorKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui KartuKredit");
        System.out.println("No Kartu Kredit: "+ nomorKartu);
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

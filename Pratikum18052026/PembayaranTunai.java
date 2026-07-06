/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author zakiv
 */
public class PembayaranTunai extends Pembayaran implements Cetak {
    private double uang;

    public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui tunai");
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Jumlah Bayar : Rp"+ jumlahBayar);
        System.out.println("Jumlah uang : Rp"+ jumlahBayar);
        if(uang>=jumlahBayar){
            double kembalian =uang-jumlahBayar;
            System.out.println("Pembayaran Berhasil!!");
            System.out.println("Uang kembalian = Rp "+kembalian);
        }else{
            double kekurangan = jumlahBayar-uang;
            System.out.println("Pembayaran Gagal, uang anda kurang");
            System.out.println("Kekurangan sebesar = Rp "+kekurangan);
        }
    }
    
    @Override
    public void CetakStruk(){
        System.out.println("=====Bukti Pembayaran=====");
        System.out.println("ID Transaksi: "+ idTransaksi);
        System.out.println("Total pembayaran : Rp "+ jumlahBayar);
        System.out.println("Pembayaran dilakukan secara tunai ");

        
    }
}

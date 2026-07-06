/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author zakiv
 */
import java.util.Scanner;
public class MainPembayaran {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pembayaran pembayaran=null;
        System.out.println("----Sistem Pembayaran Toko Online----");
        System.out.print("Masukan ID transaksi = ");
        String id = scanner.nextLine();
        
        System.out.print("Masukan Jumlah Bayar = ");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran : ");
        System.out.println("1. Transfer Bank ");
        System.out.println("2. Kartu Kredit ");
        System.out.println("3. E-Wallet ");
        System.out.println("4. Tunai ");
        System.out.print("Pilih Metode Pembayaran anda (1/2/3/4) : ");
        int pilihan=scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.print("Masukan nama Bank tujuan = ");
                     String bank=scanner.nextLine();
                     pembayaran= new Transfer(bank,jumlah,id);
            break;
            case 2 : System.out.println("Metode Kartu Kredit");
                     System.out.print("Masukan nomor Kartu Kredit = ");
                     String noKartu=scanner.nextLine();
                     pembayaran= new PembayaranKartuKredit(noKartu,jumlah,id);
            break;  
            case 3 : System.out.println("Metode E-Wallet");
                     System.out.print("Masukan nama E-Wallet = ");
                     String eWallet=scanner.nextLine();
                     pembayaran= new PembayaranEWallet(eWallet,jumlah,id);
            break;
            case 4 : System.out.println("Metode Pembayran Tunai");
                     double uang=scanner.nextDouble();
                     pembayaran= new PembayaranTunai(uang,jumlah,id);
                    
            break;
        }
        
        System.out.println("\n==Konfimasi Bukti Pembayaran===");
        pembayaran.prosesPembayaran();
    }
}

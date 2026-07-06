/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum18052026;

import java.util.Scanner;

/**
 *
 * @author LAB-SI-PC
 */
public class MainTransportasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Transportasi transportasi= null;
        
        System.out.println("Sistem Pemilihan Transportasi");
        System.out.println("Masukan Nama Penumpang");
        String nama = scanner.nextLine();
        
        System.out.println("Sistem Pemilihan Transportasi");
        System.out.println("Masukan Tujuan");
        String tujuanJalan = scanner.nextLine();
        
        System.out.println("Masukkan Jumlah Bayar: ");
        double byr = scanner.nextDouble();
        
        System.out.println("Pilih Transportasi: ");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Kereta");
        System.out.println("4. Bis");
        System.out.println("Pilih Transportasi (1/2/3/4): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); //buffer clear
        
        switch(pilihan){
            case 1 -> {
                System.out.println("Transportasi Motor");
                System.out.println("Masukan Jenis Platform Ojol: ");
                String jns= scanner.nextLine();
                transportasi = new Motor(jns, nama, tujuanJalan, byr);
            }
            case 2 -> {
                System.out.println("Transportasi Mobil");
                System.out.println("Masukan Berapa Penumpang: ");
                String pnp= scanner.nextLine();
                transportasi = new Mobil(pnp, nama, tujuanJalan, byr);
            }
            case 3 -> {
                System.out.println("Transportasi Kereta");
                System.out.println("Masukan Jumlah Tiket: ");
                String tkt= scanner.nextLine();
                transportasi = new Kereta(tkt, nama, tujuanJalan, byr);
            }
            case 4 -> {
                System.out.println("Transportasi Bis");
                System.out.println("Masukan Jenis Bis (Tingkat1/2): ");
                String tnk= scanner.nextLine();
                transportasi = new Bis(tnk, nama, tujuanJalan, byr);
            }
        }
        System.out.println("\nKonfirmasi Bukti Pembayaran");
        transportasi.prosesPembayaran();
    }
    
}
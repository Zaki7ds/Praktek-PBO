/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum18052026;

import java.util.Scanner;

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = null;

        System.out.println("=== Sistem Penggajian Karyawan ===");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Pilih Jenis Karyawan (1/2): ");
        int pilihan = scanner.nextInt();
        
        scanner.nextLine(); 

        if (pilihan == 1 || pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan ID Karyawan: ");
            String id = scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Gaji Pokok Per Bulan: Rp ");
                    double gajiPokok = scanner.nextDouble();
                    karyawan = new KaryawanTetap(nama, id, gajiPokok);
                    break;
                case 2:
                    System.out.print("Masukkan Upah Per Jam: Rp ");
                    double upahJam = scanner.nextDouble();
                    System.out.print("Masukkan Total Jam Kerja Sebulan: ");
                    int totalJam = scanner.nextInt();
                    karyawan = new KaryawanKontrak(nama, id, upahJam, totalJam);
                    break;
            }
            
            System.out.println("\nMemproses Data...\n");
        } else {
            System.out.println("\nPilihan tidak valid! Masukkan angka 1 atau 2 saja.");
        }

        if (karyawan != null) {
            karyawan.tampilkanDetail();
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum06042026;

/**
 *
 * @author zakiv
 */
public class MainMahasiswaEnkapsulasi {
     public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN KONSTRUKTOR 1 ===");
        MahasiswaEnkapsulasi mhs1 = new MahasiswaEnkapsulasi();
        mhs1.setNama("Zaki");
        mhs1.setNim("2501083008");
        mhs1.setJurusan("Teknik Komputer");
        mhs1.setUmur(20);
        mhs1.setIpk(3.55);
        mhs1.tampilkanInfo();
        System.out.println("----------------------------------------\n");

        System.out.println("=== PENGUJIAN KONSTRUKTOR 2 ===");
        // Bikin objek dengan Nama & NIM langsung, sisanya disusul pakai Setter
        MahasiswaEnkapsulasi mhs2 = new MahasiswaEnkapsulasi("Andi Saputra", "2501083009");
        mhs2.setJurusan("Sistem Informasi");
        mhs2.setUmur(21);
        mhs2.setIpk(2.75);
        mhs2.tampilkanInfo();
        System.out.println("----------------------------------------\n");

        System.out.println("=== PENGUJIAN KONSTRUKTOR 3  ===");
        // Bikin objek langsung jadi (semua data diisi di awal)
        MahasiswaEnkapsulasi mhs3 = new MahasiswaEnkapsulasi("Budi Santoso", "2501083010", "Teknik Informatika", 22, 3.20);
        mhs3.tampilkanInfo();
        System.out.println("----------------------------------------\n");
    }
}


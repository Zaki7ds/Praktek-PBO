/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026.Tugas2;

public class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jamKerjaSebulan;

    public KaryawanKontrak(String nama, String idKaryawan, double upahPerJam, int jamKerjaSebulan) {
        super(nama, idKaryawan);
        this.upahPerJam = upahPerJam;
        this.jamKerjaSebulan = jamKerjaSebulan;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getJamKerjaSebulan() {
        return jamKerjaSebulan;
    }

    public void setJamKerjaSebulan(int jamKerjaSebulan) {
        this.jamKerjaSebulan = jamKerjaSebulan;
    }

    @Override
    public double hitungGajiBulanIni() {
        return upahPerJam * jamKerjaSebulan;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Data Karyawan Kontrak ===");
        System.out.println("Nama          : " + nama);
        System.out.println("ID Karyawan   : " + idKaryawan);
        System.out.println("Upah Per Jam  : Rp " + upahPerJam);
        System.out.println("Total Jam     : " + jamKerjaSebulan + " Jam (Sebulan)");
        System.out.println("Total Gaji    : Rp " + hitungGajiBulanIni());
        System.out.println("---------------------------\n");
    }
}
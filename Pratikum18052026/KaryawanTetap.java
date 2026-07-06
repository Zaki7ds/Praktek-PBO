/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026.Tugas2;

public class KaryawanTetap extends Karyawan {
    private double gajiPokokPerBulan;

    public KaryawanTetap(String nama, String idKaryawan, double gajiPokokPerBulan) {
        super(nama, idKaryawan);
        this.gajiPokokPerBulan = gajiPokokPerBulan;
    }

    public double getGajiPokokPerBulan() {
        return gajiPokokPerBulan;
    }

    public void setGajiPokokPerBulan(double gajiPokokPerBulan) {
        this.gajiPokokPerBulan = gajiPokokPerBulan;
    }

    @Override
    public double hitungGajiBulanIni() {
        double tunjangan = gajiPokokPerBulan * 0.025; // Tunjangan 2.5%
        return gajiPokokPerBulan + tunjangan;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Data Karyawan Tetap ===");
        System.out.println("Nama          : " + nama);
        System.out.println("ID Karyawan   : " + idKaryawan);
        System.out.println("Gaji Pokok    : Rp " + gajiPokokPerBulan);
        System.out.println("Tunjangan     : Rp " + (gajiPokokPerBulan * 0.025));
        System.out.println("Total Gaji    : Rp " + hitungGajiBulanIni());
        System.out.println("---------------------------\n");
    }
}

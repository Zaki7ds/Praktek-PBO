/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30032026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args){
        KelasMahasiswa mm1 = new KelasMahasiswa();
        mm1.tugas = 90;
        mm1.uts= 90;
        mm1.uas= 80;
        System.out.println("Nilai Akhir Mahasiswa semes1");
        System.out.println("Tugas  ="+mm1.tugas);
        System.out.println("Uts    ="+mm1.uts);
        System.out.println("Uas    ="+mm1.uas);
        System.out.println("Nilai Akhir ="+mm1.hitungNilaiAkhir());              
        //membuat objek kedua
        KelasMahasiswa mm2 = new KelasMahasiswa(80,80,75);
        System.out.println("Nilai Akhir Mahasiswa semes2");
        System.out.println("Tugas  ="+mm2.tugas);
        System.out.println("Uts    ="+mm2.uts);
        System.out.println("Uas    ="+mm2.uas);
        System.out.println("Nilai Akhir ="+mm2.hitungNilaiAkhir());
        //objek ketiga
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai Akhir Mahasiswa semes3");
        System.out.println("Tugas  =");
        double tu = input.nextInt();
        System.out.println("Uts    =");
        double ut = input.nextInt();
        System.out.println("uas    =");
        double ua = input.nextInt();
        KelasMahasiswa mm3 = new KelasMahasiswa(tu,ut,ua);
        System.out.println("Nilai Akhir ="+mm3.hitungNilaiAkhir());
    }
}
  

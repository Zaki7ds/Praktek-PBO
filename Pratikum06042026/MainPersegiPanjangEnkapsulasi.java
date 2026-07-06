/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum06042026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {
    public static void main(String[] args){
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(20);
        pp1.setLebar(10);
        int luas = pp1.getLuas();
        System.out.println("Objek Pesegi Panjang Pertama");
        System.out.println("Panjang  ="+pp1.getPanjang());
        System.out.println("Lebar    ="+pp1.getLebar());
        System.out.println("Luas     ="+luas);
        System.out.println("keliling ="+pp1.getKeliling());
        //membuat objek kedua
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(10,5);
        luas = pp2.getLuas();
        System.out.println("Objek Pesegi Panjang Kedua");
        System.out.println("Panjang  ="+pp2.getPanjang());
        System.out.println("Lebar    ="+pp2.getLebar());
        System.out.println("Luas     ="+luas);
        System.out.println("keliling ="+pp2.getKeliling());
        //membuat objek ketiga
        Scanner input = new Scanner(System.in);
        System.out.println("Objek Pesegi Panjang Ketiga");
        System.out.println("Panjang  =");
        int pj = input.nextInt();
        System.out.println("Lebar    =");
        int lb = input.nextInt();
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(pj,lb);
        System.out.println("Luas ="+pp3.getLuas());
        System.out.println("keliling ="+pp3.getKeliling());
        
    }
    
}

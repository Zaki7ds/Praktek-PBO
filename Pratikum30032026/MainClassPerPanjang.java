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
public class MainClassPerPanjang {
    public static void main(String[] args){
        Persegipanjang pp1 = new Persegipanjang();
        pp1.panjang = 20;
        pp1.lebar = 10;
        int luas = pp1.hitungLuas();
        System.out.println("Objek Pesegi Panjang Pertama");
        System.out.println("Panjang  ="+pp1.panjang);
        System.out.println("Lebar    ="+pp1.lebar);
        System.out.println("Luas     ="+luas);
        System.out.println("keliling ="+pp1.hitungKeliling());
        //membuat objek kedua
        Persegipanjang pp2 = new Persegipanjang(10,5);
        luas = pp2.hitungLuas();
        System.out.println("Objek Pesegi Panjang Kedua");
        System.out.println("Panjang  ="+pp2.panjang);
        System.out.println("Lebar    ="+pp2.lebar);
        System.out.println("Luas     ="+luas);
        System.out.println("keliling ="+pp2.hitungKeliling());
        //membuat objek ketiga
        Scanner input = new Scanner(System.in);
        System.out.println("Objek Pesegi Panjang Ketiga");
        System.out.println("Panjang  =");
        int pj = input.nextInt();
        System.out.println("Lebar    =");
        int lb = input.nextInt();
        Persegipanjang pp3 = new Persegipanjang(pj,lb);
        System.out.println("Luas ="+pp3.hitungLuas());
        System.out.println("keliling ="+pp3.hitungKeliling());
        
    }
    
}

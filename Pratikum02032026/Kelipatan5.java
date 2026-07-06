/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum02032026;

/**
 *  Program : Kelipatan5.Java
 *  Pembuat : Fitrah azzaki
 *  Tanggal : 03 Maret 2026
 *  Deskripsi : Penjumlahn dua buah bilangan bulat
 */
import java.util.Scanner;
public class Kelipatan5 {
    public static void main(String[] args){
        int bilangan;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("===Program Menentukan kelipatan 5 atau Bukan===");
        
        System.out.print("Bilangan= ");
        bilangan = in.nextInt();
        if (bilangan%5==0)
            System.out.println(bilangan +" merupakan bilangan kelipatan 5");
        else //bilangan%5!=0
            System.out.println(bilangan +" BUKAN bilangan kelipatan 5");
        //endif
    }
}

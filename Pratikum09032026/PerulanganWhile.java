/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum09032026;

/**
 *Program : PerulanganDoWhile.Java
 *  Pembuat : Fitrah azzaki
 *  Tanggal : 09 Maret 2026
 *  Deskripsi : Perulangan do while
 */
import java.util.Scanner;
public class PerulanganWhile {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("masukan angka anda");
       int angka = in.nextInt();
       int banyak = 1;
       while(angka>0)
       {
           System.out.print("angka anda");
           angka = in.nextInt();
           banyak++;
       }
        
    }   
}

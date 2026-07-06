/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum08062026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zakiv
 */
public class CekArray {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int[] angka = {10,20,30,40,50};
        try{
        System.out.println("Mau bagi angka index ke berapa = ");
        int index = input.nextInt();
        System.out.println("Angka pada indeks "+index+" adalah "+angka[index]);
        System.out.print("Mau dibagi berapa");
        int pembagi = input.nextInt();
        int hasil = angka[index]/pembagi;
        System.out.println("hasil pembagian = "+hasil);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index array tidak ada, masukkan 0-4");
        }catch(InputMismatchException e){
            System.out.println("Pastikan input berupa angka");
        }catch(ArithmeticException e){
             System.out.println("Tidak boleh pembagian dengan 0");
        }finally {
             System.out.println("Proses selesai, isi array adalah = ");
        } //isi array
    }
}

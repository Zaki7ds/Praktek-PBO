/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum13042026;

/**
 *
 * @author zakiv
 */
public class UsahaKue {
    private String idKue;
    private double harga;
    private int jumlahKetersedian;
    private int jenis;
    
    public UsahaKue(){
        
    }
    public UsahaKue(int a, int b){
        jenis = a;
        jumlahKetersedian = b;
    }
    public double hitungTotal (){
        if (jenis == 1){
            harga = 12000;
        }
        else if (jenis ==2){
            harga = 20000;
        }
        return (jumlahKetersedian*harga);
    }
    public int jenisKue(){
        return (jenis);
    }    
}

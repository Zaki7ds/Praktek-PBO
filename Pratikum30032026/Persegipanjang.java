/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30032026;

/**
 *
 * @author LAB-SI-PC
 */
public class Persegipanjang {
    int panjang;
    int lebar;
    
    Persegipanjang(){
    
    }
   
    Persegipanjang(int a, int b){
        panjang=a;
        lebar=b;
    }
    
    int hitungLuas(){
        return(panjang*lebar);
    }
    
    int hitungKeliling(){
        return(2*(panjang+lebar));
    }
}

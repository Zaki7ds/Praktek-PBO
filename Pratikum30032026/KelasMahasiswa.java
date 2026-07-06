/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum30032026;

/**
 *
 * @author LAB-SI-PC
 */
public class KelasMahasiswa {
   char nim,nama;
   double tugas,uts,uas;
           
    KelasMahasiswa(){
        
    }
    
    KelasMahasiswa(double tu,double ut, double ua){
        tugas=tu;
        uts=ut;
        uas=ua;
    }
    double hitungNilaiAkhir(){
        return((0.25*tugas)+(0.35*uts)+(0.40*uas));
    }
}

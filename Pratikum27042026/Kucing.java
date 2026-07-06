/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author zakiv
 */
public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+"berkata Meong!!!");
    }
}

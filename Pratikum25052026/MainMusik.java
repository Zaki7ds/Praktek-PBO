/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum25052026;

/**
 *
 * @author zakiv
 */
public class MainMusik {
    
    public static void main(String [] args){
        Gitar gitar = new Gitar("Klasik","Petik",6);
        Keyboard keyboard = new Keyboard("Yamaha","Elektronik",true);
        
        System.out.println("\n Alat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("\n Alat Musik Keyboard");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author zakiv
 */
public class Udara extends Kendaraan{
    private boolean mesin;
    
    public boolean getMesin(){
        return mesin;
    }
    public void setMesin(boolean mesin){
        this.mesin=mesin;
    }
    public Udara(){
        
    }
    public Udara(String nama ,int tahunProduksi,boolean mesin){
        super(nama,tahunProduksi);
        this.mesin=mesin;
    }
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Menggunakan mesin="+(mesin?"ya":"Tidak"));
    }
    
}


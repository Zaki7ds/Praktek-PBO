/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author zakiv
 */
public class Pesawat extends Udara{
    private int muatan;
    
    public int getMuatan(){
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    public Pesawat(){
        
    }
    public Pesawat(String nama,int tahunProduksi,boolean mesin,int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan=muatan;       
    }
    public void reset(String nama,int tahunProduksi,boolean mesin,int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori(int muatan){
        if(muatan<=50)
            return "Bobot kecil";
        else if(muatan<=100)
            return "Bobot menengah";
        else
            return "Bobot besar";
    }
    public void cetak(){
        super.cetak();
        
    }
}

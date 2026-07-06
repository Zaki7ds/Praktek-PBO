/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_2501083008;

import java.util.Scanner;



/**
 *
 * @author zakiv
 */
public class ElektronikDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmartWatch smw = new SmartWatch();
        
        System.out.println("=========================================");
        System.out.println("    INPUT DATA SMARTWATCH (DINAMIS)      ");
        System.out.println("=========================================");
        
        System.out.print("Masukkan Merek                  : ");
        smw.setMerek(input.nextLine());
        
        System.out.print("Masukkan Tahun Produksi         : ");
        smw.setTahunProduksi(input.nextInt());
        
        System.out.print("Masukkan Garansi (Bulan)        : ");
        smw.setGaransi(input.nextInt());
        
        System.out.print("Masukkan Kapasitas Baterai (mAh): ");
        smw.setKapasitasBaterai(input.nextInt());
        
        System.out.print("Masukkan Jumlah Kamera          : ");
        smw.setJumlahKamera(input.nextInt());
        
        System.out.print("Masukkan Ukuran Layar (mm)      : ");
        smw.setUkuranLayar(input.nextInt());
        
        System.out.print("Apakah Tahan Air? (true/false)  : ");
        smw.setTahanAir(input.nextBoolean());
        
        System.out.println("\n=========================================");
        System.out.println("          HASIL DATA SMARTWATCH          ");
        System.out.println("=========================================");
        System.out.println("Merek             : " + smw.getMerek());
        System.out.println("Tahun Produksi    : " + smw.getTahunProduksi());
        System.out.println("Garansi           : " + smw.getGaransi() + " Bulan");
        System.out.println("Kapasitas Baterai : " + smw.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera     : " + smw.getJumlahKamera());
        System.out.println("Ukuran Layar      : " + smw.getUkuranLayar() + " mm");
        
        if (smw.isTahanAir()) {
            System.out.println("Tahan Air         : Ya");
        } else {
            System.out.println("Tahan Air         : Tidak");
        }
        System.out.println("========================================="); 
        
        input.nextLine();
        
        Gaming gm = new Gaming();

        System.out.println("=========================================");
        System.out.println("     INPUT DATA LAPTOP GAMING            ");
        System.out.println("=========================================");

        System.out.print("Masukkan Merek                  : ");
        gm.setMerek(input.nextLine());

        System.out.print("Masukkan Tahun Produksi         : ");
        gm.setTahunProduksi(input.nextInt());

        System.out.print("Masukkan Garansi (Bulan)        : ");
        gm.setGaransi(input.nextInt());

        System.out.print("Masukkan Ukuran Layar (inci)    : ");
        gm.setUkuranLayar(input.nextInt());

        System.out.print("Masukkan Kapasitas RAM (GB)     : ");
        gm.setKapasitasRAM(input.nextInt());

        input.nextLine();

        System.out.print("Masukkan Kartu Grafis           : ");
        gm.setKartuGrafis(input.nextLine());

        System.out.print("Masukkan Refresh Rate (Hz)      : ");
        gm.setRefreshRate(input.nextInt());

        System.out.println("\n=========================================");
        System.out.println("      HASIL DATA LAPTOP GAMING           ");
        System.out.println("=========================================");
        System.out.println("Merek             : " + gm.getMerek());
        System.out.println("Tahun Produksi    : " + gm.getTahunProduksi());
        System.out.println("Garansi           : " + gm.getGaransi() + " Bulan");
        System.out.println("Ukuran Layar      : " + gm.getUkuranLayar() + " inci");
        System.out.println("Kapasitas RAM     : " + gm.getKapasitasRAM() + " GB");
        System.out.println("Kartu Grafis      : " + gm.getKartuGrafis());
        System.out.println("Refresh Rate      : " + gm.getRefreshRate() + " Hz");
        System.out.println("=========================================");
    }
}

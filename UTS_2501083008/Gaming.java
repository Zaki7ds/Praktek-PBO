/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2501083008;

/**
 *
 * @author zakiv
 */
public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;

    public Gaming() {

    }

    public Gaming(String merek, int tahunProduksi, int garansi,
                  int ukuranLayar, int kapasitasRAM,
                  String kartuGrafis, int refreshRate) {
        super(merek, tahunProduksi, garansi, ukuranLayar, kapasitasRAM);
        this.kartuGrafis = kartuGrafis;
        this.refreshRate = refreshRate;
    }

    public String getKartuGrafis() {
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
}

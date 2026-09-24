package Tugas;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;

    public Menu(String kodeMenu, String namaMenu, double harga) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    // Menambahkan getKodeMenu agar tidak ada warning "unused field" (garis kuning) di VS Code
    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getInfo() {
        // Format teks agar rapi: jarak 22 spasi untuk nama menu, 
        // dan (long) agar tidak ada .0 di belakang harga.
        return String.format("%-22s Rp %,d", namaMenu, (long)harga).replace(',', '.');
    }
}
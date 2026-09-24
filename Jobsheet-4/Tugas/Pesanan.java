package Tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pesanan {
    private String kodePesanan;
    private LocalDate tanggal;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String kodePesanan, LocalDate tanggal) {
        this.kodePesanan = kodePesanan;
        this.tanggal = tanggal;
        this.daftarMenu = new ArrayList<Menu>();
    }

    public String getKodePesanan() {
        return kodePesanan;
    }
    
    public void setKodePesanan(String kodePesanan) {
        this.kodePesanan = kodePesanan;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public void tambahMenu(Menu menu) {
        this.daftarMenu.add(menu);
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public String getInfo() {
        String info = "";
        info += "  Kode Pesanan : " + kodePesanan + "\n";
        info += "  Tanggal      : " + tanggal + "\n";
        info += "  Daftar Menu  :\n";
        
        double totalHarga = 0;
        for (Menu menu : daftarMenu) {
            info += "    - " + menu.getInfo() + "\n";
            totalHarga += menu.getHarga();
        }
        
        // Format total harga agar ada pemisah ribuan dan desimal hilang
        String strTotal = String.format("Rp %,d", (long)totalHarga).replace(',', '.');
        
        info += "  ----------------------------------------\n";
        info += "  Total Bayar  : " + strTotal + "\n";
        return info;
    }
}
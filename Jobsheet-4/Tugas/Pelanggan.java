package Tugas;

import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatPesanan = new ArrayList<Pesanan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }
    
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPesanan(Pesanan pesanan) {
        this.riwayatPesanan.add(pesanan);
    }

    public String getInfo() {
        String info = "==========================================\n";
        info += "             DATA PELANGGAN               \n";
        info += "==========================================\n";
        info += "ID Pelanggan : " + idPelanggan + "\n";
        info += "Nama         : " + nama + "\n";
        info += "------------------------------------------\n";
        
        if (riwayatPesanan.isEmpty()) {
            info += "Belum ada riwayat pesanan.\n";
        } else {
            info += "RIWAYAT PESANAN:\n\n";
            for (Pesanan p : riwayatPesanan) {
                info += p.getInfo() + "\n";
            }
        }
        info += "==========================================\n";
        return info;
    }
}
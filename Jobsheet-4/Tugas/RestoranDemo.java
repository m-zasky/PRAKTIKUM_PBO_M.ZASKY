package Tugas;

import java.time.LocalDate;

public class RestoranDemo {
    public static void main(String[] args) {
        // 1. Instansiasi objek Menu
        Menu menu1 = new Menu("M01", "Nasi Goreng Ayam", 25000);
        Menu menu2 = new Menu("M02", "Mie Goreng Seafood", 30000);
        Menu menu3 = new Menu("M03", "Es Jeruk", 8000);
        Menu menu4 = new Menu("M04", "Kopi Hitam", 10000);

        // 2. Instansiasi Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P001", "Andi");
        
        // 3. Membuat Pesanan Pertama
        Pesanan pesanan1 = new Pesanan("ORD-001", LocalDate.of(2026, 9, 21));
        pesanan1.tambahMenu(menu1);
        pesanan1.tambahMenu(menu3);
        
        // Memasukkan pesanan 1 ke riwayat pelanggan
        pelanggan1.tambahPesanan(pesanan1);

        // 4. Membuat Pesanan Kedua
        Pesanan pesanan2 = new Pesanan("ORD-002", LocalDate.of(2026, 9, 24));
        pesanan2.tambahMenu(menu2);
        pesanan2.tambahMenu(menu4);
        
        // Memasukkan pesanan 2 ke riwayat pelanggan
        pelanggan1.tambahPesanan(pesanan2);

        // 5. Cetak Informasi Pelanggan beserta struk riwayat pesanannya
        System.out.println(pelanggan1.getInfo());
    }
}
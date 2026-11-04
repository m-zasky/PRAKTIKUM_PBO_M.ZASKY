package Percobaan;

public class Main16 {
    public static void main(String[] args) {
        // Instansiasi 1 objek Kulkas
        Kulkas16 kulkas1 = new Kulkas16();
        kulkas1.merk = "Sharp";
        kulkas1.warna = "Hitam";
        kulkas1.harga = 3500000;
        kulkas1.jumlahPintu = 2;

        // Instansiasi 1 objek TV
        TV16 tv1 = new TV16();
        tv1.merk = "LG";
        tv1.warna = "Perak";
        tv1.harga = 2800000;
        tv1.jenisLayar = "OLED";
        tv1.volume = 10;

        // Menampilkan informasi objek
        System.out.println("=== INFO KULKAS ===");
        System.out.println(kulkas1.getInfo());

        System.out.println("\n=== INFO TV ===");
        System.out.println(tv1.getInfo());
    }
}

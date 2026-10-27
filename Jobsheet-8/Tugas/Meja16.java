package Tugas;

public class Meja16 extends Furniture16 {
    public int jumlahKaki;

    // Constructor 1: Tanpa parameter
    public Meja16() {
        super();
    }

    // Constructor 2: Berparameter (Memanggil super berparameter)
    public Meja16(int lebar, int panjang, int tinggi, String warna, int jumlahKaki) {
        super(lebar, panjang, tinggi, warna);
        this.jumlahKaki = jumlahKaki;
    }

    // Buat
    @Override
    public void buat() {
        System.out.println("Cara membuat Meja:");
        System.out.println("1. Memotong kayu pipih untuk alas (top table).");
        System.out.println("2. Memotong dan merakit " + this.jumlahKaki + " kaki penyangga.");
        System.out.println("3. Menyatukan kaki penyangga dengan alas dan mengecat permukaan.");
    }

    // Method Overriding
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Kaki : " + jumlahKaki);
    }


}
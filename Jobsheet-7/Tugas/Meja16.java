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

    // Method Overriding
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Kaki : " + jumlahKaki);
    }
}
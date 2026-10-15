package Tugas;

public class Lemari16 extends Furniture16 {
    public int jumlahPintu;

    // Constructor 1: Tanpa parameter
    public Lemari16() {
        super();
    }

    // Constructor 2: Berparameter (Memanggil super berparameter)
    public Lemari16(int lebar, int panjang, int tinggi, String warna, int jumlahPintu) {
        super(lebar, panjang, tinggi, warna);
        this.jumlahPintu = jumlahPintu;
    }

    // Method Overriding
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

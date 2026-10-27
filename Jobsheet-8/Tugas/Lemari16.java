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

    // Buat
    @Override
    public void buat() {
        System.out.println("Cara membuat Lemari:");
        System.out.println("1. Merakit kerangka utama dan sisi samping lemari.");
        System.out.println("2. Memasang sekat-sekat rak di bagian dalam.");
        System.out.println("3. Memasang engsel dan menyambungkan " + this.jumlahPintu + " pintu ke kerangka utama.");
    }

    // Method Overriding
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

package Tugas;

public class Furniture16 {
    public int lebar;
    public int panjang;
    public int tinggi;
    public String warna;

    // Constructor 1: Tanpa parameter (Overloading)
    public Furniture16() {
    }

    // Constructor 2: Berparameter (Overloading)
    public Furniture16(int lebar, int panjang, int tinggi, String warna) {
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    // Method yang akan di-override di subclass
    public void cetakInfo() {
        System.out.println("Lebar       : " + lebar + " cm");
        System.out.println("Panjang     : " + panjang + " cm");
        System.out.println("Tinggi      : " + tinggi + " cm");
        System.out.println("Warna       : " + warna);
    }
}

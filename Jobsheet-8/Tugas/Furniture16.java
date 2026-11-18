package Tugas;

public abstract class Furniture16 {
    public int lebar;
    public int panjang;
    public int tinggi;
    public String warna;

    public Furniture16(int lebar, int panjang, int tinggi, String warna) {
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public abstract void buat();

    public void cetakInfo() {
        System.out.println("Lebar       : " + lebar + " cm");
        System.out.println("Panjang     : " + panjang + " cm");
        System.out.println("Tinggi      : " + tinggi + " cm");
        System.out.println("Warna       : " + warna);
    }
}

package Tugas;

public class Kucing16 implements Audible16 {
    private String nama;

    public Kucing16(String nama) {
        this.nama = nama;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meow... Meow!");
    }
}

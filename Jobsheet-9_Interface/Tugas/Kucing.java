package Tugas;

public class Kucing implements Audible {
    private String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meow... Meow!");
    }
}

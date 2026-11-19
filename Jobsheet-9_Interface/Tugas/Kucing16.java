package Tugas;

public class Kucing16 extends Hewan16 implements Audible16 {

    public Kucing16(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meow... Meow!");
    }
}
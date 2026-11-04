package Tugas;

public class Alarm16 implements Audible16 {
    private String tipe;

    public Alarm16(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public void bersuara() {
        System.out.println("Alarm " + tipe + " berbunyi: Bip.. Bip.. Bip!");
    }
}

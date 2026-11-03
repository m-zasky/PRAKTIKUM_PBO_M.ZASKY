package Tugas;

public class Alarm implements Audible {
    private String tipe;

    public Alarm(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public void bersuara() {
        System.out.println("Alarm " + tipe + " berbunyi: Bip.. Bip.. Bip!");
    }
}

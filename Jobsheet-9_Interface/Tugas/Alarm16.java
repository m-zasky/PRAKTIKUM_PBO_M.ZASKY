package Tugas;

public class Alarm16 extends AlatElektronik16 implements Audible16 {

    public Alarm16(String tipe) {
        super(tipe);
    }

    @Override
    public void bersuara() {
        System.out.println("Alarm " + tipe + " berbunyi: Bip.. Bip.. Bip!");
    }
}
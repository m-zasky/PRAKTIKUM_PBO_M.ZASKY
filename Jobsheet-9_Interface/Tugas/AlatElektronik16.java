package Tugas;

public class AlatElektronik16 {
    protected String tipe;

    public AlatElektronik16(String tipe) {
        this.tipe = tipe;
    }

    public void nyalakan() {
        System.out.println("Perangkat elektronik (" + tipe + ") dinyalakan.");
    }
}
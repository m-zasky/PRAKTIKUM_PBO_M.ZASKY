package Percobaan;

public class TV16 extends AlatElektronik16 implements Audible16 {
    public String jenisLayar;
    public int volume;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis Layar: " + jenisLayar + ", Volume: " + volume;
    }
}

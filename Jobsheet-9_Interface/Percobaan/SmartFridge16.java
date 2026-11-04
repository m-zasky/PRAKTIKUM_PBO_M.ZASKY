package Percobaan;

public class SmartFridge16 extends Kulkas16 implements Audible16 {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }
}

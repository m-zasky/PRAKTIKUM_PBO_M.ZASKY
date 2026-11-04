package Percobaan;

public class Kulkas16 extends AlatElektronik16 {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jumlah Pintu: " + jumlahPintu;
    }
}

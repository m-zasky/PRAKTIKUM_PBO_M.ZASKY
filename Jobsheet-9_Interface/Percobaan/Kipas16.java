package Percobaan;

public class Kipas16 extends AlatElektronik16 {
    public String jenis;

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis Kipas: " + jenis;
    }
}

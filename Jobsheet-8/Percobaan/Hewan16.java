package Percobaan;
public abstract class Hewan16 {
    public double berat;
    public String makanan;
    public String habitat;

    public Hewan16(double berat, String makanan, String habitat) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public abstract void bergerak();
    public abstract void bernapas();

    public void cetakInfo() {
        System.out.println("Berat   :" + berat);
        System.out.println("Makanan :" + makanan);
        System.out.println("Habitat :" + habitat);
    }
}

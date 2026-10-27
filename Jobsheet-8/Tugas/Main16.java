package Tugas;

public class Main16 {
    public static void main(String[] args) {
        // Instansiasi 2 objek subclass menggunakan constructor berparameter
        Meja16 meja1 = new Meja16(120, 60, 75, "Cokelat Kayu", 4);
        Lemari16 lemari1 = new Lemari16(150, 50, 200, "Putih Minimalis", 3);

        System.out.println("=== INFO MEJA ===");
        meja1.buat();
        meja1.cetakInfo();

        System.out.println("\n=== INFO LEMARI ===");
        lemari1.buat();
        lemari1.cetakInfo();
    }
}

package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Audible hewan = new Kucing("Mimi");
        Audible benda = new Alarm("Rumah");

        System.out.println("=== DEMO IMPLEMENTASI INTERFACE TUGAS ===");
        hewan.bersuara();
        benda.bersuara();
    }
}

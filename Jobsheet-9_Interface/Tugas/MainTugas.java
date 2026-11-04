package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Audible16 hewan = new Kucing16("Mimi");
        Audible16 benda = new Alarm16("Rumah");

        System.out.println("=== DEMO IMPLEMENTASI INTERFACE TUGAS ===");
        hewan.bersuara();
        benda.bersuara();
    }
}

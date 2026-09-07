public class DragonMain {
    public static void main(String[] args) {
        // Instansiasi 2 objek
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("STATUS AWAL");
        dragon1.printStatus();

        // 2. Simulasi Dragon 1
        System.out.println("=== DRAGON 1 BERGERAK ===");
        dragon1.changeDirection(1); // Ubah arah ke Atas
        dragon1.move(5); // Maju 5 langkah (y akan jadi 5)
        dragon1.printStatus();

        dragon1.changeDirection(2); // Ubah arah ke Kanan
        dragon1.move(10); // Maju 10 langkah (x akan jadi 10)
        dragon1.printStatus();

        // 3. Simulasi Dragon 2
        System.out.println("=== DRAGON 2 BERGERAK ===");
        // Menguji memanggil move() persis setelah instansiasi (menggunakan default
        // constructor)
        dragon2.move(3); // Akan maju ke kanan sebanyak 3 karena constructor default direction = 2
        dragon2.printStatus();

        dragon2.changeDirection(4); // Ubah arah ke Kiri
        dragon2.move(2); // Maju 2 langkah (x akan jadi 1)
        dragon2.printStatus();

        // Menguji arah yang salah (Validasi)
        dragon2.changeDirection(9); 
    }
}

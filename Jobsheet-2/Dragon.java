public class Dragon {
    // Deklarasi Atribut
    int x;
    int y;
    int direction;

    // konstruktor agar direction tidak bernilai 0.
    Dragon() {
        this.x = 0;
        this.y = 0;
        this.direction = 2;
    }

    // Method mengubah arah (hanya menerima 1,2,3,4)
    void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid, harap masukan angka 1-4.");
        }
    }

    // Method untuk berpindah posisi
    void move(int steps) {
        switch (direction) {
            case 1:// atas
                y += steps;
                break;
            case 2:// kanan
                x += steps;
                break;
            case 3:// bawah
                y -= steps;
                break;
            case 4:// kiri
                x -= steps;
                break;
            default:
                System.out.println("Arah belum terdefinisi dengan benar.");
                break;
        }
    }

    // Method untuk mencetak status
    void printStatus() {
        String namaArah = "";
        if (direction == 1)
            namaArah = "Atas";
        else if (direction == 2)
            namaArah = "Kanan";
        else if (direction == 3)
            namaArah = "Bawah";
        else if (direction == 4)
            namaArah = "Kiri";

        System.out.println("Posisi Dragon : (" + x + ", " + y + ")");
        System.out.println("Arah Dragon   : " + namaArah + " (" + direction + ")");
        System.out.println("--------------------------------");
    }

}
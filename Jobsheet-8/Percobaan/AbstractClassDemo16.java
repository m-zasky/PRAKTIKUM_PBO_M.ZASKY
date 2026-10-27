package Percobaan;
public class AbstractClassDemo16 {
    public static void main(String[] args) {
        // Hewan16 hewan1 = new Hewan16(10, "Rumput", "Savana");
        // hewan1.cetakInfo();
        // hewan1.bergerak();
        // hewan1.bernapas();

        // System.out.println("===========================");

        Lebah16 lebah1 = new Lebah16("Ratu", 0.05, "Nextar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println("==============================================");
        System.out.println("==============================================");

        Ular16 ular1 = new Ular16(true, 10, "tikus", "Sawah");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}

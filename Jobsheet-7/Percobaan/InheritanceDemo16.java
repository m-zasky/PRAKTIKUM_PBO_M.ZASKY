package Percobaan;
public class InheritanceDemo16 {
    public static void main(String[] args) {
        // Dosen16 dosen1 = new Dosen16();

        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.nip = "34329837";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1989432439";

        // System.out.println(dosen1.getAllInfo());

        // menginstansiasi object baru dengan constructor berparameter
        Dosen16 dosen2 = new Dosen16("34329837", "Yansy Ayuningtyas", 3000000, "1989432439");
        System.out.println(dosen2.getAllInfo());
    }
}
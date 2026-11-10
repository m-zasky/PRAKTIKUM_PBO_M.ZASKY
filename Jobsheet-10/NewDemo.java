import java.util.ArrayList; // Pastikan mengimpor kelas ArrayList

public class NewDemo {
    public static void main(String[] args) {
        Webpage webpage1 = new Webpage();
        webpage1.title = "Jurusan Teknologi Informasi Polinema";
        webpage1.url = "https://jti.polinema.ac.id/";
        webpage1.content = "<h1>Ini contoh heading</h1><br/>"; // (Catatan: tanda \ pada gambar diabaikan karena merupakan typo)

        Document doc1 = new Document();
        doc1.fileName = "PBO 2024.docx";
        doc1.content = "Contoh content Pemrograman Berorientasi Objek";

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(webpage1);
        printables.add(doc1);

        Printer printer1 = new Printer();
        printer1.cetak(webpage1);
        printer1.cetak(doc1);
    }
}
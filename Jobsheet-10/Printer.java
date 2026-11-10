public class Printer {
    public void cetak(Printable printable) {
        System.out.println("Memeriksa ketersediaan tinta");
        System.out.println("Memeriksa ketersediaan kertas");
        System.out.println("Mencetak..." + printable.getPrintableContent());
        System.out.println("Pencetakan selesai");
    }
}
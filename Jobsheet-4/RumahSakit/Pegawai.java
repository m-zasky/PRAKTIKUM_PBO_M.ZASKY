public class Pegawai {
    private String nip;
    private String nama;

    // Konstruktor
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip() {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + nip + ")";
    }
}
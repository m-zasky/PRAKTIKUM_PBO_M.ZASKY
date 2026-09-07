public class Anggota {
    // Atribut privat untuk menerapkan prinsip enkapsulasi (data/information hiding)
    private String nomorKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    // Constructor untuk menginisialisasi nilai atribut objek saat pertama kali
    // dibuat
    public Anggota(String nomorKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0; // Nilai awal pinjaman adalah 0
    }

    // Getter untuk mengakses atribut nomorKtp
    public String getNomorKtp() {
        return nomorKtp;
    }

    // Setter untuk memodifikasi atribut nomorKtp
    public void setNomorKtp(String nomorKtp) {
        this.nomorKtp = nomorKtp;
    }

    // Getter untuk mengakses atribut nama
    public String getNama() {
        return nama;
    }

    // Setter untuk memodifikasi atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengakses limit peminjaman
    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    // Setter untuk memodifikasi limit peminjaman
    public void setLimitPeminjaman(int limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }

    // Getter untuk mengakses jumlah pinjaman saat ini
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk melakukan pinjaman uang dengan validasi limit
    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    // Method untuk mengangsur pinjaman dengan validasi minimal 10%
    public void angsur(int nominal) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (jumlahPinjaman > 0 && nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= nominal;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}
public class Pegawai16 {
    public String nip;
    public String nama;
    public double gaji;

    // public Pegawai16() {
    //     System.out.println("Ini constructor class Pegawai16");
    // }

    public Pegawai16(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }


    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";

        return info;
    }
}
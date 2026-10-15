public class Pegawai16 {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai16() {
        System.out.println("Ini constructor class Pegawai16");
    }

    public String getInfo() {
        String info = "";
        info += "NIP    : " + nip + "\n";
        info += "Nama   : " + nama + "\n";
        info += "Gaji   : " + gaji + "\n";

        return info;
    }
}
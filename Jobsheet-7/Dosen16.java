public class Dosen16 extends Pegawai16 {
    public String nidn;

    // public Dosen16() {
    //     System.out.println("Ini constructor class Dosen16");
    // }

    public Dosen16(String nip, String nama, double gaji, String nidn) {
        // System.out.println("Ini constructor class Dosen yang berparameter");

        // modif construktor berparameter percobaan-7
        super(nip, nama, gaji);
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;
    }

    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
public class Dosen extends Pegawai implements Comparable<Dosen> {

    public String nidn;

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melakukan PBM");
        System.out.println("Melakukan Evaluasi");
    }

    // @Override
    // public int compareTo(Dosen otherDosen) {
    // return this.nama.compareTo(otherDosen.nama);
    // }

    @Override
    public int compareTo(Dosen otherDosen) {
        return this.nip.compareTo(otherDosen.nidn);
    }

}
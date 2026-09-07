public class Motor {
    // public String platNomor;
    // public boolean statusMesin;
    // public int kecepatan;

    // Ubas access level modifer atribut private
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public void displayInfo() {
        System.out.println("Plat Nomor  : " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan   : " + this.kecepatan);
        System.out.println("================================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean getStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        // this.kecepatan = kecepatan;

        // penerapan enkapsulasi
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off.");
        } else {
            this.kecepatan = kecepatan;
        }
    }
}

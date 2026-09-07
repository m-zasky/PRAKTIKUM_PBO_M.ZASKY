public class Motor {
    public String platNomor;
    public boolean statusMesin;
    public int kecepatan;

    public void displayInfo() {
        System.out.println("Plat Nomor  : " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan   : " + this.kecepatan);
        System.out.println("================================");
    }
}

public class MotorDemo {
    public static void main(String[] args) {

        // Motor-1
        Motor motor1 = new Motor();
        motor1.platNomor = "B 0838 XZ";
        int kecepatanBaru = 50;

        if (!motor1.statusMesin && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        motor1.displayInfo();

        // Motor-2
        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840 AB";
        motor2.statusMesin = true;
        kecepatanBaru = 40;

        if (!motor2.statusMesin && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanBaru;
        }
        motor2.displayInfo();

        // Motor-3
        Motor motor3 = new Motor();
        motor3.platNomor = "D 8343 CV";
        kecepatanBaru = 60;

        if (!motor3.statusMesin && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecepatanBaru;
        }
        motor3.displayInfo();

    }
}

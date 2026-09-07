public class User {
    public String username;
    public String email;
    public String password;
    public String name;

    public void displayInfo() {
        System.out.println("Username    :" + username);
        System.out.println("Emeil       :" + email);
        System.out.println("Password    :" + password);
        System.out.println("Nama        :" + name);
    }

    // Penambahan construktor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "polinema123";
    }
}

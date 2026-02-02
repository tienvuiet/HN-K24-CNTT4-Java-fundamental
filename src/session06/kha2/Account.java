package session06.kha2;

public class Account {
    String username;
    String password;
    String email;

    public Account() {
    };

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;

    }
    public void hienThiThongTinTk(){
        System.out.printf("User name: %s\n", username);
        System.out.printf("Email: %s\n", email);
    }

    public void hienThiThongTinTk2(){
        System.out.printf("User name: %s\n", username);
        System.out.printf("Password: %s\n", password);
        System.out.printf("Email: %s\n", email);
    }
}

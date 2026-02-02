package session07.xuatsac2;

public class User {
     final int id ;
     String username;
     String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public void thongTinUser(){
        System.out.printf("Id: %d", id);
        System.out.printf("Username: %s", username);
        System.out.printf("Password: %s", password);
    }
}

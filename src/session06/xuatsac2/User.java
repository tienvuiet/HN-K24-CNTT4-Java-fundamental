package session06.xuatsac2;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User() {}

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void disPlayUser() {
        System.out.println("Ma: " + id);
        System.out.println("Ten: " + username);
        System.out.println("Email: " + email);
    }
}

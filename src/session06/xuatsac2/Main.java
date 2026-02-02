package session06.xuatsac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User();

        System.out.print("Nhap id nguoi dung: ");
        u.setId(sc.nextLine());

        String username;
        do {
            System.out.print("Nhap username: ");
            username = sc.nextLine();
        } while (username == null || username.trim().isEmpty());
        u.setUsername(username);

        String password;
        do {
            System.out.print("Nhap password: ");
            password = sc.nextLine();
        } while (password == null || password.trim().isEmpty());
        u.setPassword(password);

        String email;
        String emailRegex = "^[\\w]+@[\\w]+\\.com$";
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
        } while (email == null || email.trim().isEmpty() || !email.matches(emailRegex));
        u.setEmail(email);

        System.out.println("\nThong tin nguoi dung:");
        u.disPlayUser();
    }
}

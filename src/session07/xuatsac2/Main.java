package session07.xuatsac2;

public class Main {
    static void main(String[] args) {
        User u1 = new User(1, "user1", "151906");
        User u2 = new User(2, "user2", "132131");
        UserManager.addUser(u1);
        UserManager.addUser(u2);
        u1.thongTinUser();
        u2.thongTinUser();

        System.out.println("U1 check: "+ UserManager.checkLogin("user1", "151906"));
    }
}

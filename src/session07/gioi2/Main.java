package session07.gioi2;

public class Main {
    static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("Vu viet tien");
        ClassRoom sv2 = new ClassRoom("Tien");

        sv1.dongTien(22);
        sv2.dongTien(33);

        ClassRoom.displayMoney();
    }
}

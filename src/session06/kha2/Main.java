package session06.kha2;

public class Main {
    static void main(String[] args) {
    Account ac1 = new Account(
        "Vu viet Tien",
        "151906",
        "tienvuviet151906"
    );

    ac1.hienThiThongTinTk();

    ac1.setPassword("Tien dep trai");

    ac1.hienThiThongTinTk2();
    }
}

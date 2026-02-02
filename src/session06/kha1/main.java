package session06.kha1;

public class main {
    static void main(String[] args) {
        Student st1 = new Student(
                "SV01",
                "Vu Viet Tien",
                2006,
                9.0
        );
        Student st2 = new Student(
                "SV02",
                "Tien dep trai",
                2005,
                8.5
        );
        st1.hienThiThongTin();
    }
}

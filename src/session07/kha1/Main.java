package session07.kha1;

public class Main {
    static void main(String[] args) {
        Student s1 = new Student("SV01", "Vu viet tien");
        Student s2 = new Student("SV02", "Tien vu viet");

        s1.thongTinSinhVien();
        s2.thongTinSinhVien();
        Student.tongSoSinhVien();
    }
}

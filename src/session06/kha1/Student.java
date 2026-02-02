package session06.kha1;

public class Student {
    String maSv;
    String hoTen;
    int namSinh;
    double diemTrungBinh;

    public Student() {
    };

    public Student(String maSv, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void hienThiThongTin(){
        System.out.printf("MaSV: %s\n", maSv);
        System.out.printf("Ho ten: %s\n", hoTen);
        System.out.printf("Nam sinh: %d\n", namSinh);
        System.out.printf("Diem trung binh: %.0f\n", diemTrungBinh);
    }
}

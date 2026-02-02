package session06.gioi2;

public class Employee {
    String maNhanVien;
    String tenNhanVien;
    double luongNhanVien;

    public Employee() {
    }

    public Employee(String maNhanVien, String tenNhanVien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
    }

    public Employee(String maNhanVien, String tenNhanVien, double luongNhanVien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public void hienThiThongTinNhanVien(){
        System.out.println("Ma nhan vien: "+ maNhanVien);
        System.out.println("Ten nhan vien: "+ tenNhanVien);
        System.out.println("Luong nhan vien: "+ luongNhanVien);
    }
}

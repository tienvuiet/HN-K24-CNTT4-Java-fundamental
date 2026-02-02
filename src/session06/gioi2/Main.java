package session06.gioi2;

public class Main {
    static void main(String[] args) {
       Employee e1 = new Employee();
       Employee e2 = new Employee(
         "E01",
         "Vu Viet Tien"

       );
       Employee e3 = new Employee(
               "E02",
               "Tien Vu Viet",
               3000
       );

       e1.hienThiThongTinNhanVien();
       e2.hienThiThongTinNhanVien();
       e3.hienThiThongTinNhanVien();
    }
}

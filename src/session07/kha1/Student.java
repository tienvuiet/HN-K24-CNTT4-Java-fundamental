package session07.kha1;

public class Student {
    String maSv ;
    String tenSv;
    public  static  int totalStudent = 0;



    public Student(String maSv, String tenSv) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        totalStudent++;
    }
    public  void thongTinSinhVien(){
        System.out.printf("Ma sinh vien: %s\n", maSv);
        System.out.printf("Ten sinh vien: %s\n", tenSv);
    }
    public static void tongSoSinhVien(){
        System.out.println("Tong so sinh vien: "+ totalStudent);
    }
}

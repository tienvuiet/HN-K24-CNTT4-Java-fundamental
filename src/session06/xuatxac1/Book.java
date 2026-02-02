package session06.xuatxac1;

public class Book {
    String tenSach;
    int namXuatBan;

    public Book() {
    }

    public Book(String tenSach, int namXuatBan) {
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
    }
    public void hienThiSach(){
        System.out.println("Ten sach: "+ tenSach);
        System.out.println("Nam xuat ban: "+ namXuatBan);
    }

}

package review.KeThuaDaHinh;

public class Main {
    public static void main(String[] args) {
        Shape hinhChuNhat = new Rectangle("hinhChuNhat01",4.4,6.6,0);
        Shape hinhVuong = new Rectangle("hinhVuong01",6);
        Shape hinhTron = new Circle("hinhTron01",5.5);

        System.out.println("Dien tich hinh chu nhat: "+ hinhChuNhat.calculateArea());
        System.out.println("Dien tich hinh vuong: "+hinhVuong.calculateArea());
        System.out.println("Dien tich hinh tron: "+hinhTron.calculateArea());
        System.out.println("Chu vi hinh chu nhat: "+ hinhChuNhat.calculatePerimeter());
        System.out.println("Chu vi hinh vuong "+hinhVuong.calculatePerimeter() );
    }
}

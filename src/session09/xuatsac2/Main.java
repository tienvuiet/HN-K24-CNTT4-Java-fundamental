package session09.xuatsac2;

public class Main {
    static void main(String[] args) {
        Shape[] shapes = {
                new Circle("01",8),
                new Rectangle("02", 12,3)
        };
        double tongDienTich = 0;
        for(Shape e: shapes){
            tongDienTich += e.area();
        }
        System.out.println("Tong dien tich tat ca cac hinh: "+tongDienTich);
    }
}

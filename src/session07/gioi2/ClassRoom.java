package session07.gioi2;

public class ClassRoom {
    String tenSv;
    public static  double classFund = 0;

    public ClassRoom(String tenSv) {
        this.tenSv = tenSv;
    }

    public void  dongTien(double tienDong){
        if (tienDong<0){
            System.out.printf("Nhap gia tien >0\n");
        }else{
            classFund += tienDong;
        }
    }
    public static  void displayMoney(){
        System.out.printf("Tien quy lop la: %.0f", classFund);
    }
}
//❗ Method dùng biến instance → KHÔNG được static
//❗ Method chỉ dùng biến static → NÊN static

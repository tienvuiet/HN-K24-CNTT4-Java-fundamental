package session10.Kha2;

public class Moto extends Vehicle{
    String phuongThucDiChuyen;

    public Moto(String brand, String phuongThucDiChuyen) {
        super(brand);
        this.phuongThucDiChuyen = phuongThucDiChuyen;
    }

    @Override
    public void move() {
        System.out.println("Ten phuong tien: "+brand);
        System.out.println("Phuong thuc di chuyen: "+phuongThucDiChuyen);
    }
}

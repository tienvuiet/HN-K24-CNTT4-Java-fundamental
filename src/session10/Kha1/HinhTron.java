package session10.Kha1;

public class HinhTron implements Shape{
    private  double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double getArea() {
        return Math.PI*banKinh*banKinh;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*banKinh;
    }
}

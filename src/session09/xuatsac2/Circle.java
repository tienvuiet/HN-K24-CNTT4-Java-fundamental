package session09.xuatsac2;

public class Circle extends Shape{
    private double banKinh;

    public Circle(String idShape, double banKinh) {
        super(idShape);
        this.banKinh = banKinh;
    }

    @Override
    public double area() {
        return 3.14 * banKinh *banKinh;
    }
}

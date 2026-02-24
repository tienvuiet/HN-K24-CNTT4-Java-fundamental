package review.KeThuaDaHinh;

public class Circle extends Shape{
    private double banKinh;

    public Circle(String idShape, double banKinh) {
        super(idShape);
        this.banKinh = banKinh;
    };

    @Override
    public double calculateArea() {
        return Math.PI*banKinh*banKinh;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

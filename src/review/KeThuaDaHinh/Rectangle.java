package review.KeThuaDaHinh;

public class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(String idShape, double width, double height, double canh) {
        super(idShape);
        this.width = width;
        this.height = height;

    }

    public Rectangle(String idShape, double canh) {
        super(idShape);
        this.width = canh;
        this.height = canh;
    }

    public Rectangle(String idShape) {
        super(idShape);
    }

    public double chuVi(double width, double height){
        return (width+ height)*2;
    }
    public double chuVi(double canh){
        return canh*4;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width+ height)*2;
    }
}

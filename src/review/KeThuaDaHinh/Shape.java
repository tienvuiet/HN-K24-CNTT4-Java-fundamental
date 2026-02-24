package review.KeThuaDaHinh;

public abstract class Shape {
    private  String idShape ;

    public Shape(String idShape) {
        this.idShape = idShape;
    };
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

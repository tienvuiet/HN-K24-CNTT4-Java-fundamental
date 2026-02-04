package session09.xuatsac2;

public class Rectangle extends Shape {
    private double chieuDai;
    private double chieuRong;

    public Rectangle(String idShape, double chieuDai, double chieuRong) {
        super(idShape);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double area() {
        return chieuDai * chieuRong;
    }
}

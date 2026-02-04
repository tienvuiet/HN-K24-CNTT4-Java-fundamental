package session09.xuatsac2;

public abstract class Shape {
    private String idShape ;

    public Shape(String idShape) {
        this.idShape = idShape;
    }
    public abstract  double area();
}

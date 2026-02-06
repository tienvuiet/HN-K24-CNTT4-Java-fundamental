package session10.Gioi2;

public class Fish extends Animal implements Swimmable{


    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Boi: "+ name);
    }
}

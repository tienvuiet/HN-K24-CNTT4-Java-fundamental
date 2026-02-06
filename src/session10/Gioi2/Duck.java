package session10.Gioi2;

public class Duck extends Animal implements Flyable,Swimmable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bay: "+name);
    }

    @Override
    public void swim() {
        System.out.println("Boi: "+name);
    }
}

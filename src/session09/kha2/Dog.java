package session09.kha2;

public class Dog extends Animal{
    private String id;

    public Dog(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public void sound() {
        System.out.println("Ma dong vat: "+id);
        super.sound();
    }
}

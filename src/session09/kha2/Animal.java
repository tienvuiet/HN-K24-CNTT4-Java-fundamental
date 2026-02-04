package session09.kha2;

public class Animal {
    private  String name;
    private  int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sound(){
        System.out.println("Keu: "+name);
        System.out.println("Tuoi" + age);
    }
}

package session09.kha1;

public class Person {
     private String fullName;
     private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public void display(){
        System.out.println("Ho va ten" + fullName);
        System.out.println("Tuoi" + age);
    }
}

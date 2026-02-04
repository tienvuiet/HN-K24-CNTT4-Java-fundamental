package session09.gioi2;

public class Animal {
    private  String id;
    private  String animalName;

    public Animal(String id, String animalName) {
        this.id = id;
        this.animalName = animalName;
    }
    public void disPlay(){
        System.out.println("Id: " +id );
        System.out.println("Animal name: " +animalName);
    }
}

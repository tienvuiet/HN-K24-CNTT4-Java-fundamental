package session09.gioi2;

public class Main {
    static void main(String[] args) {
        Animal animal = new Dog("DV01", "CHO","gau gau");
//        animal.disPlay();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.hienthiTiengKeu();
        }
    }
}

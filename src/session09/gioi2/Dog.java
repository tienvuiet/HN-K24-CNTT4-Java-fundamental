package session09.gioi2;

public class Dog extends Animal {
    private String tiengKeu;

    public Dog(String id, String animalName, String tiengKeu) {
        super(id, animalName);
        this.tiengKeu = tiengKeu;
    }

    public void hienthiTiengKeu(){
        System.out.println("Tieng keu: "+tiengKeu);
    }

    @Override
    public void disPlay() {
        super.disPlay();
        System.out.println("Tieng keu: "+tiengKeu);
    }
}

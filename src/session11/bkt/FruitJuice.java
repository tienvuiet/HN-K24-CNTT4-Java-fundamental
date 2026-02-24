package session11.bkt;

public class FruitJuice extends Drink implements IMixable{
   private int discountPercent;

    public FruitJuice(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.getPrice();
        return finalPrice - (finalPrice * discountPercent/100);
    };

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gia sau khi sua: "+ calculatePrice());
    }

    @Override
    public void mix() {
        System.out.println("Dang ep trai cay tuoi");
    }
}

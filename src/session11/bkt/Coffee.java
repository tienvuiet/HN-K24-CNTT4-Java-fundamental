package session11.bkt;

public class Coffee extends Drink {
    private  boolean hasMilk;

    public Coffee(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.getPrice();
        if(hasMilk ){
           finalPrice += 5000;
        }
        return finalPrice;
    };

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gia sau khi sua: "+ calculatePrice());
        if (hasMilk == true){
            System.out.println("Co sua");
        }else{
            System.out.println("Den da");
        }
    }
}

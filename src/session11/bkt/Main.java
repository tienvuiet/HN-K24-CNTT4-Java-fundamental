package session11.bkt;

public class Main {
    static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        Coffee coffee01 = new Coffee("dr01", "Bac xiu", 30000, true );
        FruitJuice  fruitJuice01 = new FruitJuice("dr02","Nuoc cam",40000, 10);
        drinks[0] = coffee01;
        drinks[1] = fruitJuice01;
        drinks[2] = null;

        for(int i = 0 ; i  < drinks.length; i++){
            if(drinks[i] != null){
                drinks[i].displayInfo();
                drinks[i].calculatePrice();
                if(drinks[i] instanceof IMixable){
                    ((IMixable) drinks[i]).mix();
                }
            }
        }
    }
}

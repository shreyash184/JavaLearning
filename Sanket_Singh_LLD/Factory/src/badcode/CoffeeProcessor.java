package badcode;

public class CoffeeProcessor {

    public Coffee prepareCoffee(String whichCoffee){
        Coffee coffee;
        if(whichCoffee.equals("Expresso")){
            coffee = new Expresso();
        }else{
            coffee = new Latte();
        }
        return coffee;
    }
}

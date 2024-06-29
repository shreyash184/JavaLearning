package bettercode;


public class CoffeeFactory {
    public Coffee getCoffee(String whichCoffee){
        Coffee coffee;
        if(whichCoffee.equals("Expresso")){
            coffee = new Expresso();
        }else{
            coffee = new Latte();
        }
        return coffee;
    }
}

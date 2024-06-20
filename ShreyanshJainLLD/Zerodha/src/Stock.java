public class Stock {
    String name;
    double price;

    EXNG_TYPE exchange;

    public Stock(String name, double price, EXNG_TYPE exchange){
        this.name = name;
        this.price = price;
        this.exchange = exchange;
    }

}

public class Stock {
    String name;
    EXNG_TYPE exngType;
    double price;

    public Stock(String name, EXNG_TYPE exngType, double price){
        this.name = name;
        this.exngType = exngType;
        this.price = price;
    }
}

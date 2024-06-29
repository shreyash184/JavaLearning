package Creational;


interface OrderFactory{
    public Order createOrder();
}

class MarketOrderFactory implements OrderFactory{

    @Override
    public Order createOrder() {
        return new MarketOrder();
    }
}

class LimitOrderFactory implements OrderFactory{


    @Override
    public Order createOrder() {
        return new LimitOrder();
    }
}



interface Order{

}

class MarketOrder implements Order{
    public MarketOrder(){
        System.out.println("Market Order");
    }
}

class LimitOrder implements  Order{
    public LimitOrder(){
        System.out.println("Limit Order");
    }
}

public class Factory {

    public static void main(String[] args) {
        OrderFactory marketOrderFactory = new MarketOrderFactory();
        Order marketOrder = marketOrderFactory.createOrder();
    }
}

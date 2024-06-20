public class Order {
    TXN_TYPE type;
    ORDER_TYPE orderType;
    int quantity;

    Stock stock;

    public Order(TXN_TYPE type, ORDER_TYPE orderType, int quantity, Stock stock){
        this.type = type;
        this.orderType = orderType;
        this.quantity = quantity;
        this.stock = stock;
    }

    public TXN_TYPE getTxnType(){
        return this.type;
    }
}

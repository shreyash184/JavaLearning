public class LimitOrder implements Order{
    TXN_TYPE type;
    int quantity;

    Stock stock;

    public LimitOrder(TXN_TYPE type, int quantity, Stock stock){
        this.type = type;
        this.quantity = quantity;
        this.stock = stock;
    }

    public TXN_TYPE getTxnType(){
        return this.type;
    }
}

public class OrderFactory {

    public Order getOrder(TXN_TYPE type, ORDER_TYPE orderType, int quantity, Stock stock){
        if(orderType == ORDER_TYPE.MARKTET){
            return new MarketOrder(type, quantity, stock);
        }else if(orderType == ORDER_TYPE.LIMIT){
            return new LimitOrder(type, quantity, stock);
        }
        return null;
    }
}

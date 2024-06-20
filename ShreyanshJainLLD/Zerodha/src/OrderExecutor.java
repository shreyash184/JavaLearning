public class OrderExecutor {
    ExchangeConnector exchangeConnector;
    public OrderExecutor(){
        exchangeConnector = ExchangeConnector.getInstance();
    }

    public void placeOrder(String userId, Order order){
        exchangeConnector.sendOrderToExecution();
    }
}

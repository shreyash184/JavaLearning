public class OrderManager {
    OrderValidator orderValidator;
    OrderExecutor orderExecutor;

    public OrderManager(){
        orderValidator = new OrderValidator();
        orderExecutor = new OrderExecutor();
    }

    public void placeOrder(String userId, Order order){
        if(orderValidator.validateOrder(userId, order)){
            orderExecutor.placeOrder(userId, order);
        }
    }
}

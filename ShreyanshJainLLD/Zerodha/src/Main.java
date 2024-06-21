//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Shreyash");
        UserSystem.addUser("Shreyash", user);
        Stock stock = new Stock("Goldman Sachs", 450, EXNG_TYPE.NSE);

        OrderFactory orderFactory = new OrderFactory();

        Order order = orderFactory.getOrder(TXN_TYPE.BUY, ORDER_TYPE.LIMIT, 20, stock);

        OrderManager orderManager = new OrderManager();
        orderManager.placeOrder("Shreyash", order);
        System.out.println(order.getClass().getName());
    }
}
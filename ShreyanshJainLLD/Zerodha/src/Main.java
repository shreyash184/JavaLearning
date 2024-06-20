//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Shreyash");
        UserSystem.addUser("Shreyash", user);
        Stock stock = new Stock("Goldman Sachs", 450, EXNG_TYPE.NSE);
        Order order = new Order(TXN_TYPE.BUY, ORDER_TYPE.MARKTET, 20, stock);

        OrderManager orderManager = new OrderManager();
        orderManager.placeOrder("Shreyash", order);
    }
}
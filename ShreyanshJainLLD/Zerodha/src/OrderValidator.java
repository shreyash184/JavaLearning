public class OrderValidator {

    public boolean validateOrder(String userId, Order order){
        User user = UserSystem.getUser(userId);

        if(order.getTxnType() == TXN_TYPE.BUY){
            System.out.println("Checking if user has funds to buy");
        }else{
            System.out.println("Checking if user has stocks to sell");
        }
        System.out.println("Assuming user has validated the order");
        return true;
    }
}

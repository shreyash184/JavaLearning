import java.util.concurrent.TransferQueue;

abstract class OrderHandler{

    public OrderHandler nextHandler;

    public  OrderHandler(OrderHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void processOrder(String order);
}

class OrderValidateHandler extends OrderHandler{

    public OrderValidateHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    public void processOrder(String order){
        System.out.println("Validating the order : " + order);
        // Validation logic here
        if(nextHandler != null){
            this.nextHandler.processOrder(order);
        }
    }
}

class PaymentProcessingHandler extends  OrderHandler{
    public PaymentProcessingHandler(OrderHandler nextHandler){
        super(nextHandler);
    }

    public void processOrder(String order){
        System.out.println("Payment processing for order : " + order);

        // Payment processing logic

        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}

class OrderTrackingHandler extends OrderHandler{
    public OrderTrackingHandler(OrderHandler nextHandler){
        super(nextHandler);
    }

    public void processOrder(String order){
        System.out.println("Tracking for order : "+ order);

        //tracking login here

        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        OrderHandler orderHandler = new OrderValidateHandler(
                                        new PaymentProcessingHandler(
                                                new OrderTrackingHandler(null)));

        orderHandler.processOrder("Goldman");
    }
}
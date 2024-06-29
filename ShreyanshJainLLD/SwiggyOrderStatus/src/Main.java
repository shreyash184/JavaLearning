import java.util.ArrayList;
import java.util.List;

interface  Observer{
    public void update(String status);
}

class Customer implements  Observer{
    public void update(String status){
        System.out.println("Customer " + status);
    }
}

class Delivery implements  Observer{
    public void update(String status){
        System.out.println("Delivery " + status);
    }
}

class Order{
    private String status;
    List<Observer> observers;

    public Order(String status){
        this.status = status;
        observers = new ArrayList<>();
    }

    public void setStatus(String status){
        this.status = status;
        this.notifyObservers();
    }

    public void register(Observer observer){
        this.observers.add(observer);
    }

    public void unregister(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : this.observers){
            observer.update(this.status);
        }
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Order Placed");

        Observer customer = new Customer();
        Observer delivery = new Delivery();

        order1.register(customer);
        order1.register(delivery);

        order1.setStatus("Your order is out for delivery");

        System.out.println("-----------------------------------------");

        order1.setStatus("Order is delivered now");
    }
}
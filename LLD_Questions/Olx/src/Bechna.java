import java.util.ArrayList;
import java.util.List;

public class Bechna {
    public List<Property> propertyList;
    public List<User> userList;
    public List<Order> orderList;

    public Bechna(){
        User user1 = new User(1, "shreyash", 123, "email1", 123);
        User user2 = new User(2, "akboy", 12, "email2", 13);
        User user3 = new User(3, "pboy", 122, "email3", 12);
        User user4 = new User(4, "sboy", 133, "email4", 23);
        User user5 = new User(5, "rboy", 1453, "email5", 1230);

        Property property1 = new Property(1, 2, "Wardha", 30.0, "This is property is in India");
        Property property2 = new Property(2, 1, "Pune", 30.0, "This is property is in India");
        Property property3 = new Property(3, 2, "Amarvati", 30.0, "This is property is in India");
        Property property4 = new Property(4, 3, "Mumbai", 30.0, "This is property is in India");
        Property property5 = new Property(5, 4, "Akola", 30.0, "This is property is in India");
        Property property6 = new Property(6, 5, "Nagpur", 30.0, "This is property is in India");
        Property property7 = new Property(7, 5, "Nanded", 30.0, "This is property is in India");


        userList = new ArrayList<>(1000);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        propertyList = new ArrayList<>(5000);
        propertyList.add(property1);
        propertyList.add(property2);
        propertyList.add(property3);
        propertyList.add(property4);
        propertyList.add(property5);
        propertyList.add(property6);
        propertyList.add(property7);

        orderList = new ArrayList<>(10000);
    }


    public List<User> getAllUsers(){
        return this.userList;
    }
    public void addUser(User user){
        userList.add(user);
    }

    public List<Property> getAllProperties(){
        return this.propertyList;
    }
    public void addProperty(Property property){
        propertyList.add(property);
    }

    public void removeProperty(Property property){
        propertyList.remove(property);
    }

    public List<Order> getOrderList() {
        return this.orderList;
    }

    public void addOrderCompleted(Order order){
        orderList.add(order);
    }
}

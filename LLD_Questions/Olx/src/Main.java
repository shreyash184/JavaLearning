import javax.swing.*;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void display(){
        System.out.println("Select one of the options below : ");
        System.out.println("1. Buy the Property.");
        System.out.println("2. Sell the Property.");
        System.out.println("3. Get the Hot Properties.");
        System.out.println("4. Just get the List of properties.");
    }
    public static void main(String[] args) {


        display();
        Scanner in = new Scanner(System.in);


        Bechna init = new Bechna();
        int choice = in.nextInt();;
        while(true){

            switch(choice){
                case 1:
                    System.out.println("Please provide the info below");
                    in.nextLine();
                    System.out.print("Name : ");
                    String nameBuy = in.nextLine();
//                    in.nextLine();
                    System.out.print("Phone No : ");
                    Integer phoneNoBuy = in.nextInt();
                    in.nextLine();
                    System.out.print("Email : ");
                    String emailBuy = in.nextLine();
//                    in.nextLine();
                    System.out.print("Aadhar No : ");
                    Integer aadharBuy = in.nextInt();

                    // Considering the user is new, we can write the logic if the user is visiting first time
                    User.count = User.count + 1;
                    init.addUser(new User(User.count, nameBuy, phoneNoBuy, emailBuy, aadharBuy));
                    System.out.print("Please enter the Property Id that you want to buy : ");
                    int propertyId = in.nextInt();
                    in.nextLine();
                    // Here we are expecting that buyer paid all the money
                    Order.count = Order.count + 1;
                    init.addOrderCompleted(new Order(Order.count, Status.COMPLETED, propertyId, User.count));

                    // Now remove the property from the list
                    Property propertyToDelete = null;
                    for(Property property : init.getAllProperties()){
                        if(property.getId().equals(propertyId)){
                            propertyToDelete = property;
                            init.removeProperty(propertyToDelete);
                            break;
                        }
                    }
                    System.out.println("Congrats, You bought the property :)");
                    break;
                case 2:
                    System.out.println("Please provide the info below");
                    in.nextLine();
                    System.out.print("Name : ");
                    String name = in.nextLine();
//                    in.nextLine();
                    System.out.print("Phone No : ");
                    Integer phoneNo = in.nextInt();
                    in.nextLine();
                    System.out.print("Email : ");
                    String email = in.nextLine();
//                    in.nextLine();
                    System.out.print("Aadhar No : ");
                    Integer aadhar = in.nextInt();
                    User.count = User.count + 1;
                    init.addUser(new User(User.count, name, phoneNo, email, aadhar));
                    System.out.println("To sell the property please give the info below : ");
                    in.nextLine();
                    System.out.print("Location : ");
                    String location = in.nextLine();
                    System.out.print("Price : ");
                    Double price = in.nextDouble();
                    in.nextLine();
                    System.out.print("Description : ");
                    String desc = in.nextLine();

                    Property.count = Property.count + 1;
                    init.addProperty(new Property(Property.count, User.count, location, price, desc));
                    System.out.println("Congrats, Your property is listed, as you can see below.");
                    List<Property> propertyList = init.getAllProperties();
                    for(Property property : propertyList){
                        System.out.println(property.toString());
                    }
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    List<Property> listOfProperty = init.getAllProperties();
                    for(Property property : listOfProperty){
                        System.out.println(property.toString());
                    }
                    break;
                default:
                    System.out.println("Please select the valid choice");
            }

            System.out.println("Please enter exit to leave the application and continue to continue");
            String isDone = in.nextLine();
            if(isDone.equals("exit")){
                break;
            }else if(isDone.equals("continue")){
                display();
                choice = in.nextInt();;
            }
        }

    }
}
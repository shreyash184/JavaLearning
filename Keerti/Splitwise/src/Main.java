//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.ObjectStreamException;
import java.util.*;


class User{
    private String userId;
    private String name;

    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public String getUser(){
        return userId;
    }

    public String getName(){
        return name;
    }
}

class UserManager{
    private static UserManager instance;
    private Map<String, User> users;

    private UserManager(){
        users = new HashMap<>();
    }

    public static UserManager getInstance(){
        if(instance == null){
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(User user){
        users.put(user.getUser(), user);
    }

    public User getUser(String userId){
        return users.get(userId);
    }
}

interface ExpenseFactory{
    Expense createExpense(double totalAmount, List<User> participants);
}

class UnequalExpenseFactory implements ExpenseFactory{

    @Override
    public Expense createExpense(double totalAmount, List<User> participants) {
        return new UnequalExpense(totalAmount, participants);
    }
}

class EqualExpenseFactory implements  ExpenseFactory{

    @Override
    public Expense createExpense(double totalAmount, List<User> participants) {
        return new EqualExpense(totalAmount, participants);
    }
}

interface Observer{
    void update();
}

class ExpenseObserver implements Observer{

    @Override
    public void update() {
        // update //logiv here
    }
}

class SplitwiseFacade{
    private UserManager userManager;
    private List<Expense> expenses;
    private List<Observer> observers;

    public SplitwiseFacade(){
        userManager = UserManager.getInstance();
        expenses = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void addUser(User user){
        userManager.addUser(user);
    }

    public void addEqualExpense(double totalAmount, List<User> participants){
        ExpenseFactory expenseFactory = new EqualExpenseFactory();
        Expense expense = expenseFactory.createExpense(totalAmount, participants);
        expenses.add(expense);
        expense.calculateShares();
        for(Map.Entry<User, Double> entry : expense.shares.entrySet()){
            System.out.println(entry.getKey().getName() + " = " + entry.getValue());
        }
        notifyObservers();
    }

    private void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}



public class Main {
    public static void main(String[] args) {
        SplitwiseFacade splitwise = new SplitwiseFacade();
        User user1 = new User("1", "Goldman");
        User user2 = new User("2", "DE shaw");
        splitwise.addUser(user1);
        splitwise.addUser(user2);

        splitwise.addObservers(new ExpenseObserver());

        splitwise.addEqualExpense(100, Arrays.asList(user1, user2));
        splitwise.addEqualExpense(500, Arrays.asList(user1, user2));
    }
}
import java.util.ArrayList;
import java.util.List;

public class SplitwiseFacade {
    UserManager userManager;
    List<Expense> expenses;


    public SplitwiseFacade(){
        userManager = new UserManager();
        expenses = new ArrayList<>();
    }

    public void addUser(User user){
        userManager.addUsers(user);
    }

    public void addExpense(double totalAmout, List<User> participants){
        ExpenseFactory
    }
}

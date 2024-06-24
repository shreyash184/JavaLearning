import java.util.List;

public interface ExpenseFactory {

    public Expense createExpense(double totalAmount, List<User> participants);
}

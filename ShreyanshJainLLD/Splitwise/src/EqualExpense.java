import java.util.List;

public class EqualExpense extends  Expense{
    public EqualExpense(double totalAmount, List<User> participants){
        super(totalAmount, participants, new EqualSplitStrategy());
    }

    @Override
    public void calculateShares() {
        shares = splitStrategy.splitExpense(totalAmount, participants);
    }
}

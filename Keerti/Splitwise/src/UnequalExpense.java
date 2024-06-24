import java.util.List;

public class UnequalExpense extends Expense{

    public UnequalExpense(double totalAmoount, List<User>participants){
        super(totalAmoount, participants, new UnequalSplitStrategy());
    }


    @Override
    public void calculateShares() {
        shares = splitStrategy.splitExpense(totalAmount, participants);
    }
}

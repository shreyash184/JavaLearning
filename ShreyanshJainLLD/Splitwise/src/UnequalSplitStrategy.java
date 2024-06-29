import java.util.List;
import java.util.Map;

public class UnequalSplitStrategy implements SplitStrategy{

    @Override
    public Map<User, Double> splitExpense(double totalAmount, List<User> participants) {
        // For the sake of the simplicity I am making this as below
        return new EqualSplitStrategy().splitExpense(totalAmount, participants);
    }
}

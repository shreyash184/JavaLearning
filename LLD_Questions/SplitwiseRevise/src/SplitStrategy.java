import java.util.List;
import java.util.Map;

public interface SplitStrategy {
    public Map<User, Double> splitExpense(int totalAmount, List<User> participants);
}

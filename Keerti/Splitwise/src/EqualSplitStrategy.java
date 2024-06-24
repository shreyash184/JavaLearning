import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy{

    @Override
    public Map<User, Double> splitExpense(double totalAmount, List<User> participants) {
        Map<User, Double> shares = new HashMap<>();
        double share = totalAmount / participants.size();
        for(User user : participants){
            shares.put(user, share);
        }
        return shares;
    }
}

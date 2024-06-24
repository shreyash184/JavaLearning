import java.util.List;
import java.util.Map;

public abstract class Expense {

    int totalAmount;
    List<User> participants;
    Map<User, Double> shares;
    SplitStrategy splitStrategy;


    public Expense(int totalAmount, List<User> participants, SplitStrategy splitStrategy){
        this.totalAmount = totalAmount;
        this.participants = participants;
        this.splitStrategy = splitStrategy;
    }

    public abstract Map<User, Double> calculateShare();
}

import java.util.HashMap;

public class UserSystem {
    static HashMap<String, User> users = new HashMap<>();;

    public static void addUser(String userId, User user){
        users.put(userId, user);
    }

    public static User getUser(String userId){
        return users.get(userId);
    }
}

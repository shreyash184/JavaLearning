import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {

    Map<String, User> users;

    public UserManager(){
        users = new HashMap<>();
    }

    public void addUsers(User user){
        users.put(user.getUserId(), user);
    }

    public User getUser(String userId){
        return users.get(userId);
    }
}

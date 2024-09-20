package desafio1;
import java.util.ArrayList;
import java.util.List;

class UserManager {
    private static UserManager instance = null;
    private List<User> users;
    private int nextId;

    private UserManager() {
        users = new ArrayList<>();
        nextId = 1;
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(String name) {
        User user = new User(nextId, name);
        users.add(user);
        nextId++;
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName());
        }
    }
}
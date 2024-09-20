package desafio1.resultado;

/*
 * Este foi o resultado que a plataforma aceitou
 * Nele retirei os consoles de pergunta para o usuário e juntei as 3 classes que criei de teste
 * Nela posso ler e entender a implementação do pattern Singleton
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

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

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        int numUsers = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numUsers; i++) {
            String name = scanner.nextLine();
            userManager.addUser(name);
        }

        userManager.listUsers();

        scanner.close();
    }
}

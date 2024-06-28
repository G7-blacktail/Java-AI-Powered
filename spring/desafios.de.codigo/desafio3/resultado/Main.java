package desafio3.resultado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interface Observer
interface Observer {
    void update(String productName);
}

// Classe User que implementa Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Notificacao recebida : Novo produto adicionado - " + productName);
    }

    public String getName() {
        return name;
    }
}

// Interface Subject
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String productName);
}

// Classe ProductCatalog que implementa Subject
class ProductCatalog implements Subject {
    private List<Observer> observers;
    private List<String> products;

    public ProductCatalog() {
        observers = new ArrayList<>();
        products = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(((User) observer).getName() + " cancelou a assinatura.");
    }

    @Override
    public void notifyObservers(String productName) {
        for (Observer observer : observers) {
            observer.update(productName);
        }
    }

    public void addProduct(String productName) {
        products.add(productName);
        notifyObservers(productName);
    }
}

// Programa Principal
public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        while (true) {
            String userName = scanner.nextLine();

            User user = new User(userName);
            users.add(user);

            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("cancelar")) {
                productCatalog.removeObserver(user);
            } else {
                productCatalog.addObserver(user);
                String productName = scanner.nextLine();
                productCatalog.addProduct(productName);
            }

            String continueProgram = scanner.nextLine();

            if (continueProgram.equalsIgnoreCase("N")) {
                System.out.println("Programa Encerrado.");
                break;
            }
        }

        scanner.close();
    }
}


package desafio3;

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
    private String productType;
    private String productValue;

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
    }

    @Override
    public void notifyObservers(String productName) {
        for (Observer observer : observers) {
            observer.update(productName);
        }
    }
      public String getProductType(){
        return this.productType;
      }
      
      public void setProductType(String produtcType) {
        this.productType = produtcType;
      }
      
      public String getProductValue() {
        return this.productValue;
      }
      
      public void setProductValue(String produtcValue) {
        this.productValue = produtcValue;
      }

    public void addProduct(String productName, String produtcType, String produtcValue) {
        products.add(productName);
        products.add(productType);
        products.add(produtcValue);
        notifyObservers(productName);
    }
}

// Programa Principal
public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        String userName = scanner.nextLine();

        while (true) {

            User user = new User(userName);
            users.add(user);

            // String action = scanner.nextLine();

            // if (action.equalsIgnoreCase("cancelar")) {
            //     productCatalog.removeObserver(user);
            // } else {
                productCatalog.addObserver(user);
                String productName = scanner.nextLine();
                String produtcType = scanner.nextLine();
                String produtcValue = scanner.nextLine();
                productCatalog.addProduct(productName, produtcType, produtcValue);
            // }

            String continueProgram = scanner.nextLine();

            if (continueProgram.equalsIgnoreCase("N")) {
                System.out.println("Programa Encerrado.");
                break;
            }
        }

        scanner.close();
    }
}

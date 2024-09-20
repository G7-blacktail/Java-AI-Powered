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
        System.out.println("Notificacao recebida: Novo produto adicionado - " + productName);
    }

    public String getName() {
        return name;
    }
}

// model para produto
class Product {

    private String productName;

    private String productType;

    private String productValue;

    public Product() {
        //
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductValue() {
        return this.productValue;
    }

    public void setProductValue(String productValue){
        this.productValue = productValue;
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
    private List<Product> products;

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

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers(product.getProductName());
    }
}

// Programa Principal
public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        String userName = "Gustavo Fernandes";
        User user = new User(userName);
        users.add(user);
        productCatalog.addObserver(user);
 

        while (true) {
                product.setProductName(scanner.nextLine());
                product.setProductType(scanner.nextLine());
                product.setProductValue(scanner.nextLine());
                String continueProgram = scanner.nextLine();


                if (continueProgram.equalsIgnoreCase("N")) {
                System.out.println("Programa Encerrado.");
                break;
            } else {
                productCatalog.addProduct(product);
            }
        }
    
        scanner.close();
    }
}

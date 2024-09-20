package desafio3.model;

import java.util.ArrayList;
import java.util.List;

import desafio3.intefaces.Observer;
import desafio3.intefaces.Subject;

public class ProductCatalog implements Subject{

    private List<Observer> observers;
    private List<String> products;

    public ProductCatalog() {
        observers = new ArrayList<>();
        products = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println(((User) observer).getName() + " está assinando notificações.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(((User) observer).getName() + " cancelou a assinatura.");
    }

    @Override
    public void notifyObservers(String productName) {
        for (Observer observer : observers) {
            observer.upDate(productName);
        }
    }

    public void addProduct(String productName) {
        products.add(productName);
        System.out.println("Produto adicionado: " + productName);
        notifyObservers(productName);
    }
}

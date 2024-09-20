package desafio3.model;

import desafio3.intefaces.Observer;

public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void upDate(String productName) {
        System.out.println("Notificação recebida por " + name + ": Novo produto adicionado - " + productName);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

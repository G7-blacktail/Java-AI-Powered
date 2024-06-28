package desafio2.calculador;

import desafio2.interfaces.Operation;

public class Calculator {
    
    private  Operation operation;

    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public Double calculate(double number1, double number2) {
        return operation.execute(number1, number2);
    }
}

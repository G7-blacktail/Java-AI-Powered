package desafio2.resultado;

import java.util.Scanner;

// Interface Strategy
interface Operation {
    double execute(double num1, double num2);
}

// Classes concretas que implementam a interface Strategy
class Addition implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 * num2;
    }
}

class Division implements Operation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return num1 / num2;
    }
}

// Contexto que usa a estratégia
class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        double num1 = scanner.nextDouble();
        

        double num2 = scanner.nextDouble();
        

        char operation = scanner.next().charAt(0);
        scanner.close();

        switch (operation) {
            case '+':
                calculator.setOperation(new Addition());
                break;
            case '-':
                calculator.setOperation(new Subtraction());
                break;
            case '*':
                calculator.setOperation(new Multiplication());
                break;
            case '/':
                calculator.setOperation(new Division());
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        try {
            double result = calculator.calculate(num1, num2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    
    }
}


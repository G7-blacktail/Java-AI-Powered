package desafio2;

import java.util.Scanner;

import desafio2.calculador.Calculator;
import desafio2.operacoes.Adicao;
import desafio2.operacoes.Divisao;
import desafio2.operacoes.Multiplicacao;
import desafio2.operacoes.Subtracao;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("\nBem vindo a semi-calculadora\n");

        System.out.println("Digite o primeiro número: ");
        double number1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double number2 = entrada.nextDouble();

        System.out.println("Digite a operação que deseja realizar: ");
        char operation = entrada.next().charAt(0);

        entrada.close();

        switch (operation) {
            case '+':
            calculator.setOperation(new Adicao());
                break;
            case '-':
                calculator.setOperation(new Subtracao());
                break;
            case '*':
                calculator.setOperation(new Multiplicacao());
                break;
            case '/':
                calculator.setOperation(new Divisao());
            default:
                System.out.println("Operação inválida!");
                return;
        }

        try {
            double result = calculator.calculate(number1, number2);
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

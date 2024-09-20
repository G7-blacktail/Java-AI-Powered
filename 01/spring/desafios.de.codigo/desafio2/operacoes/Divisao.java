package desafio2.operacoes;

import desafio2.interfaces.Operation;

public class Divisao implements Operation {

    @Override
    public Double execute(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        Double resultado = number1 / number2;
        return resultado;
    }
    
}

package desafio2.operacoes;

import desafio2.interfaces.Operation;

public class Subtracao implements Operation {

    @Override
    public Double execute(double number1, double number2) {
        Double resultado = number1 - number2;
        return resultado;
    }

}

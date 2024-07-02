package src;

import src.strategy.Comportamento;
import src.strategy.ComportamentoAgressivo;
import src.strategy.ComportamentoDefensivo;
import src.strategy.ComportamentoNormal;
import src.strategy.Robo;
import src.singleton.SingletonEager;
import src.singleton.SingletonLazy;
import src.singleton.SingletonLazyHolder;

public class Teste {
    public static void main(String[] args) {
        // Testes relacionados ao design patterns Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("\n---------------------Testes -------------------------\n");
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.err.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Testes relacionados ao design patterns Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
    }
}

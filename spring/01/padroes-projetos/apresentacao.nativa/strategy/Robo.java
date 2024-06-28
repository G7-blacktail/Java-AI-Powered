package apresentacao.nativa.strategy;

public class Robo {
    
    private Comportamento comportamento; // strategy

    public Robo() {
        //
    }

    public Comportamento getComportamento() {
        return this.comportamento;
    }

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}

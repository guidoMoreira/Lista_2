package Exe3;

public class Real implements IConversorMoeda{
    private float QtdR;
    private float Variacao;
    public Real(float Qtd){
        this.QtdR = Qtd;
        this.Variacao = 0.18f;
    }
    public void Mudanca(float newVal){
        this.Variacao = newVal;
    }
    public float getConversaoDolar(){
        return (QtdR * Variacao);
    }
    public String getTipo(){
        return "real";
    }
}

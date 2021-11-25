package Exe3;

public class Bitcoin implements IConversorMoeda{
    private float QtdB;
    public Bitcoin(float TempoMineracao){
        this.QtdB = TempoMineracao * 1;
    }
    public void Minerar(float temp){
        this.QtdB += temp * 1;
    }
    public float getConversaoDolar(){
        return (QtdB * (float)59087.9);
    }
    public String getTipo(){
        return "bitcoin";
    }
}

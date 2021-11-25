package Exe3;

public class Euro implements IConversorMoeda{
    private float QtdE;
    public Euro(float Qtd){
        this.QtdE = Qtd;
    }
    public void Trabalhar(int meses){
        this.QtdE += 1000 * meses;
    }
    public float getConversaoDolar(){
        return (QtdE * (float)1.12);
    }
    public String getTipo(){
        return "euro";
    }
}

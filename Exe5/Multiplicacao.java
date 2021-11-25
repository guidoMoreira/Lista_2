package Exe5;

public class Multiplicacao implements IOperacoes{
    private float op1;
    private float op2;
    private int cont = 0;

    public Multiplicacao() {
        cont++;
    }
    public void setOperando1(float Operando1) {
        this.op1 = Operando1;
    }
    public void setOperando2(float Operando2) {
        this.op2 = Operando2;
    }
    public float getResultado() {
        return (this.op1 * this.op2);
    }
    public String getNome() {
        return "Multiplicação";
    }
    public int getQuantidade() {
        return cont;
    }
}

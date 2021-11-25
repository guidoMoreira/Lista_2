package Exe4;

public class Bonificado extends Assalariado{
    private float bonificacao;

    public Bonificado(String nom, String sob,float sb, float b,float Ss){
        this.nome = nom;
        this.sobrenome = sob;
        this.salarioBase = sb;
        this.bonificacao = b;
        this.salarioSemanal = Ss;
    }

    public void ganhos(){
        System.out.print("Ganhos: "+bonificacao);
    }
    public void Imprimir(){
        System.out.print("\n\nNome: "+this.nome+" "+this.sobrenome + "\nSalario: " +String.valueOf(this.bonificacao + this.salarioBase + this.salarioSemanal)+"\n");
    }
}

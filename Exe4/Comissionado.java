package Exe4;

public class Comissionado extends Empregado{
    private float taxaComissao;

    public Comissionado(String nom, String sob, float sb, float tC) {
        this.nome = nom;
        this.sobrenome = sob;
        this.salarioBase = sb;
        this.taxaComissao = tC;
    }
    public void ganhos() {
        System.out.print("Ganhos: "+taxaComissao);
    }
    public void Imprimir() {
        System.out.print("\n\nNome: "+this.nome+" "+this.sobrenome+"\nSalario: "+String.valueOf(this.salarioBase + this.taxaComissao)+"\n");
    }
}

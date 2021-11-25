package Exe4;

public class Horista extends Empregado{
    private int horas;

    public Horista(String nom, String sob, float sb, int h) {
        this.nome= nom;
        this.sobrenome = sob;
        this.salarioBase = sb;
        this.horas = h;
    }
    public void ganhos() {
        System.out.print("Ganhos: "+this.horas*this.salarioBase);
    }
    public void Imprimir() {
        System.out.print("\n\nNome: "+this.nome+" "+this.sobrenome+"\nSalario: "+String.valueOf(this.salarioBase * this.horas)+"\n");
    }
}

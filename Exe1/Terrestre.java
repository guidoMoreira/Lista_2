package Exe1;

public class Terrestre extends Animal{
    public String quantidadePelos = "Pouco";
    public Terrestre(String nome, String quantidadePelos){
        this.nome = nome;
        this.quantidadePelos = quantidadePelos;
    }

    public String eCobertoPor(){
        return (quantidadePelos+" pelos");
    }
    public boolean respira(){
        return true;
    }
    public boolean eMamifero(){
        return true;
    }
}

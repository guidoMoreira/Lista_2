package Exe1;

public class Anfibio extends Animal{

    public String quantidadeEscamas = "Pouco";

    public Anfibio(String nome, String quantidadeEscamas){
        this.nome = nome;
        this.quantidadeEscamas = quantidadeEscamas;
    }
    public String eCobertoPor(){
        return (quantidadeEscamas+" escamas");
    }
    public boolean respira(){
        return true;
    }
    public boolean botaOvos(){
        return true;
    }
    public boolean sabeNadar(){
        return true;
    }
}

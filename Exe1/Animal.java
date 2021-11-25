package Exe1;

public abstract class Animal {
    public String nome;

    public boolean botaOvos(){
        return false;
    }
    public boolean sabeNadar(){
        return false;
    }
    public boolean eMamifero(){
        return false;
    }
    public String getNome(){
        return nome;
    }
    public boolean respira(){
        return false;
    }
    abstract String eCobertoPor();
}

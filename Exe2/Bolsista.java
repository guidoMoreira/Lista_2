package Exe2;

public class Bolsista extends MembroUniversidade {
    public Bolsista(float pag){
        this.Pagamento = pag;
    }

    public String getTipo(){
        return "Bolsista";
    }
    public String eFuncionario(){
        return " não é ";
    }
    public String eAluno(){
        return " é ";
    }
    public String eTercerizado(){
        return " não é ";
    }
    public String RecebeSalarioMin(){
        return " não recebe salário minimo";
    }
}

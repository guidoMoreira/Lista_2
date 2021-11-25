package Exe2;

public class Administrativo extends MembroUniversidade {
    public Administrativo(float pag){
        this.Pagamento = pag;
    }

    public String getTipo(){
        return "Administrativo";
    }
    public Float getPagamento(){
        return this.Pagamento;
    }
    public String eFuncionario(){
        return " é ";
    }
    public String eAluno(){
        return " não é ";
    }
    public String eTercerizado(){
        return " não é ";
    }
    public String RecebeSalarioMin(){
        return " recebe salário minimo";
    }
}

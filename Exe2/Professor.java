package Exe2;

import Exe2.MembroUniversidade;

public class Professor extends MembroUniversidade {
    public Professor(float pag){
        this.Pagamento = pag;
    }

    public String getTipo(){
        return"Professor";
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

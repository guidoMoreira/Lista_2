package Exe2;

import Exe2.MembroUniversidade;

public class Tecnico extends MembroUniversidade {
    public Tecnico(float pag){
        this.Pagamento = pag;
    }


    public String getTipo(){
        return "Técnico";
    }
    public String eFuncionario(){
        return " é ";
    }
    public String eAluno(){
        return " não é ";
    }
    public String eTercerizado(){
        return " é ";
    }
    public String RecebeSalarioMin(){
        return " recebe salário minimo";
    }
}

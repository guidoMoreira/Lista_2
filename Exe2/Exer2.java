package Exe2;

import java.util.ArrayList;

public class Exer2 {

    public static void main(String[] args) {
        Administrativo Diretor = new Administrativo(5000);
        Professor Prof1 = new Professor(4000);

        Tecnico tecncomp = new Tecnico(3500);
        Bolsista Aluno1 = new Bolsista(400);
        ArrayList<MembroUniversidade> lista = new ArrayList<>();
        lista.add(Diretor);
        lista.add(Prof1);
        lista.add(tecncomp);
        lista.add(Aluno1);

        for (int i = 0; i < lista.size();i++){
            System.out.println("O "+lista.get(i).getTipo()+" recebe R$ "+lista.get(i).getPagamento()+" ele"+lista.get(i).eFuncionario()+"funcionario, mas"+lista.get(i).eAluno()+"Aluno, sua participação"+lista.get(i).eTercerizado()+"tercerizada e ele"+lista.get(i).RecebeSalarioMin());
        }
    }
}

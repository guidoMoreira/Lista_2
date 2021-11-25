package Exe5;

import Exe4.Empregado;

import java.util.ArrayList;
import java.util.List;

public class Exer5 {
    public static void main(String[] args) {
        ArrayList<IOperacoes> lista = new ArrayList<>();
        lista.add(new Soma());
        lista.add(new Subtracao());
        lista.add(new Divisao());
        lista.add(new Multiplicacao());
        for(IOperacoes op : lista ){
            op.setOperando1(10);
            op.setOperando2(20);
            System.out.println(op.getNome()+" dos valores "+ 10 +" e "+20+" resultou em: "+op.getResultado());
        }
    }
}

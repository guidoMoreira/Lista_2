package Exe4;

import java.util.ArrayList;

public class Exer4 {
    public static void main(String[] args) {
        Bonificado b1 = new Bonificado("Joao","Silva", 1000, 100, 20);
        Comissionado c1 = new Comissionado("Maria", "Soares", 500, 0.2f);
        Horista h1 = new Horista("Jomar", "Silva Soares", 400, 5);

        ArrayList<Empregado> lista = new ArrayList<>();
        lista.add(b1);
        lista.add(c1);
        lista.add(h1);

        for ( Empregado pessoa : lista ){
            pessoa.Imprimir();
            pessoa.ganhos();
        }
    }
}

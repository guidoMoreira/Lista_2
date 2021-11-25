package Exe1;

import java.util.ArrayList;

public class Exer1 {

    public Exer1(){

    }
    public static void main(String[] args) {
        Anfibio sapo = new Anfibio("Sapo","pouco");
        Anfibio ra = new Anfibio("rã","pouco");

        Terrestre leao = new Terrestre("Leão","muito");
        Terrestre macaco = new Terrestre("Macaco","pouco");
        ArrayList<Animal> lista = new ArrayList<>();
        lista.add(sapo);
        lista.add(ra);
        lista.add(leao);
        lista.add(macaco);

        for (int i = 0; i < lista.size();i++){
            System.out.println("--O animal "+lista.get(i).nome+"--\nÉ mamifero: "+lista.get(i).eMamifero()+"\nBota ovos: "+lista.get(i).botaOvos()+"\nRespira: "+lista.get(i).respira()+"\nÉ coberto por: "+lista.get(i).eCobertoPor()+"\nSabe nadar: "+lista.get(i).sabeNadar());
        }
    }

}

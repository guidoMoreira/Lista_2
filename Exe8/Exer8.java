package Exe8;
import javax.swing.JOptionPane;

public class Exer8 {
    public static void main(String[] args) {
        MenuIter[] lista = new MenuIter[4];
        MenuIter prim = new MenuIter("Primeiro");
        MenuIter seg = new MenuIter("Segundo");
        MenuIter terc = new MenuIter("Terceiro");
        MenuIter quart = new MenuIter("Quarto");
        lista[0] = prim;
        lista[1] = seg;
        lista[2] = terc;
        lista[3] = quart;
        MenuIter Menu = new MenuIter(lista);
        if(!Menu.hasNext()){
            JOptionPane.showMessageDialog(null, Menu.itens[Menu.posicao].nome);
            JOptionPane.showMessageDialog(null, "Has next: true");
        }
        JOptionPane.showMessageDialog(null, Menu.next().nome);
        while(Menu.hasNext()){
            JOptionPane.showMessageDialog(null, "Has next: true");
            JOptionPane.showMessageDialog(null, Menu.next().nome);
        }
        JOptionPane.showMessageDialog(null, "Has next: false");

    }
}

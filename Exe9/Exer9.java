package Exe9;
//import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Exer9 {
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

        //Interface
        RadioButton radioButtonFrame = new RadioButton(Menu);
        radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        radioButtonFrame.setSize( 350, 100 );
        radioButtonFrame.setVisible( true );
        //JOptionPane.showMessageDialog(null, Menu.next().nome);
            //Print has next true

            //Print valor do proximo

            //JOptionPane.showMessageDialog(null, "Has next: true");
            //JOptionPane.showMessageDialog(null, Menu.next().nome);

        //JOptionPane.showMessageDialog(null, "Has next: false");

    }
}

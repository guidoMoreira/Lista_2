package Exe9;

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


    }
}

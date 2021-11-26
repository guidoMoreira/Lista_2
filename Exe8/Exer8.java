package Exe8;

import javax.swing.*;

public class Exer8 {
    public static void main(String[] args) {
        CarroAutomaticoFacade carro1 = new CarroAutomaticoFacade();
        JOptionPane.showMessageDialog(null,"Ligar Carro");
        carro1.LigarCarro();
        JOptionPane.showMessageDialog(null,"Carro ligado com sucesso");
    }
}

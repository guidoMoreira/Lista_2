package Exe9;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RadioButton extends JFrame {
    public MenuIter menu;
    private JRadioButton prox;
    private JLabel myLabel;
    private RadioButtonHandler handler;

    public RadioButton(MenuIter Menu){
        super("Radio Buttons");
        menu = Menu;
        setLayout( new FlowLayout() );
        handler = new RadioButtonHandler();

        myLabel = new JLabel(menu.next().nome+ "Has next: "+menu.hasNext());

        prox = new JRadioButton("Next", false);

        add(myLabel);
        add(prox);


        prox.addItemListener(handler);
    }

    private class RadioButtonHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent event) {
            if(prox.isSelected() && menu.hasNext()) {
                myLabel.setText(menu.next().nome + "Has next: " + menu.hasNext());
            }
        }

    }

}
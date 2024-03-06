package GUIs;

import javax.swing.*;
import java.awt.*;

class CreateGUI extends Frame {
    CreateGUI(){
        JButton btn1 = new JButton("Click Here!!");
        JButton btn2 = new JButton("Click Here!!");

        add(btn1);
        add(btn2);


        setLayout(new GridBagLayout());
        setVisible(true);
        setSize(300,400);

    }
    public static void main (String[] args){
        new CreateGUI();

    }
}
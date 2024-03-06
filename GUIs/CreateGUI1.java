package GUIs;

import javax.swing.*;
import java.awt.*;

public class CreateGUI1 {
    CreateGUI1(){
        JFrame frame = new JFrame();
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");

        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);

        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.MAGENTA);
        panel.setAutoscrolls(true);
        frame.getContentPane().add(panel);

        frame.setTitle("Hello Jey, Congrats");
        frame.setState(200);
        frame.setSize(500,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[] args) {
        new CreateGUI1();
    }
}

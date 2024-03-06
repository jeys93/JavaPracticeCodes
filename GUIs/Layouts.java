package GUIs;

import javax.swing.*;
import java.awt.*;

public class Layouts {
    Layouts(){
        JFrame frame = new JFrame("Hello Jeyaganesh, Welcome...!!!");

        JButton btn1 = new JButton("Click Here");
        JButton btn2 = new JButton("Click Me");
        btn1.setBounds(200,100,150,60);
        btn2.setBounds(300,100,150,60);

        Label label = new Label("Stock Details");
        label.setBounds(120,130,135,160);

        TextField textField = new TextField("Enter the input");
        TextArea textArea = new TextArea("Enter the details");

        Checkbox checkbox = new Checkbox("Tick here");
        checkbox.setBounds(400,500,500,200);

        Choice choice = new Choice();
        choice.add("Buy ");
        choice.add("Sell ");

//adding the items into the frame
        frame.add(btn1);
        frame.add(btn2);
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        frame.add(checkbox);
        frame.add(choice);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Layouts();
    }
}

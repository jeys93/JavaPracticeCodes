package GUIs;

import javax.swing.*;
import java.awt.*;

public class GUIBackGround {
    GUIBackGround(){
        JFrame frame = new JFrame("Hello Jeyaganesh, Welcome...!!!");
        JButton btn1 = new JButton("Click Here");
        JButton btn2 = new JButton("Click Me");
        Label label = new Label("This is a label");
        TextField textField = new TextField("Enter the input");
        TextArea textArea = new TextArea("Enter the details");
        //TextEvent textEvent = new TextEvent();
        Checkbox checkbox = new Checkbox("Tick here");
        Choice choice = new Choice();
        choice.add("Buy ");
        choice.add("Sell ");

//adding the items into the frame
        frame.add(btn1);
        frame.add(btn2);
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        //frame.add(textEvent);
        frame.add(checkbox);
        frame.add(choice);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new GUIBackGround();

    }
}

package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabColCreation {
    JTextArea outputTextArea;
    TabColCreation(){
        JFrame frame = new JFrame("Stock Accumulation Details");

        Label stockDetails = new Label("Stock Details");
        stockDetails.setBounds(1000,30,100,50);


        Label buydate = new Label("Buy Date");
        buydate.setBounds(50,130,100,30);
        TextField dateip = new TextField();
        dateip.setBounds(170,130,100,30);

        Label stockname = new Label("Stock Name");
        stockname.setBounds(50,170,100,30);
        TextField stockip = new TextField();
        stockip.setBounds(170,170,100,30);

        Label Price = new Label("Price");
        Price.setBounds(50,210,100,30);
        TextField priceip = new TextField();
        priceip.setBounds(170,210,100,30);

        Label Action = new Label("Action");
        Action.setBounds(50,250,100,30);
        Choice actionip = new Choice();
        actionip.add("Buy");
        actionip.add("Sell");
        actionip.setBounds(170,250,100,30);

        JButton btn = new JButton("Submit");
        btn.setBounds(170,290,100,30);

        ActionListener submitbtn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String output = dateip.getText() + '\t'
                        + stockip.getText() + '\t'
                        + priceip.getText() + '\t'
                        + actionip.getSelectedItem()+ '\n';
                /* System.out.println(dateip.getText());
                System.out.println(stockip.getText());
                System.out.println(priceip.getText()); */
                outputTextArea.append(output);
            }
        };

        btn.addActionListener(submitbtn);

        outputTextArea = new JTextArea();
        outputTextArea.setBounds(50, 330, 800, 1000);
        outputTextArea.setEditable(true);

        frame.setLayout(null);
        frame.add(outputTextArea);
        frame.add(stockip);
        frame.add(dateip);
        frame.add(priceip);
        frame.add(priceip);
        frame.add(stockname);
        frame.add(Price);
        frame.add(buydate);
        frame.add(stockDetails);
        frame.add(btn);
        frame.add(stockname);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(900,800);
        frame.add(actionip);

    }
    public static void main(String[] args) {
        new TabColCreation();
    }
}

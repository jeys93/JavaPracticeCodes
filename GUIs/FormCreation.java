package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCreation {

    FormCreation(){
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

        JButton btn = new JButton("Submit");
        btn.setBounds(170,250,100,30);

        ActionListener submitbtn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(dateip.getText());
                System.out.println(stockip.getText());
                System.out.println(priceip.getText());
            }
        };

        btn.addActionListener(submitbtn);

        frame.setLayout(null);
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

    }
    public static void main(String[] args) {
        new FormCreation();

    }
}

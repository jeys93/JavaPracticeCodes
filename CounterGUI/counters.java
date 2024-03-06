package CounterGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class counters extends Frame{
    TextField display;
    Button incbtn,rstbtn,decbtn;
    counters(){
        display = new TextField("0");
        display.setBounds(700,550,500,300);
        display.setBackground(Color.CYAN);

        Font font = new Font("Arial", Font.BOLD,38);
        display.setFont(font);

        incbtn = new Button("INCREMENT");
        incbtn.setBounds(700, 100, 500,100);
        incbtn.setBackground(Color.GREEN);
        incbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double num = Double.parseDouble(display.getText());
                display.setText(String.valueOf(++num));
            }
        });

        decbtn = new Button("DECREMENT");
        decbtn.setBounds(700, 250, 500,100);
        decbtn.setBackground(Color.YELLOW);
        decbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double num = Double.parseDouble(display.getText());
                display.setText(String.valueOf(--num));
            }
        });

        rstbtn = new Button("RESET");
        rstbtn.setBounds(700, 400, 500,100);
        rstbtn.setBackground(Color.RED);
        rstbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText("0");
            }
        });

        setTitle("Counters");
        add(rstbtn);
        add(decbtn);
        add(display);
        add(incbtn);
        setLayout(null);
        setSize(2048,1048);
        setVisible(true);

    }
    public static void main(String[] args){
    new counters();
    }
}

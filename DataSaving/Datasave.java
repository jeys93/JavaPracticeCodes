package DataSaving;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Datasave {
    JTextArea outputTextArea;
    private DefaultTableModel tableModel;
    private void saveToExcel() throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("StockData");

            Row headerrow = sheet.createRow(0);
            for (int col = 0; col< tableModel.getColumnCount(); col++){
                Cell cell = headerrow.createCell(col);
                cell.setCellValue(tableModel.getColumnName(col));
            }
            for(int row=0; row<tableModel.getRowCount();row++){
                Row dataRow = sheet.createRow(row+1);
                for (int col = 0; col < tableModel.getColumnCount(); col++) {
                    Cell cell = dataRow.createCell(col);
                    cell.setCellValue(String.valueOf(tableModel.getValueAt(row, col)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving");
        } /** catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An Unexpected Error"); **/
        }
    }
    private JTable dataTable;
        Datasave() {
            //Frame creation
            JFrame frame = new JFrame("Stock Accumulation Details");

            //Heading of the GUI
            Label stockDetails = new Label("Stock Details");
            stockDetails.setBounds(1000, 30, 100, 50);

            //First field
            Label buydate = new Label("Buy Date");
            buydate.setBounds(50, 130, 100, 30);
            TextField dateip = new TextField();
            dateip.setBounds(170, 130, 100, 30);

            //Second Field
            Label stockname = new Label("Stock Name");
            stockname.setBounds(50, 170, 100, 30);
            TextField stockip = new TextField();
            stockip.setBounds(170, 170, 100, 30);

            //Third Field
            Label Price = new Label("Price");
            Price.setBounds(50, 210, 100, 30);
            TextField priceip = new TextField();
            priceip.setBounds(170, 210, 100, 30);

            //Fourth Field
            Label Action = new Label("Action");
            Action.setBounds(50, 250, 100, 30);
            Choice actionip = new Choice();
            actionip.add("Buy");
            actionip.add("Sell");
            actionip.setBounds(170, 250, 100, 30);

            //Button Field
            JButton btn = new JButton("Submit");
            btn.setBounds(170, 290, 100, 30);

            //Table details
            tableModel = new DefaultTableModel();
            tableModel.addColumn("Buy Date");
            tableModel.addColumn("Stock Name");
            tableModel.addColumn("Price");
            tableModel.addColumn("Action");

            dataTable = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(dataTable);
            scrollPane.setBounds(50, 330, 500, 200);

            ActionListener submitbtn = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String buyDate = dateip.getText();
                    String stockName = stockip.getText();
                    String price = priceip.getText();
                    String Action = actionip.getName();

                    tableModel.addRow(new Object[]{buyDate, stockName, price, Action});

                    dateip.setText("");
                    stockip.setText("");
                    priceip.setText("");
                    actionip.setName("");
                }
            };

            btn.addActionListener(submitbtn);
            outputTextArea = new JTextArea();
            outputTextArea.setBounds(50, 330, 800, 1000);
            outputTextArea.setEditable(false);

            //adding items into the frame
            frame.setLayout(null);
            frame.add(outputTextArea);
            frame.add(stockip);
            frame.add(dateip);
            frame.add(priceip);
            frame.add(actionip);
            frame.add(stockname);
            frame.add(Price);
            frame.add(buydate);
            frame.add(stockDetails);
            frame.add(Action);
            frame.add(btn);
            frame.add(stockname);
            frame.add(scrollPane);
            frame.add(actionip);
            frame.setVisible(true);
            //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(1080, 1024);
        }
        public static void main (String[] args) {
            new Datasave();


        }
    }


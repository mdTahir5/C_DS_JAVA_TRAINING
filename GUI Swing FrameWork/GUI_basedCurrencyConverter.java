package GUI_SwingFramework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_basedCurrencyConverter {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Currency Converter");
        JLabel rupeesLabel = new JLabel("Enter The Amount In Rs. : ");
        JLabel dollarLabel = new JLabel("Enter The Amount In Usd : ");
        JTextField rupeesField = new JTextField();
        JTextField dollarField = new JTextField();
        JButton convert = new JButton("CONVERT");
        JLabel resultLabel = new JLabel();
        rupeesLabel.setBounds(30,30,150,40);
        rupeesField.setBounds(180,30,150,40);
        dollarLabel.setBounds(30,80,150,40);
        dollarField.setBounds(180,80,150,40);
        convert.setBounds(190,150,120,40);
        resultLabel.setBounds(100, 200, 400, 40);
        fr.add(rupeesLabel);
        fr.add(rupeesField);
        fr.add(dollarLabel);
        fr.add(dollarField);
        fr.add(convert);
        fr.add(resultLabel);
        fr.setLayout(null);
        fr.setSize(500, 450);
        fr.setVisible(true);
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rupeesField.getText().isEmpty() && dollarField.getText().isEmpty()){
                    resultLabel.setText("Please Enter the Amount atleast in One");
                    resultLabel.setBackground(Color.RED);
                    resultLabel.setForeground(Color.RED);
                }else if(!rupeesField.getText().isEmpty() && dollarField.getText().isEmpty()){
                    float rs = Float.parseFloat(rupeesField.getText());
                    float usd = (float) (rs / 83.76);
                    resultLabel.setText("Amount In usd : " + usd);
                    resultLabel.setBackground(Color.BLACK);
                    resultLabel.setForeground(Color.BLACK);
                } else if(!dollarField.getText().isEmpty() && rupeesField.getText().isEmpty()) {
                    float usd = Float.parseFloat(dollarField.getText());
                    float rs = (float) (usd * 83.76);
                    resultLabel.setText("Amount In Rs : " + rs);
                    resultLabel.setBackground(Color.BLACK);
                    resultLabel.setForeground(Color.BLACK);
                } else {
                    float rs = Float.parseFloat(rupeesField.getText());
                    float usd1 = (float) (rs / 83.76);
                    float usd = Float.parseFloat(dollarField.getText());
                    float rs1 = (float) (usd * 83.76);
                    resultLabel.setText("Amount in Rs : " + rs1 + " and the Amount in usd : " + usd1);
                    resultLabel.setBackground(Color.BLACK);
                    resultLabel.setForeground(Color.BLACK);
                }
            }
        });
    }
}

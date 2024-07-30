package GUI_SwingFramework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_basedBMI_calculator {
    public static void main(String[] args) {
        // Calculate User BMI
        JFrame frame = new JFrame("BMI Calculator");
        // label to display text msg to user
        JLabel heightLabel = new JLabel("Enter your height (m) : ");
        JLabel weightLabel = new JLabel("Enter your weight (kg) : ");
        JTextField heightField = new JTextField();
        JTextField weightField = new JTextField();
        JButton bmiButton = new JButton("Calculate BMI");
        JLabel resultLabel = new JLabel();
        // to set the size and position of UI components in frame
        heightLabel.setBounds(30, 30, 150, 40);
        heightField.setBounds(180, 30, 50, 40);
        weightLabel.setBounds(30, 70, 150, 40);
        weightField.setBounds(180, 70, 50, 40);
        bmiButton.setBounds(140, 120, 120, 40);
        resultLabel.setBounds(150, 180, 200, 40);
        frame.add(resultLabel);
        frame.add(bmiButton);
        frame.add(weightField);
        frame.add(heightLabel);
        frame.add(weightLabel);
        frame.add(heightField);
        // to set layout null
        frame.setLayout(null);
        // to add the size in frame
        frame.setSize(400, 300);
        frame.setVisible(true);
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // add validation in height and weight values can't be empty
                if (heightField.getText().isEmpty() || weightField.getText().isEmpty()) {
                    resultLabel.setText("Please Enter Height and Weight");
                } else {
                    float height = Float.parseFloat(heightField.getText());
                    float weight = Float.parseFloat(weightField.getText());
                    float result = weight / (height * height);
                    if (result < 18.5) {
                        resultLabel.setText("Under Weight");
                        resultLabel.setBackground(Color.YELLOW);
                        resultLabel.setForeground(Color.YELLOW);
                    } else if (result > 18.5 && result < 24.9) {
                        resultLabel.setText("Its Normal");
                        resultLabel.setBackground(Color.GREEN);
                        resultLabel.setForeground(Color.GREEN);
                    } else if (result > 24.9 && result < 29.9) {
                        resultLabel.setText("Over Weight");
                        resultLabel.setBackground(Color.ORANGE);
                        resultLabel.setForeground(Color.ORANGE);
                    } else {
                        resultLabel.setText("Its Obese");
                        resultLabel.setBackground(Color.RED);
                        resultLabel.setForeground(Color.RED);
                    }
                }
            }
        });
        {
        }
    }
}
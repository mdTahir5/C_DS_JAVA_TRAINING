import com.mongodb.client.MongoClients;
import org.bson.Document;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RestaurantBilling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Restaurant Bill");
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel itemLabel = new JLabel("Items  :");
        itemLabel.setBounds(60,30,100,30);
        frame.add(itemLabel);
        JTextField itemFields = new JTextField();
        itemFields.setBounds(160,30,150,30);
        frame.add(itemFields);
        JLabel qtyLabel = new JLabel("Quantity  :");
        qtyLabel.setBounds(60,80,100,30);
        frame.add(qtyLabel);
        JTextField qtyFields = new JTextField();
        qtyFields.setBounds(160,80,150,30);
        frame.add(qtyFields);
        JLabel priceLabel = new JLabel("Price  :");
        priceLabel.setBounds(60,130,100,30);
        frame.add(priceLabel);
        JTextField priceFields = new JTextField();
        priceFields.setBounds(160,130,150,30);
        frame.add(priceFields);
        JLabel totalLabel = new JLabel("Total Amount (Rs.)  :");
        totalLabel.setBounds(60,180,150,30);
        frame.add(totalLabel);
        JLabel amountLabel = new JLabel();
        amountLabel.setBounds(210,180,80,30);
        frame.add(amountLabel);
        JButton select = new JButton("Select");
        select.setBounds(60,230,100,30);
        frame.add(select);
        JButton order = new JButton("Order & Pay");
        order.setBounds(200,230,110,30);
        frame.add(order);

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int qty = Integer.parseInt(qtyFields.getText());
                int price = Integer.parseInt(priceFields.getText());
                int amount = (qty * price);
                String totalAmount = String.valueOf(amount);
                amountLabel.setText(totalAmount + " /-");
            }
        });
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var client = MongoClients.create("mongodb://localhost:27017/");
                var database = client.getDatabase("RestaurantBills");
                System.out.println("Database is created" + database.getName());
                database.createCollection("Orders");
                var insertOrder = database.getCollection("Orders");
                var orderdocument = new Document();
                Random random = new Random();
                int randonNum = random.nextInt(999);
                orderdocument.append("Order Id",String.valueOf(randonNum));
                orderdocument.append("Items",itemFields.getText());
                orderdocument.append("Quantity",qtyFields.getText());
                orderdocument.append("Price",priceFields.getText());
                orderdocument.append("Total Amount", amountLabel.getText());
                insertOrder.insertOne(orderdocument);
                JOptionPane.showMessageDialog(null,"Congratulations, Your Order TakePlace");
                itemFields.setText(""); qtyFields.setText(""); priceFields.setText("");
                amountLabel.setText("");
            }
        });

    }
}
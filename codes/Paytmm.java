
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URI;

public class Paytmm extends JFrame {
    public Paytmm() {
        setTitle("Pay Rent");
        setLayout(null);
        setSize(400, 200);
        setLocation(600, 300);
        getContentPane().setBackground(Color.decode("#f2f7eb"));

        JLabel label = new JLabel("Click below to proceed to payment:");
        label.setBounds(50, 30, 300, 30);
        add(label);

        JButton payButton = new JButton("Pay via PayPal");
        payButton.setBounds(120, 80, 150, 40);
        payButton.setBackground(new Color(0, 120, 215));
        payButton.setForeground(Color.WHITE);
        add(payButton);

        payButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.paypal.com/myaccount/transfer/homepage"));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Could not open payment page.");
                ex.printStackTrace();
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Paytmm();
    }
}
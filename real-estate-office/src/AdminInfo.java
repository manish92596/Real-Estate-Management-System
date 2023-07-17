import javax.swing.*;
import java.awt.*;

public class AdminInfo extends JFrame {

    public AdminInfo() {
        // Set the title of the JFrame
        setTitle("Company Details");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Set the layout manager to null for absolute positioning
        setLayout(null);

        // Set the background image of the JFrame
        ImageIcon imageIcon = new ImageIcon("D:\\all\\d\\src\\image.png");
        JLabel background = new JLabel(imageIcon);
        background.setBounds(0, 0, screenSize.width, screenSize.height);
        add(background);

        // Add four buttons to the JFrame
        // JButton agentBtn = new JButton("Agent Details");
        // agentBtn.setBounds(100, 100, 150, 50);
        // add(agentBtn);

        // JButton propertyBtn = new JButton("Property Details");
        // propertyBtn.setBounds(300, 100, 150, 50);
        // add(propertyBtn);

        // JButton buyerBtn = new JButton("Buyer Details");
        // buyerBtn.setBounds(500, 100, 150, 50);
        // add(buyerBtn);

        // JButton transactionBtn = new JButton("Transaction");
        // transactionBtn.setBounds(700, 100, 150, 50);
        // add(transactionBtn);

        // Add four buttons to the JFrame
        JButton agentBtn = new JButton("Agent Details");
        agentBtn.setBounds(100, 100, 150, 50);
        add(agentBtn);

        JButton propertyBtn = new JButton("Property Details");
        propertyBtn.setBounds(300, 100, 150, 50);
        add(propertyBtn);

        JButton buyerBtn = new JButton("Buyer Details");
        buyerBtn.setBounds(500, 100, 150, 50);
        add(buyerBtn);

        JButton transactionBtn = new JButton("Transaction");
        transactionBtn.setBounds(700, 100, 150, 50);
        add(transactionBtn);

        // Set the visibility of the buttons
        agentBtn.setVisible(true);
        propertyBtn.setVisible(true);
        buyerBtn.setVisible(true);
        transactionBtn.setVisible(true);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdminInfo();
    }
}

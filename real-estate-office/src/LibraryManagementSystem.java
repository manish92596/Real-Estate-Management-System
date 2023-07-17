import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LibraryManagementSystem extends JFrame implements ActionListener {

    // Declare GUI components
    JLabel label1, label2, label3, label4, label5;
    JTextField textField1, textField2, textField3, textField4;
    JButton button1, button2, button3, button4;
    JTextArea textArea;

    // Constructor
    public LibraryManagementSystem() {
        setTitle("Book Library Management System");
        setBounds(100, 100, 700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Initialize GUI components
        label1 = new JLabel("Book Title:");
        label1.setBounds(50, 50, 100, 30);
        getContentPane().add(label1);

        textField1 = new JTextField();
        textField1.setBounds(150, 50, 200, 30);
        getContentPane().add(textField1);

        label2 = new JLabel("Author Name:");
        label2.setBounds(50, 100, 100, 30);
        getContentPane().add(label2);

        textField2 = new JTextField();
        textField2.setBounds(150, 100, 200, 30);
        getContentPane().add(textField2);

        label3 = new JLabel("ISBN:");
        label3.setBounds(50, 150, 100, 30);
        getContentPane().add(label3);

        textField3 = new JTextField();
        textField3.setBounds(150, 150, 200, 30);
        getContentPane().add(textField3);

        label4 = new JLabel("Category:");
        label4.setBounds(50, 200, 100, 30);
        getContentPane().add(label4);

        textField4 = new JTextField();
        textField4.setBounds(150, 200, 200, 30);
        getContentPane().add(textField4);

        button1 = new JButton("Add Book");
        button1.setBounds(50, 250, 100, 30);
        button1.addActionListener(this);
        getContentPane().add(button1);

        button2 = new JButton("Remove Book");
        button2.setBounds(170, 250, 120, 30);
        button2.addActionListener(this);
        getContentPane().add(button2);

        button3 = new JButton("Search Book");
        button3.setBounds(310, 250, 120, 30);
        button3.addActionListener(this);
        getContentPane().add(button3);

        button4 = new JButton("View Books");
        button4.setBounds(450, 250, 100, 30);
        button4.addActionListener(this);
        getContentPane().add(button4);

        textArea = new JTextArea();
        textArea.setBounds(50, 300, 600, 250);
        getContentPane().add(textArea);

        setVisible(true);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            // Add book functionality
        } else if (e.getSource() == button2) {
            // Remove book functionality
        } else if (e.getSource() == button3) {
            // Search book functionality
        } else if (e.getSource() == button4) {
            // View books functionality
        }
    }

    // Main method
    public static void main(String[] args) {
        new LibraryManagementSystem();
    }
}

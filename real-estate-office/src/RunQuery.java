import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RunQuery extends JFrame {
   private JTextField textField;
   private JButton button;
   private String inputText;
   private JLabel label;
   static RunQuery frame;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               frame = new RunQuery();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public RunQuery() {
      // Set up the JFrame
      setTitle("Text Field Example");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(600, 370);
      setLayout(null);

      // Create the text field and button
      textField = new JTextField(40);
      textField.setBounds(55, 110, 485, 60);
      button = new JButton("Submit");
      button.setBounds(250, 211, 100, 30);

      JButton btnBack = new JButton("Back");
      btnBack.setBounds(450, 270, 100, 30);
      btnBack.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.dispose();
         }
      });

      // Add an action listener to the button
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Get the text from the text field and store it in the inputText variable
            inputText = textField.getText();
            ExecuteQuery.main(new String[] { inputText });
            frame.dispose();

         }
      });

      // Create the label with a heading
      label = new JLabel("Enter your Query");
      label.setBounds(180, 40, 400, 30);
      label.setFont(new Font("Arial", Font.BOLD, 30));
      // Set the font for the text field
      textField.setFont(new Font("Arial", Font.BOLD, 20));

      // Add the text field, button, and label to the JFrame
      add(label);
      add(textField);
      add(button);
      add(btnBack);

      // Display the JFrame
      setVisible(true);
      // Display the JFrame in the center of the screen
      setLocationRelativeTo(null);

   }
}

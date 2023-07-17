// import javax.swing.*;
// import java.awt.*;

// public class Searchproperty extends JFrame {

//     // Declare the text fields, label, combo boxes, and button
//     private JTextField textField1;
    
//     private JLabel label1;
//     private JComboBox comboBox1;
//     private JComboBox comboBox2;
//     private JButton searchButton;

//     public Searchproperty() {
//         // Set the layout for the GUI
//         setLayout(new GridLayout(5, 2));

//         // Initialize the text fields
//         textField1 = new JTextField();
    
//         // Initialize the label
//         label1 = new JLabel("Area");

//         // Initialize the combo boxes
//         comboBox1 = new JComboBox();
//         comboBox1.addItem("1 BHK");
//         comboBox1.addItem("2 BHK");
//         comboBox1.addItem("3 BHK");
//         comboBox1.addItem("4 BHK");
//         comboBox2 = new JComboBox();
//         comboBox2.addItem("10,000-20,000");
//         comboBox2.addItem("21,000-40,000");
//         comboBox2.addItem("41,000-60,000");
//         comboBox2.addItem("61,000-80,000");
//         comboBox2.addItem("81,000-90,000");
//         comboBox2.addItem("91,000-1,00,000");

//         // Initialize the button
//         searchButton = new JButton("Search");

//         // Add the components to the GUI
//         add(label1);
//         add(textField1);
//         add(new JLabel("BHK"));
//         add(comboBox1);
//         add(new JLabel("Price (Rs)"));
//         add(comboBox2);
      
//         add(searchButton);

//         // Set the title, size, and visibility of the GUI
//         setTitle("Search Property");
//         setBounds(600, 200, 500, 400);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         // Create a new instance of the SearchGUI class
//         new Searchproperty();
//     }
// }


















// import javax.swing.*;
// import java.awt.*;

// public class Searchproperty extends JFrame {

//     // Declare the text fields, label, combo boxes, and button
//     private JTextField textField1;
    
//     private JLabel label1;
//     private JComboBox comboBox1;
//     private JComboBox comboBox2;
//     private JButton searchButton;

//     public Searchproperty() {
//         // Set the layout for the GUI
//         setLayout(new GridLayout(5, 2));

//         // Initialize the text fields
//         textField1 = new JTextField();
    
//         // Initialize the label
//         label1 = new JLabel("Area");
//         label1.setPreferredSize(new Dimension(100, 30)); // Change the size of label1

//         // Initialize the combo boxes
//         comboBox1 = new JComboBox();
//         comboBox1.addItem("1 BHK");
//         comboBox1.addItem("2 BHK");
//         comboBox1.addItem("3 BHK");
//         comboBox1.addItem("4 BHK");
//         comboBox2 = new JComboBox();
//         comboBox2.addItem("10,000-20,000");
//         comboBox2.addItem("21,000-40,000");
//         comboBox2.addItem("41,000-60,000");
//         comboBox2.addItem("61,000-80,000");
//         comboBox2.addItem("81,000-90,000");
//         comboBox2.addItem("91,000-1,00,000");

//         // Initialize the button
//         searchButton = new JButton("Search");

//         // Add the components to the GUI
//         add(label1);
//         add(textField1);
//         add(new JLabel("BHK"));
//         add(comboBox1);
//         add(new JLabel("Price (Rs)"));
//         add(comboBox2);
      
//         add(searchButton);

//         // Set the title, size, and visibility of the GUI
//         setTitle("Search Property");
//         setBounds(600, 200, 500, 400);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         // Create a new instance of the SearchGUI class
//         new Searchproperty();
//     }
// }

















// import javax.swing.*;
// import java.awt.*;

// public class Searchproperty extends JFrame {

//     // Declare the text fields, label, combo boxes, and button
//     private JTextField textField1;
//     private JLabel label1,label2,label3;
//     private JComboBox<String> comboBox1;
//     private JComboBox<String> comboBox2;
//     private JButton searchButton;

//     public Searchproperty() {
//         // Set the layout for the GUI
//         setLayout(null);

//         // Initialize the text fields
//         textField1 = new JTextField();

//         // Initialize the label
//         label1 = new JLabel("Area");
//         label1.setFont(new Font("Abril Fatface", Font.BOLD, 45));
//         label1.setBounds(5,20, 400, 400);

//         label2 = new JLabel("BHK");
//         label2.setFont(new Font("Abril Fatface", Font.BOLD, 45));
//         label2.setBounds(20, 200, 100, 25);

//         label3 = new JLabel("Price (Rs.)");
//         label3.setFont(new Font("Abril Fatface", Font.BOLD, 45));
//         label3.setBounds(20, 200, 100, 25);

//         // Initialize the combo boxes
//         comboBox1 = new JComboBox<String>();
//         comboBox1.addItem("1 BHK");
//         comboBox1.addItem("2 BHK");
//         comboBox1.addItem("3 BHK");
//         comboBox1.addItem("4 BHK");
//         comboBox1.setBounds(130, 60, 100, 100);
//         comboBox2 = new JComboBox<String>();
//         comboBox2.addItem("10,000-20,000");
//         comboBox2.addItem("21,000-40,000");
//         comboBox2.addItem("41,000-60,000");
//         comboBox2.addItem("61,000-80,000");
//         comboBox2.addItem("81,000-90,000");
//         comboBox2.addItem("91,000-1,00,000");
//         comboBox2.setBounds(130, 100, 100, 25);

//         // Initialize the button
//         searchButton = new JButton("Search");
//         searchButton.setBounds(100, 150, 100, 25);

//         // Add the components to the GUI
//         add(label1);
//         add(label2);
//         add(label3);
//         add(textField1);
//        // add(new JLabel("BHK"));
//         add(comboBox1);
//        // add(new JLabel("Price (Rs)"));
//         add(comboBox2);
//         add(searchButton);

//         // Set the bounds of the text fields
//         textField1.setBounds(130, 20, 100, 25);

//         // Set the title, size, and visibility of the GUI
//         setTitle("Search Property");
//         setBounds(750, 200,400,430);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         //setLocationRelativeTo(null);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         // Create a new instance of the Searchproperty class
//         new Searchproperty();
//     }
// }







public class Searchproperty extends javax.swing.JFrame  {

    /**
     * Creates new form NewJFrame
     */
    // public  Searchproperty() {
    //     initComponents();
    // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  //  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    //public void initComponents() {
        Searchproperty(){


        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Search Property");
        this.setBackground(new java.awt.Color(102, 255, 255));
        this.setBounds(750, 200, 377, 319);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Area");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("BHK");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Price (Rs.)");

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 BHK", "2 BHK", "3 BHK", "4 BHK" }));

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10,00-20,000", "21,000-40,000", "41,000-60,000", "61,000-80,000" ,"81,000-1,00,000"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton22.setText("Back");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, 0, 175, Short.MAX_VALUE)
                        .addComponent(jTextField1))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))

                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE)
                
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );



        this.pack();
        this.setVisible(true);
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(evt.getSource() == jButton1 )
        {
            new Searchpropertytable();
        }
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Searchproperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searchproperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searchproperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searchproperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searchproperty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton22;
    private javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}











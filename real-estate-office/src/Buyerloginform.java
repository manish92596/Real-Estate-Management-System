// import javax.swing.JOptionPane;

// public class Buyerloginform extends javax.swing.JFrame {
//         static Buyerloginform frame;

//         Buyerloginform() {
//                 jLabel1 = new javax.swing.JLabel();
//                 jPasswordField1 = new javax.swing.JPasswordField();
//                 jLabel2 = new javax.swing.JLabel();
//                 jLabel3 = new javax.swing.JLabel();
//                 jButton1 = new javax.swing.JButton();
//                 jButton2 = new javax.swing.JButton();
//                 jTextField1 = new javax.swing.JTextField();

//                 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//                 setTitle("Buyer Login Form");
//                 this.setBackground(new java.awt.Color(102, 255, 255));
//                 this.setBounds(750, 200, 377, 319);

//                 jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
//                 jLabel1.setText("Buyer Login Form");

//                 jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

//                 jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
//                 jLabel2.setText("Enter Username :");

//                 jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
//                 jLabel3.setText("Enter Password : ");

//                 jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
//                 jButton1.setText("Login");

//                 jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
//                 jButton2.setText("Back");

//                 jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

//                 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//                 getContentPane().setLayout(layout);
//                 layout.setHorizontalGroup(
//                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                 .addGroup(layout.createSequentialGroup()
//                                                                 .addGroup(layout.createParallelGroup(
//                                                                                 javax.swing.GroupLayout.Alignment.LEADING)
//                                                                                 .addGroup(layout.createSequentialGroup()
//                                                                                                 .addGap(39, 39, 39)
//                                                                                                 .addGroup(layout
//                                                                                                                 .createParallelGroup(
//                                                                                                                                 javax.swing.GroupLayout.Alignment.LEADING)
//                                                                                                                 .addComponent(jLabel2,
//                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                                                                 145,
//                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                                                                 .addComponent(jLabel3))
//                                                                                                 .addGap(47, 47, 47)
//                                                                                                 .addGroup(layout
//                                                                                                                 .createParallelGroup(
//                                                                                                                                 javax.swing.GroupLayout.Alignment.LEADING,
//                                                                                                                                 false)
//                                                                                                                 .addComponent(jTextField1)
//                                                                                                                 .addComponent(jPasswordField1,
//                                                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
//                                                                                                                                 139,
//                                                                                                                                 Short.MAX_VALUE)))
//                                                                                 .addGroup(layout.createSequentialGroup()
//                                                                                                 .addGap(138, 138, 138)
//                                                                                                 .addComponent(jButton1,
//                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                                                 122,
//                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                                                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
//                                                                                 Short.MAX_VALUE))
//                                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
//                                                                 .createSequentialGroup()
//                                                                 .addContainerGap(48, Short.MAX_VALUE)
//                                                                 .addGroup(layout.createParallelGroup(
//                                                                                 javax.swing.GroupLayout.Alignment.LEADING)
//                                                                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
//                                                                                                 layout.createSequentialGroup()
//                                                                                                                 .addComponent(jLabel1,
//                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                                                                 325,
//                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                                                                 .addGap(57, 57, 57))
//                                                                                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
//                                                                                                 layout.createSequentialGroup()
//                                                                                                                 .addComponent(jButton2)
//                                                                                                                 .addGap(36, 36, 36)))));
//                 layout.setVerticalGroup(
//                                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                 .addGroup(layout.createSequentialGroup()
//                                                                 .addContainerGap()
//                                                                 .addComponent(jLabel1,
//                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                 60,
//                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                 .addPreferredGap(
//                                                                                 javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                                                 .addGroup(layout.createParallelGroup(
//                                                                                 javax.swing.GroupLayout.Alignment.LEADING,
//                                                                                 false)
//                                                                                 .addComponent(jLabel2,
//                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
//                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
//                                                                                                 Short.MAX_VALUE)
//                                                                                 .addComponent(jTextField1,
//                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
//                                                                                                 44,
//                                                                                                 Short.MAX_VALUE))
//                                                                 .addGap(28, 28, 28)
//                                                                 .addGroup(layout.createParallelGroup(
//                                                                                 javax.swing.GroupLayout.Alignment.BASELINE)
//                                                                                 .addComponent(jLabel3,
//                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                                 47,
//                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                                 .addComponent(jPasswordField1,
//                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                                 47,
//                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE))
//                                                                 .addGap(35, 35, 35)
//                                                                 .addComponent(jButton1,
//                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
//                                                                                 49,
//                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                 .addGap(26, 26, 26)
//                                                                 .addComponent(jButton2)
//                                                                 .addGap(0, 23, Short.MAX_VALUE)));

//                 // btnBack.addActionListener(new ActionListener() {
//                 // public void actionPerformed(ActionEvent e) {
//                 // Jframe.dispose();
//                 // }
//                 // });

//                 // jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
//                 // public void mouseClicked(java.awt.event.MouseEvent evt) {
//                 // String name=jTextField1.getText();
//                 // String password=String.valueOf(jPasswordField1.getPassword());
//                 // if(name.equals("admin")&&password.equals("admin123")){
//                 // //RunQuery.main(new String[]{});
//                 // //dispose();
//                 // System.out.println("print");
//                 // }else{
//                 // //this.showMessageDialog(Adminloginform.this, "Sorry, Username or Password
//                 // Error","Login Error!", this.ERROR_MESSAGE);
//                 // jTextField1.setText("");
//                 // jPasswordField1.setText("");
//                 // }

//                 // }
//                 // });
//                 jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
//                         public void mouseClicked(java.awt.event.MouseEvent evt) {
//                                 String name = jTextField1.getText();
//                                 String password = String.valueOf(jPasswordField1.getPassword());
//                                 if (name.equals("buyer") && password.equals("buyer123")) {
//                                         // RunQuery.main(new String[]{});
//                                         // dispose();
//                                         System.out.println("print");
//                                 } else {
//                                         JOptionPane.showMessageDialog(Buyerloginform.this,
//                                                         "Sorry, Username or Password Error",
//                                                         "Login Error!", JOptionPane.ERROR_MESSAGE);
//                                         jTextField1.setText("");
//                                         jPasswordField1.setText("");
//                                 }
//                         }
//                 });

//                 jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
//                         public void mouseClicked(java.awt.event.MouseEvent evt) {
//                                 dispose();

//                         }
//                 });

//                 pack();
//                 this.setVisible(true);
//         }// </editor-fold>

//         /**
//          * @param args the command line arguments
//          */
//         public static void main(String args[]) {
//                 /* Set the Nimbus look and feel */
//                 // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
//                 // (optional) ">
//                 /*
//                  * If Nimbus (introduced in Java SE 6) is not available, stay with the default
//                  * look and feel.
//                  * For details see
//                  * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//                  */
//                 try {
//                         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
//                                         .getInstalledLookAndFeels()) {
//                                 if ("Nimbus".equals(info.getName())) {
//                                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                                         break;
//                                 }
//                         }
//                 } catch (ClassNotFoundException ex) {
//                         java.util.logging.Logger.getLogger(Buyerloginform.class.getName()).log(
//                                         java.util.logging.Level.SEVERE, null,
//                                         ex);
//                 } catch (InstantiationException ex) {
//                         java.util.logging.Logger.getLogger(Buyerloginform.class.getName()).log(
//                                         java.util.logging.Level.SEVERE, null,
//                                         ex);
//                 } catch (IllegalAccessException ex) {
//                         java.util.logging.Logger.getLogger(Buyerloginform.class.getName()).log(
//                                         java.util.logging.Level.SEVERE, null,
//                                         ex);
//                 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                         java.util.logging.Logger.getLogger(Buyerloginform.class.getName()).log(
//                                         java.util.logging.Level.SEVERE, null,
//                                         ex);
//                 }
//                 // </editor-fold>

//                 /* Create and display the form */
//                 java.awt.EventQueue.invokeLater(new Runnable() {
//                         public void run() {
//                                 new Buyerloginform().setVisible(true);
//                         }
//                 });
//         }

//         // Variables declaration - do not modify
//         private javax.swing.JButton jButton1;
//         private javax.swing.JButton jButton2;
//         private javax.swing.JLabel jLabel1;
//         private javax.swing.JLabel jLabel2;
//         private javax.swing.JLabel jLabel3;
//         private javax.swing.JPasswordField jPasswordField1;
//         private javax.swing.JTextField jTextField1;
//         // End of variables declaration
// }

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//
public class Buyerloginform extends javax.swing.JFrame {
        static Adminloginform frame;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPasswordField jPasswordField1;
        private javax.swing.JTextField jTextField1;

        static final String DB_URL = "jdbc:mysql://localhost:3306/real_estate_office";
        static final String USER = "root";
        static final String PASS = "password";

        public static int auth(String username, String pwd) {
                Connection conn = null;
                PreparedStatement stmt = null;
                String SQL;
                ResultSet result = null;

                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection(DB_URL, USER, PASS);

                        SQL = "SELECT 1 FROM buyer WHERE B_username=? and B_password=?";
                        stmt = conn.prepareStatement(SQL);
                        stmt.setString(1, username);
                        stmt.setString(2, pwd);
                        result = stmt.executeQuery();

                        if (result.next() && result.getString(1).equals("1")) {
                                return 1;
                        }

                        stmt.close();
                } catch (ClassNotFoundException ex) {
                        System.out.println("class not found, check the jar");
                } catch (SQLException ex) {
                        System.out.println("SQL is BAD!!" + ex.getMessage());
                } finally {
                        try {
                                if (result != null) {
                                        result.close();
                                }
                                if (stmt != null) {
                                        stmt.close();
                                }
                                if (conn != null) {
                                        conn.close();
                                }
                        } catch (SQLException ex) {
                                System.out.println("Error while closing resources: " + ex.getMessage());
                        }
                }

                return 0;
        }

        Buyerloginform() {
                jLabel1 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Buyer Login Form");
                this.setBackground(new java.awt.Color(102, 255, 255));
                this.setBounds(750, 200, 377, 319);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36));
                jLabel1.setText("Buyer Login Form");

                jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel2.setText("Enter Username :");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel3.setText("Enter Password : ");

                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jButton1.setText("Login");

                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jButton2.setText("Back");

                jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);

                // layout.setHorizontalGroup(
                // // your layout code here
                // );
                // layout.setVerticalGroup(
                // // your layout code here
                // );

                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(39, 39, 39)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                145,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel3))
                                                                                                .addGap(47, 47, 47)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jTextField1)
                                                                                                                .addComponent(jPasswordField1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                139,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(138, 138, 138)
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                122,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(48, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                325,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(57, 57, 57))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(jButton2)
                                                                                                                .addGap(36, 36, 36)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                44,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(28, 28, 28)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPasswordField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jButton2)
                                                                .addGap(0, 23, Short.MAX_VALUE)));

                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                String name = jTextField1.getText();
                                String password = String.valueOf(jPasswordField1.getPassword());
                                if (auth(name, password) == 1) {
                                        BuyerSuccess.main(new String[] { name, password });
                                        dispose();
                                } else {
                                        JOptionPane.showMessageDialog(Buyerloginform.this,
                                                        "Sorry, Username or Password Error",
                                                        "Login Error!", JOptionPane.ERROR_MESSAGE);
                                        jTextField1.setText("");
                                        jPasswordField1.setText("");
                                }
                        }
                });

                jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                dispose();
                        }
                });

                pack();
                this.setVisible(true);
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Agentloginform.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Agentloginform.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Agentloginform.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Agentloginform.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Buyerloginform().setVisible(true);
                        }
                });
        }
}

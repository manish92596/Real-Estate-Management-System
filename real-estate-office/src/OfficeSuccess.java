
public class OfficeSuccess extends javax.swing.JFrame {

   /**
    * Creates new form hello
    */
   public OfficeSuccess() {
      initComponents();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">
   private void initComponents() {

      jButton5 = new javax.swing.JButton();
      label1 = new java.awt.Label();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jButton4 = new javax.swing.JButton();
      jButton6 = new javax.swing.JButton();

      jButton5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
      jButton5.setText("Logout");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      label1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
      label1.setText("Select option");

      jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
      jButton1.setText("Show all agents");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
      jButton2.setText("Add agent");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });

      jButton3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
      jButton3.setText("Delete agent");
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });

      jButton4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
      jButton4.setText("Show all transaction");
      jButton4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
         }
      });

      jButton6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
      jButton6.setText("Logout");
      jButton6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(109, Short.MAX_VALUE)));
      layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE)));

      pack();
      this.setLocationRelativeTo(null);
   }// </editor-fold>

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
      // show agent
      ShowAllAgent.main(new String[] {});
      dispose();

      // TODO add your handling code here:
   }

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
      // add agent // TODO add your handling code here:
      AddAgent.main(new String[] {});
      dispose();
   }

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
      // delete agent // TODO add your handling code here:
      DeleteAgent.main(new String[] {});
      dispose();
   }

   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
      // show transaction // TODO add your handling code here:
      AllTransactions.main(new String[] {});
      dispose();
   }

   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
      // TODO add your handling code here:
      dispose();

   }

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {

      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(OfficeSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null,
               ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(OfficeSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null,
               ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(OfficeSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null,
               ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(OfficeSuccess.class.getName()).log(java.util.logging.Level.SEVERE, null,
               ex);
      }
      // </editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new OfficeSuccess().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JButton jButton6;
   private java.awt.Label label1;
   // End of variables declaration
}


package FINAL;

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Emailfield = new javax.swing.JTextField();
        conformpasswordfield = new javax.swing.JPasswordField();
        Passwordfield = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();
        conformpasswordfield1 = new javax.swing.JPasswordField();
        Registerbutton = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL/icons/stress-management.png"))); // NOI18N
        jLabel3.setText("MoodLift");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Confirm Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Email :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));
        jPanel1.add(Emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 30));
        jPanel1.add(conformpasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 250, 30));

        Passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 30));

        Back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 110, -1));
        jPanel1.add(conformpasswordfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 250, 30));

        Registerbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Registerbutton.setText("Register");
        Registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String encryptMessage(String input) {
    StringBuilder encrypted = new StringBuilder();
    for (char c : input.toCharArray()) {
        encrypted.append((char)(c + 3));
    }
    return encrypted.toString();
}    
    public static String decryptMessage(String input) {
    StringBuilder decrypted = new StringBuilder();
    for (char c : input.toCharArray()) {
        decrypted.append((char)(c - 3));
    }
    return decrypted.toString();
}


    private void PasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfieldActionPerformed
      
    }//GEN-LAST:event_PasswordfieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
           
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        }); dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void RegisterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbuttonActionPerformed
     String email = Emailfield.getText();
    String password = new String(Passwordfield.getPassword());
    String confirmPassword = new String(conformpasswordfield.getPassword());

    if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields.");
        return;
    }

    if (!password.equals(confirmPassword)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match.");
        return;
    }

    String encryptedPassword = encryptMessage(password);

    try {
        java.io.File folder = new java.io.File("C:\\accounts");
        if (!folder.exists()) folder.mkdir();

        java.io.File userFile = new java.io.File(folder, email + ".txt");

        if (userFile.exists()) {
            javax.swing.JOptionPane.showMessageDialog(this, "User already exists.");
            return;
        }

        java.io.FileWriter writer = new java.io.FileWriter(userFile);
        writer.write("Email: " + email + "\n");
        writer.write("Encrypted Password: " + encryptedPassword + "\n");
        writer.close();

        javax.swing.JOptionPane.showMessageDialog(this, "Registration successful!");

        new Login().setVisible(true);
        this.dispose();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    
    }//GEN-LAST:event_RegisterbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField Emailfield;
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JButton Registerbutton;
    private javax.swing.JPasswordField conformpasswordfield;
    private javax.swing.JPasswordField conformpasswordfield1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

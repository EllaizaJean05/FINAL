package FINAL;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registerbutton = new javax.swing.JButton();
        loginfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        jLabel1.setText("Password :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 90, 43));

        loginbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbutton.setText("LOGIN");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 209, 40));

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL/icons/stress-management.png"))); // NOI18N
        jLabel3.setText("MoodLift");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, 100));

        registerbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerbutton.setText("CREATE ACCOUNT");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 209, 40));
        jPanel1.add(loginfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 340, 30));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        jLabel4.setText("Email  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, 43));
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
        
        

    }
    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        String email = loginfield.getText();
        String password = new String(passwordfield.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter email and password.");
            return;
        }

        java.io.File userFile = new java.io.File("C:\\accounts", email + ".txt");

        if (!userFile.exists()) {
            JOptionPane.showMessageDialog(this, "Account not found.");
            return;
        }

        try {
            java.util.Scanner reader = new java.util.Scanner(userFile);
            String storedEncryptedPassword = null;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.startsWith("Encrypted Password: ")) {
                    storedEncryptedPassword = line.substring("Encrypted Password: ".length());
                    break;
                }
            }
            reader.close();

            String encryptedInput = encrypt(password);

            if (storedEncryptedPassword != null && storedEncryptedPassword.equals(encryptedInput)) {
                JOptionPane.showMessageDialog(this, "Login successful!");

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Dashboard(email).setVisible(true);// pass the logged-in email here
                    }
                });
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect password.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading account file: " + e.getMessage());
        }
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
        dispose();

    }//GEN-LAST:event_registerbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JTextField loginfield;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton registerbutton;
    // End of variables declaration//GEN-END:variables
}

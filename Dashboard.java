package FINAL;

public class Dashboard extends javax.swing.JFrame {
    private String userEmail;  // store the logged-in user email
    private java.io.File userDataFile;  // file to save/load data

    private int happyCount = 0;
    private int sadCount = 0;
    private int angryCount = 0;
    private int totalEntries = 0;

    public Dashboard(String email) {
        this.userEmail = email;

        java.io.File accountsDir = new java.io.File("C:\\accounts");
        if (!accountsDir.exists()) {
            accountsDir.mkdirs(); // create directory if not exists
        }

        this.userDataFile = new java.io.File(accountsDir, userEmail + "_data.txt");

        initComponents();
        this.setLocationRelativeTo(null);
        
        setupTable();
        loadUserData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        experiencefield = new javax.swing.JTextField();
        Submet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Feeling = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        advisemessage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        angryprograssbar = new javax.swing.JProgressBar();
        Happyprograssbar = new javax.swing.JProgressBar();
        sadprograssbar = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Feeling", "Experience", "Time_date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        experiencefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experiencefieldActionPerformed(evt);
            }
        });

        Submet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Submet.setText("Submit");
        Submet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Diary");

        Feeling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "happy", "sad", "angry" }));
        Feeling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeelingActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("Feeling :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setText("Title :");

        Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Feeling, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Submet)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(experiencefield, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Feeling)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(experiencefield, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 410, 440));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(advisemessage, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(advisemessage, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 440, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL/icons/sad.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL/icons/angry.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FINAL/icons/excited (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel1.add(angryprograssbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 320, 40));
        jPanel1.add(Happyprograssbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 320, 40));
        jPanel1.add(sadprograssbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 320, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("happy");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Angry ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Sad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jButton1.setText("logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void setupTable() {
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
        model.setColumnIdentifiers(new String[] { "Title", "Experience", "Feeling", "Date & Time" });
        jTable1.setModel(model);
    }
    private void loadUserData() {
        if (!userDataFile.exists()) return;  

        try (java.util.Scanner scanner = new java.util.Scanner(userDataFile)) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    model.addRow(parts);

                    // update counters
                    String feeling = parts[2].toLowerCase();
                    totalEntries++;
                    switch (feeling) {
                        case "happy": happyCount++; break;
                        case "sad": sadCount++; break;
                        case "angry": angryCount++; break;
                    }
                }
            }
            updateProgressBars();
            updateAdviceMessage();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
    }
 private void saveEntryToFile(String title, String experience, String feeling, String dateTime) {
        try {

            try (java.io.FileWriter fw = new java.io.FileWriter(userDataFile, true);
                 java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
                 java.io.PrintWriter out = new java.io.PrintWriter(bw)) {

                out.println(title + "|" + experience + "|" + feeling + "|" + dateTime);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage());
        }
    }

    private void SubmetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmetActionPerformed
      String title = Title.getText();
        String experience = experiencefield.getText();
        String feeling = (String) Feeling.getSelectedItem();
        String dateTime = java.time.LocalDateTime.now().toString();

        if (title.isEmpty() || experience.isEmpty() || feeling == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{title, experience, feeling, dateTime});

        totalEntries++;
        switch (feeling.toLowerCase()) {
            case "happy": happyCount++; break;
            case "sad": sadCount++; break;
            case "angry": angryCount++; break;
        }

        updateProgressBars();
        updateAdviceMessage();

        saveEntryToFile(title, experience, feeling, dateTime);

        Title.setText("");
        experiencefield.setText("");
        Feeling.setSelectedIndex(0);
    }//GEN-LAST:event_SubmetActionPerformed
  private void updateProgressBars() {
        int happyPercent = totalEntries > 0 ? (int) ((happyCount / (double) totalEntries) * 100) : 0;
        int sadPercent = totalEntries > 0 ? (int) ((sadCount / (double) totalEntries) * 100) : 0;
        int angryPercent = totalEntries > 0 ? (int) ((angryCount / (double) totalEntries) * 100) : 0;

        Happyprograssbar.setValue(happyPercent);
        sadprograssbar.setValue(sadPercent);
        angryprograssbar.setValue(angryPercent);
    }

    private void updateAdviceMessage() {
        if (angryCount > happyCount && angryCount > sadCount) {
            advisemessage.setText("Try to relax. Maybe take a short break or talk to someone.");
        } else if (sadCount > happyCount) {
            advisemessage.setText("It's okay to feel sad. Remember you're not alone.");
        } else if (happyCount > 0) {
            advisemessage.setText("You're doing great! Keep it up.");
        } else {
            advisemessage.setText("How are you feeling today?");
        }
    }
    private void experiencefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experiencefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experiencefieldActionPerformed

    private void FeelingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeelingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeelingActionPerformed

    private void TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });   dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
      
     java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Dashboard("user@example.com").setVisible(true);
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Feeling;
    private javax.swing.JProgressBar Happyprograssbar;
    private javax.swing.JButton Submet;
    private javax.swing.JTextField Title;
    private javax.swing.JLabel advisemessage;
    private javax.swing.JProgressBar angryprograssbar;
    private javax.swing.JTextField experiencefield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JProgressBar sadprograssbar;
    // End of variables declaration//GEN-END:variables
}

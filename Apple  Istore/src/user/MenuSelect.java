package user;

public class MenuSelect extends javax.swing.JFrame {

    
    public MenuSelect() {
        initComponents();
        setLocationRelativeTo(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCancel2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnUpd = new javax.swing.JButton();
        btAll = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnDelet3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnAddUser = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnAddUser1 = new javax.swing.JMenuItem();
        btnAddUser2 = new javax.swing.JMenuItem();
        btnAddUser3 = new javax.swing.JMenuItem();
        btnAddUser4 = new javax.swing.JMenuItem();
        btnAddUser5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGER INTERFACE");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APPLE I STORE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 134, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 110));

        btnCancel2.setBackground(new java.awt.Color(102, 255, 102));
        btnCancel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel2.setText("Log in menu");
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 152, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpd.setBackground(new java.awt.Color(204, 204, 204));
        btnUpd.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnUpd.setText("UPDATE DEVICE");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 380, -1));

        btAll.setBackground(new java.awt.Color(204, 204, 204));
        btAll.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btAll.setText("ALL DEVICE");
        btAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllActionPerformed(evt);
            }
        });
        jPanel1.add(btAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 380, -1));

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnSearch.setText("SEARCH DEVICE");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 380, -1));

        btnAdd1.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnAdd1.setText("ADD DEVICE");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, -1));

        btnDelet3.setBackground(new java.awt.Color(204, 204, 204));
        btnDelet3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnDelet3.setText("DELETE DEVICE");
        btnDelet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelet3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 420, 330));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/inf.png"))); // NOI18N
        jLabel3.setText("Device ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Users");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        btnAddUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jMenu2.add(btnAddUser);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Device");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        btnAddUser1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btnAddUser1.setText("Add Device");
        btnAddUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUser1ActionPerformed(evt);
            }
        });
        jMenu3.add(btnAddUser1);

        btnAddUser2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        btnAddUser2.setText("Delete Device");
        btnAddUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUser2ActionPerformed(evt);
            }
        });
        jMenu3.add(btnAddUser2);

        btnAddUser3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        btnAddUser3.setText("Update device");
        btnAddUser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUser3ActionPerformed(evt);
            }
        });
        jMenu3.add(btnAddUser3);

        btnAddUser4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        btnAddUser4.setText("All device");
        btnAddUser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUser4ActionPerformed(evt);
            }
        });
        jMenu3.add(btnAddUser4);

        btnAddUser5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        btnAddUser5.setText("Search Device");
        btnAddUser5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUser5ActionPerformed(evt);
            }
        });
        jMenu3.add(btnAddUser5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        this.setVisible(false);
        UsearAdd uadd = new UsearAdd();
        uadd.setVisible(true);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllActionPerformed
        this.setVisible(false);
        ViewAllDevice all = new ViewAllDevice ();
        all.setVisible(true);
    }//GEN-LAST:event_btAllActionPerformed

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        this.setVisible(false);
        LogIn all = new LogIn ();
        all.setVisible(true);
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        this.setVisible(false);
        AddDevice Add = new AddDevice ();
        Add.setVisible(true);
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        this.setVisible(false);
        UpdateDevice update = new UpdateDevice ();
        update.setVisible(true);
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         this.setVisible(false); 
         SearchDevice search = new SearchDevice ();
         search.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDelet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelet3ActionPerformed
        this.setVisible(false);
        DeleteDevice delete = new DeleteDevice ();
        delete.setVisible(true);
    }//GEN-LAST:event_btnDelet3ActionPerformed

    private void btnAddUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUser1ActionPerformed
        this.setVisible(false);
        AddDevice Add = new AddDevice ();
        Add.setVisible(true);
    }//GEN-LAST:event_btnAddUser1ActionPerformed

    private void btnAddUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUser2ActionPerformed
         this.setVisible(false);
        DeleteDevice delete = new DeleteDevice ();
        delete.setVisible(true);
    }//GEN-LAST:event_btnAddUser2ActionPerformed

    private void btnAddUser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUser3ActionPerformed
        this.setVisible(false);
        UpdateDevice update = new UpdateDevice ();
        update.setVisible(true);
    }//GEN-LAST:event_btnAddUser3ActionPerformed

    private void btnAddUser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUser4ActionPerformed
        this.setVisible(false);
        ViewAllDevice all = new ViewAllDevice ();
        all.setVisible(true);
    }//GEN-LAST:event_btnAddUser4ActionPerformed

    private void btnAddUser5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUser5ActionPerformed
        this.setVisible(false); 
         SearchDevice search = new SearchDevice ();
         search.setVisible(true);
    }//GEN-LAST:event_btnAddUser5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAll;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JMenuItem btnAddUser;
    private javax.swing.JMenuItem btnAddUser1;
    private javax.swing.JMenuItem btnAddUser2;
    private javax.swing.JMenuItem btnAddUser3;
    private javax.swing.JMenuItem btnAddUser4;
    private javax.swing.JMenuItem btnAddUser5;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelet3;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
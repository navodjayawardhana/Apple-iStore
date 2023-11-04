package user;

import javax.swing.table.*;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
public class ViewAllDevice extends javax.swing.JFrame {

    DefaultTableModel tblModel;
    public ViewAllDevice() {
        initComponents();
        setLocationRelativeTo(this);
        
        tblModel = new DefaultTableModel();
        tbdeviceData.setModel(tblModel);
        
        tblModel.addColumn("Device ID");
        tblModel.addColumn("Category");
        tblModel.addColumn("Device Name");
        tblModel.addColumn("Price");
        tblModel.addColumn("Quintity");        
        tblModel.setRowCount(0);
        
        try{
            BufferedReader dr = new BufferedReader(new FileReader("Device.txt"));
            String line;
            while((line=dr.readLine())!=null){
                if(line.equals("")){
                    continue;
                }
                else{
                    String[] data =line.split(",");
                    tblModel.addRow(new Object[]{data[0],data[4],data[1],data[2],data[3]});
                }
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JComboBox<>();
        btnCat = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdeviceData = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("APPLE I STORE-VIEW ALL DEVICE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        txtCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "iPhone", "Apple Watch", "iPad", "AirPods", "Mac", "Other" }));
        txtCategory.setBorder(null);
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, 33));

        btnCat.setBackground(new java.awt.Color(0, 204, 51));
        btnCat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCat.setText("Search");
        btnCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatActionPerformed(evt);
            }
        });
        jPanel1.add(btnCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        btnCancel1.setBackground(new java.awt.Color(204, 255, 204));
        btnCancel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel1.setText("Back Main Menu");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 170, -1));

        tbdeviceData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbdeviceData);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 649, 349));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Filter");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/inf.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void btnCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatActionPerformed

        tblModel.setRowCount(0);

        String Cat = txtCategory.getSelectedItem().toString();

        try{
            BufferedReader dr = new BufferedReader(new FileReader("Device.txt"));
            String line;
            while((line=dr.readLine())!=null){
                if(line.equals("")){
                    continue;
                }
                else{
                    String[] data =line.split(",");
                    if(data[4].equals(Cat)){
                        tblModel.addRow(new Object[]{data[0],data[4],data[1],data[2],data[3]});
                    }
                }
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnCatActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        this.setVisible(false);
        MenuSelect Menu = new MenuSelect ();
        Menu.setVisible(true);
    }//GEN-LAST:event_btnCancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllDevice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdeviceData;
    private javax.swing.JComboBox<String> txtCategory;
    // End of variables declaration//GEN-END:variables
}

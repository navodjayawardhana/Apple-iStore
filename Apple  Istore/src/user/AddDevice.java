package user;
import business.*;
import java.io.*;
import javax.swing.JOptionPane;

public class AddDevice extends javax.swing.JFrame {

    
    public AddDevice() {
        initComponents();
        setLocationRelativeTo(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtdeviceID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtdeviceName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtqnty = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCancel1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APPLE I STORE-ADD DEVICE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txtdeviceID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtdeviceID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtdeviceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 115, 373, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 165, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Device ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, -1));

        cmbCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "iPhone", "Apple Watch", "iPad", "AirPods", "Mac", "Other" }));
        cmbCategory.setBorder(null);
        getContentPane().add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 165, 373, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Device Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 215, 140, -1));

        txtdeviceName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtdeviceName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtdeviceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 215, 373, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 275, 140, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 275, 373, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 335, 140, -1));

        txtqnty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtqnty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtqnty, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 335, 373, -1));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel.setText("Exit");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 60, -1));

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 134, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 110));

        btnCancel1.setBackground(new java.awt.Color(204, 255, 204));
        btnCancel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel1.setText("Back Main Menu");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/inf.png"))); // NOI18N
        jLabel3.setText("Device ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(check1()&& check2()&& AllADD()){
        {
                int deviceID = Integer.valueOf(txtdeviceID.getText());
                String deviceName = txtdeviceName.getText();
                String price = txtPrice.getText();
                int qnty = Integer.valueOf(txtqnty.getText());
                String Category = cmbCategory.getSelectedItem().toString();

                device dev = new device(deviceID,deviceName,price,qnty,Category);

                try{
                    BufferedWriter df = new BufferedWriter(new FileWriter("Device.txt",true));
                    df.append("\n"+dev.Print());
                    JOptionPane.showMessageDialog(rootPane, "Device Added Successfuly!");
                    df.close();
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "PLASE ADD ALL DATA");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddDevice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtdeviceID;
    private javax.swing.JTextField txtdeviceName;
    private javax.swing.JTextField txtqnty;
    // End of variables declaration//GEN-END:variables

public boolean AllADD(){
        try{
            BufferedReader dr = new BufferedReader(new FileReader("Device.txt"));
            String data;
            String deviceID = txtdeviceID.getText();
            while((data = dr.readLine())!=null){
                String[] line = data.split(",");
                if(line[0].equals(deviceID)){
                    JOptionPane.showMessageDialog(rootPane, "Device ID Exists!");
                    return false;
                }     
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        return true;
    }



    public boolean check1(){
        if(txtdeviceID.getText().equals("")){
            return false;
        }
        if(txtdeviceName.getText().equals("")){
            return false;
        }
            
        if(txtPrice.getText().equals("")){
            return false;
        }
        if(txtqnty.getText().equals("")){
            return false;
        }
       
        
        else{
            return true;
        }
    }
    
    public boolean check2(){
        try{
            int deviceId = Integer.valueOf(txtdeviceID.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Device ID must be an Integer!");
            return false;
        }
        
        try{
            int deviceqnty = Integer.valueOf(txtqnty.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Quantity must be an Integer!");
            return false;
        }
        
        
        return true;
    }
    
    
}

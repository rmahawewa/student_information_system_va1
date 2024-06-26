/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.IndividualView;

import View.MainView;

/**
 *
 * @author HP
 */
public class ViewSchoolInfo extends javax.swing.JPanel {
    
    MainView mv;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public ViewSchoolInfo() {
        initComponents();
    }
    
    public ViewSchoolInfo(MainView mf) {
        initComponents();
        this.mv = mf;
    }
    
    public void setSchoolName(String school_name){
        schoolNameValueLabel.setText(school_name);
    }
    
    public void setSchoolAddress(String school_address){
        addressValueLabel.setText(school_address);
    }
    
    public void setContactNumber(String contact_number){
        contactNumberValueLabel.setText(contact_number);
    }
    
    public void setDetails(String details){
        detailsValueLabel.setText(details);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topicLabel = new javax.swing.JLabel();
        schoolNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        schoolNameValueLabel = new javax.swing.JLabel();
        addressValueLabel = new javax.swing.JLabel();
        detailsValueLabel = new javax.swing.JLabel();
        contactNumberValueLabel = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("School Information");

        schoolNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        schoolNameLabel.setText("School name:");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLabel.setText("Address:");

        contactNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactNumberLabel.setText("Contact number:");

        detailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        schoolNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        schoolNameValueLabel.setText("school name");

        addressValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressValueLabel.setText("address");

        detailsValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsValueLabel.setText("details");

        contactNumberValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactNumberValueLabel.setText("contact number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schoolNameLabel)
                    .addComponent(addressLabel)
                    .addComponent(contactNumberLabel)
                    .addComponent(detailsLabel))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicLabel)
                    .addComponent(addressValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schoolNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNumberValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(topicLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolNameLabel)
                    .addComponent(schoolNameValueLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressValueLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contactNumberLabel)
                        .addComponent(contactNumberValueLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(detailsLabel)
                            .addComponent(detailsValueLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        mv.close_tab();
    }//GEN-LAST:event_closeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddSchoolInfo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressValueLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel contactNumberValueLabel;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JLabel detailsValueLabel;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JLabel schoolNameValueLabel;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

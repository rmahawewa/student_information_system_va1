/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.IndividualView;

import View.Edit.*;
import View.Add.*;
import View.*;

/**
 *
 * @author HP
 */
public class ViewStudentSchoolInfo extends javax.swing.JPanel {

    /**
     * Creates new form StudentSchoolInfo
     */
    public ViewStudentSchoolInfo() {
        initComponents();
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
        studentNameLabel = new javax.swing.JLabel();
        schoolNameLabel = new javax.swing.JLabel();
        dateOfEntaranceLabel = new javax.swing.JLabel();
        isCurrentlyStudingLabel = new javax.swing.JLabel();
        dateOfLeaveLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        studentNameValueLabel = new javax.swing.JLabel();
        schoolNameValueLabel = new javax.swing.JLabel();
        dateOfEntaranceValueLabel = new javax.swing.JLabel();
        isCurrentlyStudingValueLabel = new javax.swing.JLabel();
        dateOfLeaveValueLabel = new javax.swing.JLabel();
        closeFromTopButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(595, 2147483647));
        setPreferredSize(new java.awt.Dimension(595, 758));

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Student's School Information");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel.setText("Student's name:");

        schoolNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        schoolNameLabel.setText("School name:");

        dateOfEntaranceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfEntaranceLabel.setText("Date of enterance:");

        isCurrentlyStudingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isCurrentlyStudingLabel.setText("Is currently studing:");

        dateOfLeaveLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfLeaveLabel.setText("Date of leave:");

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setText("Close");

        studentNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameValueLabel.setText("student name");

        schoolNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        schoolNameValueLabel.setText("school name");

        dateOfEntaranceValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfEntaranceValueLabel.setText("date of entarance");

        isCurrentlyStudingValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        isCurrentlyStudingValueLabel.setText("is currently studing");

        dateOfLeaveValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfLeaveValueLabel.setText("date of leave");

        closeFromTopButton.setBackground(new java.awt.Color(102, 0, 102));
        closeFromTopButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeFromTopButton.setForeground(new java.awt.Color(255, 255, 255));
        closeFromTopButton.setText("X");
        closeFromTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFromTopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfEntaranceLabel)
                    .addComponent(dateOfLeaveLabel)
                    .addComponent(isCurrentlyStudingLabel)
                    .addComponent(schoolNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(schoolNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfLeaveValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isCurrentlyStudingValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addComponent(dateOfEntaranceValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(topicLabel)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeFromTopButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeFromTopButton)
                .addGap(14, 14, 14)
                .addComponent(topicLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameValueLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolNameLabel)
                    .addComponent(schoolNameValueLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfEntaranceLabel)
                    .addComponent(dateOfEntaranceValueLabel))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isCurrentlyStudingLabel)
                    .addComponent(isCurrentlyStudingValueLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfLeaveLabel)
                    .addComponent(dateOfLeaveValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeFromTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFromTopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeFromTopButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(AddStudentSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddStudentSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddStudentSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddStudentSchoolInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddStudentSchoolInfo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton closeFromTopButton;
    private javax.swing.JLabel dateOfEntaranceLabel;
    private javax.swing.JLabel dateOfEntaranceValueLabel;
    private javax.swing.JLabel dateOfLeaveLabel;
    private javax.swing.JLabel dateOfLeaveValueLabel;
    private javax.swing.JLabel isCurrentlyStudingLabel;
    private javax.swing.JLabel isCurrentlyStudingValueLabel;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JLabel schoolNameValueLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameValueLabel;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}
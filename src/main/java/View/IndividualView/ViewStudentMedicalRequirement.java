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
public class ViewStudentMedicalRequirement extends javax.swing.JPanel {

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public ViewStudentMedicalRequirement() {
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
        firstDateOfTreatmentLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        medicalRequirementLabel = new javax.swing.JLabel();
        firstDateOfDiagnoseLabel = new javax.swing.JLabel();
        lastDateOfTraetementLabel = new javax.swing.JLabel();
        detailsTextField = new javax.swing.JTextField();
        studentNameLabel1 = new javax.swing.JLabel();
        medicalRequirementLabel1 = new javax.swing.JLabel();
        firstDateOfDiagnoseValueLabel = new javax.swing.JLabel();
        firstDateOfTreatmentValueLabel = new javax.swing.JLabel();
        lastDateOfTreatmentValueLabel = new javax.swing.JLabel();
        closeFromTopButton = new javax.swing.JButton();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Student Medical Requirement Information");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel.setText("Student name:");

        firstDateOfTreatmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfTreatmentLabel.setText("First date of treatement:");

        detailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setText("Close");

        medicalRequirementLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalRequirementLabel.setText("Medical Requirement:");

        firstDateOfDiagnoseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfDiagnoseLabel.setText("First date of diagnose:");

        lastDateOfTraetementLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastDateOfTraetementLabel.setText("Last date of treatment:");

        detailsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsTextFieldActionPerformed(evt);
            }
        });

        studentNameLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel1.setText("student name value");

        medicalRequirementLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalRequirementLabel1.setText("medical requirement value");

        firstDateOfDiagnoseValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfDiagnoseValueLabel.setText("first date of diagnose");

        firstDateOfTreatmentValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfTreatmentValueLabel.setText("first date of treatment");

        lastDateOfTreatmentValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastDateOfTreatmentValueLabel.setText("last date of treatment");

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
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameLabel)
                            .addComponent(medicalRequirementLabel))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicalRequirementLabel1)
                            .addComponent(studentNameLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailsLabel)
                            .addComponent(firstDateOfTreatmentLabel)
                            .addComponent(firstDateOfDiagnoseLabel)
                            .addComponent(lastDateOfTraetementLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastDateOfTreatmentValueLabel)
                            .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstDateOfTreatmentValueLabel)
                            .addComponent(firstDateOfDiagnoseValueLabel))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(topicLabel)
                        .addGap(94, 94, 94)
                        .addComponent(closeFromTopButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(topicLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeFromTopButton)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalRequirementLabel)
                    .addComponent(medicalRequirementLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstDateOfDiagnoseLabel)
                    .addComponent(firstDateOfDiagnoseValueLabel))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstDateOfTreatmentLabel)
                    .addComponent(firstDateOfTreatmentValueLabel))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastDateOfTraetementLabel)
                    .addComponent(lastDateOfTreatmentValueLabel))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(closeButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsTextFieldActionPerformed

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
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddStudentMedicalRequirement().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton closeFromTopButton;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextField detailsTextField;
    private javax.swing.JLabel firstDateOfDiagnoseLabel;
    private javax.swing.JLabel firstDateOfDiagnoseValueLabel;
    private javax.swing.JLabel firstDateOfTreatmentLabel;
    private javax.swing.JLabel firstDateOfTreatmentValueLabel;
    private javax.swing.JLabel lastDateOfTraetementLabel;
    private javax.swing.JLabel lastDateOfTreatmentValueLabel;
    private javax.swing.JLabel medicalRequirementLabel;
    private javax.swing.JLabel medicalRequirementLabel1;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameLabel1;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

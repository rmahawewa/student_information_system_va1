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
public class ViewExam extends javax.swing.JPanel{

    /**
     * Creates new form AddStudentSchoolInfo
     */
    
    public ViewExam() {
        initComponents();
    }
    
    public void setExamName(String exam_name){
        examNameValueLabel.setText(exam_name);
    }
    public void setExamCode(String exam_code){
        examCodeValueLabel.setText(exam_code);
    }
    public void setYear(String year){
        yearValueLabel.setText(year);
    }
    public void setSemester(String semester){
        semesterValueLabel.setText(semester);
    }
    public void setFromDate(String from_date){
        fromDateValueLabel.setText(from_date);
    }
    public void setToDate(String to_date){
        toDateValueLabel.setText(to_date);
    }
    public void setDetails(String details){
        detailsTextField.setText(details);
        //detailsTextField.disable();
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
        examNameLabel = new javax.swing.JLabel();
        toDateLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        examCodeLabel = new javax.swing.JLabel();
        fromDateLabel = new javax.swing.JLabel();
        detailsTextField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        examNameValueLabel = new javax.swing.JLabel();
        examCodeValueLabel = new javax.swing.JLabel();
        yearValueLabel = new javax.swing.JLabel();
        semesterValueLabel = new javax.swing.JLabel();
        fromDateValueLabel = new javax.swing.JLabel();
        toDateValueLabel = new javax.swing.JLabel();
        closeFromTopButton = new javax.swing.JButton();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Exam Information");

        examNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameLabel.setText("Exam name:");

        toDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toDateLabel.setText("To date:");

        detailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setText("Close");

        examCodeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examCodeLabel.setText("Exam code:");

        fromDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fromDateLabel.setText("From date:");

        detailsTextField.setEditable(false);
        detailsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsTextFieldActionPerformed(evt);
            }
        });

        yearLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearLabel.setText("Year:");

        semesterLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semesterLabel.setText("Semester:");

        examNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameValueLabel.setText("exam name label");

        examCodeValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examCodeValueLabel.setText("exam code label");

        yearValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearValueLabel.setText("exam year label");

        semesterValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semesterValueLabel.setText("exam semester label");

        fromDateValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fromDateValueLabel.setText("exam from date label");

        toDateValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toDateValueLabel.setText("exam to date label");

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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(examNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailsLabel)
                            .addComponent(toDateLabel)
                            .addComponent(yearLabel)
                            .addComponent(examCodeLabel)
                            .addComponent(semesterLabel)
                            .addComponent(fromDateLabel))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(examCodeValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(semesterValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fromDateValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(toDateValueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(topicLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeFromTopButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(topicLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeFromTopButton)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examNameLabel)
                    .addComponent(examNameValueLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examCodeLabel)
                    .addComponent(examCodeValueLabel))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(yearValueLabel))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterLabel)
                    .addComponent(semesterValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromDateLabel)
                    .addComponent(fromDateValueLabel))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toDateLabel)
                    .addComponent(toDateValueLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(cancelButton)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsTextFieldActionPerformed

    private void closeFromTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFromTopButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeFromTopButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
////        //</editor-fold>
//

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewExam().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton closeFromTopButton;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextField detailsTextField;
    private javax.swing.JLabel examCodeLabel;
    private javax.swing.JLabel examCodeValueLabel;
    private javax.swing.JLabel examNameLabel;
    private javax.swing.JLabel examNameValueLabel;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JLabel fromDateValueLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel semesterValueLabel;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JLabel toDateValueLabel;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JLabel yearValueLabel;
    // End of variables declaration//GEN-END:variables
}

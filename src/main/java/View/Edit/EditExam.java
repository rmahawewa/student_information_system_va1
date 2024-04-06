/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Edit;

import View.Add.*;
import View.*;
import UserLibraries.GetTimes;
import java.util.ArrayList;
import java.util.List;
import Controller.ExamController;
import View.MessageBox.FormValidation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class EditExam extends javax.swing.JPanel{

    private MainView mv;
    private int exam_id;
    
    /**
     * Creates new form AddStudentSchoolInfo
     */
    public EditExam() {
        initComponents();
    }
    
    public EditExam(MainView mf) {
        initComponents();
        this.mv = mf;
    }
    
    public JButton getCloseButton(){
        return this.cancelButton;
    }
    
    public void setExamId(String id){
        this.exam_id = Integer.parseInt(id);
    }
    
    public void setExamName(String exm_name){
        examNameText.setText(exm_name);
    }
    
    public void setExamCode(String exm_code){
        examCodeText.setText(exm_code);
    }
    
    public void setYear(String yr){
        yearComboBx.setSelectedItem(yr);
    }
    
    public void setSemester(String semester){
        semesterComboBx1.setSelectedItem(semester);
    }
    
    public void setFromDate(String from_date){
        GetTimes gt = new GetTimes();
        String[] date = gt.getDateWithMonthName(from_date);
        fdYearComboBx.setSelectedItem(date[0]);
        fdMonthComboBx.setSelectedItem(date[1]);
        fdDayComboBx.setSelectedItem(date[2]);
    }
    
    public void setToDate(String to_date){
        GetTimes gt = new GetTimes();
        String[] date = gt.getDateWithMonthName(to_date);
        tdYearComboBx.setSelectedItem(date[0]);
        tdMonthComboBx.setSelectedItem(date[1]);
        tdDayComboBx.setSelectedItem(date[2]);
    }
    
    public void setDetails(String details){
        detailsTextField.setText(details);
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
        examNameText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        tdDayComboBx = new javax.swing.JComboBox<>();
        tdYearComboBx = new javax.swing.JComboBox<>();
        tdMonthComboBx = new javax.swing.JComboBox<>();
        examCodeText = new javax.swing.JTextField();
        examCodeLabel = new javax.swing.JLabel();
        fdDayComboBx = new javax.swing.JComboBox<>();
        fdYearComboBx = new javax.swing.JComboBox<>();
        fdMonthComboBx = new javax.swing.JComboBox<>();
        fromDateLabel = new javax.swing.JLabel();
        yearComboBx = new javax.swing.JComboBox<>();
        detailsTextField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        semesterComboBx1 = new javax.swing.JComboBox<>();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Edit Exam Information");

        examNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameLabel.setText("Exam name:");

        toDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toDateLabel.setText("To date:");

        detailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        examNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examNameTextActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        tdDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tdDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        tdYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tdYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        tdMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tdMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        examCodeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        examCodeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examCodeLabel.setText("Exam code:");

        fdDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        fdYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        fdMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        fromDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fromDateLabel.setText("From date:");

        yearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        detailsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsTextFieldActionPerformed(evt);
            }
        });

        yearLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearLabel.setText("Year:");

        semesterLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semesterLabel.setText("Semester:");

        semesterComboBx1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        semesterComboBx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester", "Third Semester", "Forth Semester", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(fromDateLabel)
                                .addGap(410, 410, 410))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(semesterLabel)
                                    .addComponent(examCodeLabel)
                                    .addComponent(examNameLabel)
                                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(examNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(examCodeText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(yearComboBx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(semesterComboBx1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(detailsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fdYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(toDateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tdYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fdMonthComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tdMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(fdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(tdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(topicLabel)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(topicLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(examNameLabel)
                        .addGap(41, 41, 41)
                        .addComponent(examCodeLabel)
                        .addGap(43, 43, 43)
                        .addComponent(yearLabel)
                        .addGap(43, 43, 43)
                        .addComponent(semesterLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(examNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(examCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(semesterComboBx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDateLabel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(cancelButton))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsTextFieldActionPerformed

    private void examNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examNameTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String exam_name = examNameText.getText();
        String exam_code = examCodeText.getText();
        String year = (String) yearComboBx.getSelectedItem();
        String semester = (String) semesterComboBx1.getSelectedItem();
        String frm_year = (String) fdYearComboBx.getSelectedItem();
        String frm_month = (String) fdMonthComboBx.getSelectedItem();
        GetTimes gt = new GetTimes();
        frm_month = gt.getMonthNumber(frm_month);
        String frm_day = (String) fdDayComboBx.getSelectedItem();
        String from_date = frm_year + "-" + frm_month + "-" + frm_day;
        String to_year = (String) tdYearComboBx.getSelectedItem();
        String to_month = (String) tdMonthComboBx.getSelectedItem();
        to_month = gt.getMonthNumber(to_month);
        String to_day = (String) tdDayComboBx.getSelectedItem();
        String to_date = to_year + "-" + to_month + "-" + to_day;
        String details = detailsTextField.getText();
        
        if(!exam_name.equals("")){
            List<String> ed = new ArrayList<String>();
            ed.add(0, Integer.toString(exam_id));
            ed.add(1, exam_name);
            ed.add(2, exam_code);
            ed.add(3, year);
            ed.add(4, semester);
            ed.add(5, from_date);
            ed.add(6, to_date);
            ed.add(7, details);

            ExamController ec = new ExamController();
            try {
                int stts = ec.updateExamInfo(ed);
                if(stts >= 0){
                    System.out.println("Record successfully updated");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EditExam.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }    
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new AddExam().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextField detailsTextField;
    private javax.swing.JLabel examCodeLabel;
    private javax.swing.JTextField examCodeText;
    private javax.swing.JLabel examNameLabel;
    private javax.swing.JTextField examNameText;
    private javax.swing.JComboBox<String> fdDayComboBx;
    private javax.swing.JComboBox<String> fdMonthComboBx;
    private javax.swing.JComboBox<String> fdYearComboBx;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JComboBox<String> semesterComboBx1;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JComboBox<String> tdDayComboBx;
    private javax.swing.JComboBox<String> tdMonthComboBx;
    private javax.swing.JComboBox<String> tdYearComboBx;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> yearComboBx;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}

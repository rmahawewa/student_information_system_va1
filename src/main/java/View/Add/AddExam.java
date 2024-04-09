/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import View.*;
import Controller.ExamController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import UserLibraries.GetTimes;
import java.util.HashMap;
import java.util.Map;
import UserLibraries.InputValidation;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;

/**
 *
 * @author HP
 */
public class AddExam extends javax.swing.JPanel{

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public AddExam() {
        initComponents();
        this.clearForm();
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
        submitButton = new javax.swing.JButton();
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
        semesterComboBx = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("Add Exam Information");

        examNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        examNameLabel.setText("Exam name:");

        toDateLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        toDateLabel.setText("To date:");

        detailsLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        examNameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        examNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examNameTextActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");

        tdDayComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        tdDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        tdYearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        tdYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        tdMonthComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        tdMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        examCodeText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        examCodeLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        examCodeLabel.setText("Exam code:");

        fdDayComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        fdDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        fdYearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        fdYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        fdMonthComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        fdMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        fromDateLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        fromDateLabel.setText("From date:");

        yearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        yearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        detailsTextField.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        detailsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsTextFieldActionPerformed(evt);
            }
        });

        yearLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        yearLabel.setText("Year:");

        semesterLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        semesterLabel.setText("Semester:");

        semesterComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        semesterComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester", "Third Semester", "Forth Semester", " " }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("*");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("*");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("*");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(semesterComboBx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                        .addComponent(tdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(topicLabel)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(examCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semesterComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDateLabel)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateLabel)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
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

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String name = examNameText.getText();
        String code = examCodeText.getText();
        String year = yearComboBx.getSelectedItem().toString();
        String semester = semesterComboBx.getSelectedItem().toString();
        String frm_dt_y = fdYearComboBx.getSelectedItem().toString();
        String frm_dt_m = GetTimes.getMonthNumber(fdMonthComboBx.getSelectedItem().toString());
        String frm_dt_d = fdDayComboBx.getSelectedItem().toString();
        String frm_date = frm_dt_y+"-"+frm_dt_m+"-"+frm_dt_d;
        System.out.println("from date:" + frm_date);        
        String to_dt_y = tdYearComboBx.getSelectedItem().toString();
        String to_dt_m = GetTimes.getMonthNumber(tdMonthComboBx.getSelectedItem().toString());
        String to_dt_d = tdDayComboBx.getSelectedItem().toString();
        String to_date = to_dt_y+"-"+to_dt_m+"-"+to_dt_d;
        System.out.println("to date:"+ to_date);
        String details = detailsTextField.getText();
        
        InputValidation iv = new InputValidation();
        int name_vald = iv.check_on_special_characters(name);
        int code_vald = iv.check_on_certain_characters(code);
        boolean whole_vald = (name_vald*code_vald)>0;
        
        
        if(!name.equals("") && !code.equals("") && !year.equals("") && !semester.equals("") && !frm_dt_y.equals("") && !frm_dt_m.equals("") && !frm_dt_d.equals("") && !to_dt_y.equals("") && !to_dt_m.equals("") && !to_dt_d.equals("") && whole_vald){
            List<String> lst = new ArrayList<String>();
            lst.add(0, name);
            lst.add(1, code);
            lst.add(2, year);
            lst.add(3, semester);
            lst.add(4, (frm_dt_y + "-" + frm_dt_m + "-" + frm_dt_d));
            lst.add(5, (to_dt_y + "-" + to_dt_m + "-" + to_dt_d));
            lst.add(6, details);
            ExamController ec = new ExamController();
            int i=1;
            try {
                i = ec.createExam(lst);
            } catch (SQLException ex) {
                Logger.getLogger(AddExam.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(i == 0){
                System.out.println("Exam record successfully created");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("Exam record successfully created.");
                rsm.setVisible(true);
                this.clearForm();
            }else{
                System.out.println("Failed to create the exam record");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to create the exam record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            System.out.println("Please fill all the fields correctly before proceed");
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    public void clearForm(){
                examNameText.setText("");
                examCodeText.setText("");
                yearComboBx.setSelectedItem(GetTimes.getCurrentYear());
                semesterComboBx.setSelectedIndex(0);
                fdYearComboBx.setSelectedItem(GetTimes.getCurrentYear());
                fdMonthComboBx.setSelectedItem(GetTimes.getCurrentMonth());
                fdDayComboBx.setSelectedItem(GetTimes.getCurrentDay());
                tdYearComboBx.setSelectedItem(GetTimes.getCurrentYear());
                tdMonthComboBx.setSelectedItem(GetTimes.getCurrentMonth());
                tdDayComboBx.setSelectedItem(GetTimes.getCurrentDay());
                detailsTextField.setText("");
    }
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> semesterComboBx;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> tdDayComboBx;
    private javax.swing.JComboBox<String> tdMonthComboBx;
    private javax.swing.JComboBox<String> tdYearComboBx;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JComboBox<String> yearComboBx;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}

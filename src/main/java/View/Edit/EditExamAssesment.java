/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Edit;

import View.Add.*;
import View.*;
import Controller.GradeController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controller.ExamAssesmentController;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;

/**
 *
 * @author HP
 */
public class EditExamAssesment extends javax.swing.JPanel {
    
    MainView mv;
    int examAssesmentId;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public EditExamAssesment() {
        initComponents();
    }
    
    public EditExamAssesment(MainView mf) {
        initComponents();
        mv = mf;
        try {
            this.load_grades();
        } catch (SQLException ex) {
            Logger.getLogger(EditExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void set_id(int id){
        this.examAssesmentId = id;
    }
    
    public void set_exam_name(String exam_name){
        this.examNameValueLabel.setText(exam_name);
    }
    
    public void set_assesment_name(String assesment){
        this.assesmentNameValueLabel.setText(assesment);
    }
    
    public void load_grades() throws SQLException{
        gradeComboBx.removeAllItems();
        GradeController gc = new GradeController();
        HashMap hm = gc.getAllGrades();
        hm.forEach((key,val) -> {
            HashMap<Integer,String> mp = (HashMap<Integer,String>) val;
            String grade_in_words = mp.get(1);
            this.gradeComboBx.addItem(grade_in_words);
        });
    }
    
    public void set_grade(String grade){
        gradeComboBx.setSelectedItem(grade);
    }
    
    public void set_level(String level){
        levelComboBx.setSelectedItem(level);
    }
    
    public void set_session(String session){
        int s = Integer.parseInt(session)-1;
        sessionComboBx.setSelectedIndex(s);
    }
    
    public void set_date(String y, String m, String d){
        this.yearComboBx.setSelectedItem(y);
        this.monthComboBx.setSelectedItem(m);
        this.dayComboBx.setSelectedItem(d);
    }
    
    public void set_time(String h, String m, String n){
        hoursComboBx.setSelectedItem(h);
        minutesComboBx.setSelectedItem(m);
        ampmComboBx.setSelectedItem(n);
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
        examLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        ampmComboBx = new javax.swing.JComboBox<>();
        hoursComboBx = new javax.swing.JComboBox<>();
        minutesComboBx = new javax.swing.JComboBox<>();
        assesmentLabel = new javax.swing.JLabel();
        dayComboBx = new javax.swing.JComboBox<>();
        yearComboBx = new javax.swing.JComboBox<>();
        monthComboBx = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        gradeComboBx = new javax.swing.JComboBox<>();
        gradeLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        levelComboBx = new javax.swing.JComboBox<>();
        examNameValueLabel = new javax.swing.JLabel();
        sessionLabel = new javax.swing.JLabel();
        sessionComboBx = new javax.swing.JComboBox<>();
        assesmentNameValueLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Edit Assesment in Exam Information");

        examLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examLabel.setText("Exam:");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timeLabel.setText("Time:");

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("Update");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        ampmComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ampmComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM", " " }));

        hoursComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoursComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        hoursComboBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursComboBxActionPerformed(evt);
            }
        });

        minutesComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        minutesComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        assesmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmentLabel.setText("Assesment:");

        dayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        monthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        monthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setText("Date:");

        gradeComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05", "Grade 06", "Grade 07", "Grade 08", "Grade 09", "Grade 10", "Grade 11" }));

        gradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeLabel.setText("Grade:");

        levelLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        levelLabel.setText("Level:");

        levelComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        levelComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regional Level", "District Level", "Provincial Level", "Whole Island Level", "International Level", " " }));

        examNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameValueLabel.setText("exam name");

        sessionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sessionLabel.setText("Session:");

        sessionComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sessionComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Session", "Second Session", "Third Session", "Forth Session", " " }));

        assesmentNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmentNameValueLabel.setText("assesment name");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(topicLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sessionLabel)
                                    .addComponent(dateLabel)
                                    .addComponent(timeLabel)
                                    .addComponent(gradeLabel)
                                    .addComponent(levelLabel))
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(levelComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sessionComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hoursComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(minutesComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(ampmComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assesmentLabel)
                                    .addComponent(examLabel))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(examNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(assesmentNameValueLabel))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(topicLabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examLabel)
                    .addComponent(examNameValueLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentLabel)
                    .addComponent(assesmentNameValueLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel)
                    .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(levelComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionLabel)
                    .addComponent(sessionComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(hoursComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutesComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampmComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hoursComboBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursComboBxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hoursComboBxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        int e_a_id = this.examAssesmentId;
        String grade = this.gradeComboBx.getSelectedItem().toString();
        GradeController gc = new GradeController();
        int grade_id=0;
        try {
            grade_id = gc.getGradeId(grade);
        } catch (SQLException ex) {
            Logger.getLogger(EditExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String level = this.levelComboBx.getSelectedItem().toString();
        String session = this.sessionComboBx.getSelectedItem().toString();
        String session_id = session.equals("First Session")?"1":(session.equals("Second Session")?"2":(session.equals("Third Session"))?"3":"4");
        String year = yearComboBx.getSelectedItem().toString();
        String month = monthComboBx.getSelectedItem().toString();
        String day = dayComboBx.getSelectedItem().toString();
        String hour = hoursComboBx.getSelectedItem().toString();
        String minute = minutesComboBx.getSelectedItem().toString();
        String ampm = ampmComboBx.getSelectedItem().toString();
        int hour_i = Integer.parseInt(hour);
        hour_i = ampm.equals("PM")?(hour_i + 12):hour_i;
        hour = Integer.toString(hour_i);
        String date_time = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":00";
        
        if(grade_id > 0){
            List<String> lst = new ArrayList<String>();
            lst.add(0, Integer.toString(e_a_id));
            lst.add(1, Integer.toString(grade_id));
            lst.add(2, level);
            lst.add(3, session_id);
            lst.add(4, date_time);
            ExamAssesmentController eac = new ExamAssesmentController();
            boolean stts = false;
            try {
                stts = eac.updateExamAssesment(lst);
            } catch (SQLException ex) {
                Logger.getLogger(EditExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(stts){
                System.out.println("Record updated successfully");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("Exam-Assesment record successfully updated.");
                rsm.setVisible(true);
            }else{
                System.out.println("Failed to update the record");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to update the Exam-Assesment record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(AddExamAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddExamAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddExamAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddExamAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddExamAssesment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ampmComboBx;
    private javax.swing.JLabel assesmentLabel;
    private javax.swing.JLabel assesmentNameValueLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dayComboBx;
    private javax.swing.JLabel examLabel;
    private javax.swing.JLabel examNameValueLabel;
    private javax.swing.JComboBox<String> gradeComboBx;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JComboBox<String> hoursComboBx;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JComboBox<String> levelComboBx;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JComboBox<String> minutesComboBx;
    private javax.swing.JComboBox<String> monthComboBx;
    private javax.swing.JComboBox<String> sessionComboBx;
    private javax.swing.JLabel sessionLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JComboBox<String> yearComboBx;
    // End of variables declaration//GEN-END:variables
}

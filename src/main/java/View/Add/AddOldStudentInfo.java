/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import Controller.OldStudentController;
import UserLibraries.GetTimes;
import View.MainView;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class AddOldStudentInfo extends javax.swing.JPanel {
    
    MainView mv;
    int student_id;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public AddOldStudentInfo() {
        initComponents();
    }
    
    public AddOldStudentInfo(MainView mf, int student_id) {
        initComponents();
        this.mv = mf;
        this.student_id = student_id;
        this.set_initial_date();
    }
    
    public void set_student_name(String name){
        this.oldStudentNameValueLabel.setText(name);
    }
    
    public void set_initial_date(){
        String year = GetTimes.getCurrentYear();
        String month = GetTimes.getCurrentMonth();
        String day = GetTimes.getCurrentDay();
        
        this.yearComboBx.setSelectedItem(year);
        this.monthComboBx.setSelectedItem(month);
        this.dayComboBx.setSelectedItem(day);
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
        leftDateLabel = new javax.swing.JLabel();
        reasonLabel = new javax.swing.JLabel();
        transferredDammaSchoolLabel = new javax.swing.JLabel();
        reasonText = new javax.swing.JTextField();
        transferredSchoolText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        dayComboBx = new javax.swing.JComboBox<>();
        yearComboBx = new javax.swing.JComboBox<>();
        monthComboBx = new javax.swing.JComboBox<>();
        oldStudentNameValueLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(595, 462));

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("Add Old Student Information");

        studentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameLabel.setText("Student name:");

        leftDateLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        leftDateLabel.setText("Left date:");

        reasonLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        reasonLabel.setText("Reason:");

        transferredDammaSchoolLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        transferredDammaSchoolLabel.setText("Transferred Damma School:");

        reasonText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        transferredSchoolText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        cancelButton.setText("Close");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        dayComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        yearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        monthComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        monthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        oldStudentNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        oldStudentNameValueLabel.setText("Old student name");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(topicLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reasonLabel)
                                    .addComponent(transferredDammaSchoolLabel)
                                    .addComponent(leftDateLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(transferredSchoolText)
                                    .addComponent(reasonText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentNameLabel)
                                .addGap(102, 102, 102)
                                .addComponent(oldStudentNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(topicLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(oldStudentNameValueLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(leftDateLabel)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reasonLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(transferredDammaSchoolLabel)
                                    .addComponent(transferredSchoolText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reasonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        int i = 0;
        
        String std_id = Integer.toString(this.student_id);
        String lftd_y = this.yearComboBx.getSelectedItem().toString();
        String lftd_m = this.monthComboBx.getSelectedItem().toString();
        String lftd_m_n = GetTimes.getMonthNumber(lftd_m);
        String lftd_d = this.dayComboBx.getSelectedItem().toString();
        String date_of_leave = lftd_y + "-" + lftd_m_n + "-" + lftd_d;
        String reason = this.reasonText.getText();
        String transferred_damma_school = this.transferredSchoolText.getText();
        
        if(!reason.equals("")){
            List<String> l = new ArrayList<String>();
            l.add(0, std_id);
            l.add(1, date_of_leave);
            l.add(2, reason);
            l.add(3, transferred_damma_school);
            
            OldStudentController osc = new OldStudentController();
            i = osc.add_old_student(l);
            
            if(i > 0){
                System.out.println("Old Student record successfully saved");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("Old Student record successfully saved.");
                rsm.setVisible(true);
            }else{
                System.out.println("Failed to save the Old Student record. Please try again");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to save the Old Student record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(AddOldStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddOldStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddOldStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddOldStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
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
//                new AddOldStudentInfo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> dayComboBx;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel leftDateLabel;
    private javax.swing.JComboBox<String> monthComboBx;
    private javax.swing.JLabel oldStudentNameValueLabel;
    private javax.swing.JLabel reasonLabel;
    private javax.swing.JTextField reasonText;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JLabel transferredDammaSchoolLabel;
    private javax.swing.JTextField transferredSchoolText;
    private javax.swing.JComboBox<String> yearComboBx;
    // End of variables declaration//GEN-END:variables
}

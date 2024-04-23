/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Edit;

import Controller.OldStudentController;
import View.MainView;
import UserLibraries.GetTimes;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class EditOldStudentInfo extends javax.swing.JPanel {
    
    MainView mv;
    int old_student_id;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public EditOldStudentInfo() {
        initComponents();
    }
    
    public EditOldStudentInfo(MainView mf, int id) {
        initComponents();
        this.mv = mf;
        this.old_student_id = id;
    }
    
    public void set_student_name(String student_name){
        this.studentNameValueLabel.setText(student_name);
    }
    
    public void set_left_date(String left_date){
        String[] date = left_date.split("-");
        String month = GetTimes.getMonthText(date[1]);
        this.yearComboBx.setSelectedItem(date[0]);
        this.monthComboBx.setSelectedItem(month);
        this.dayComboBx.setSelectedItem(date[2]);
    }
        
    public void set_reason(String reason){
        this.reasonText.setText(reason);
    }
            
    public void set_transferred_damma_school(String transferred_damma_school){
        this.transferredSchoolText.setText(transferred_damma_school);
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
        studentNameValueLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(595, 462));

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("ආදිශිෂ්‍ය තොරතුරු යාවත්කාලීන කිරීම");

        studentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameLabel.setText("ආදි සිසු/සිසුවියගේ නම:");

        leftDateLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        leftDateLabel.setText("ඉවත් වී ගිය දිනය:");

        reasonLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        reasonLabel.setText("හේතුව:");

        transferredDammaSchoolLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        transferredDammaSchoolLabel.setText("අලුතින් ඇතුලු වූ දහම් පාසලේ නම (ඇත්නම්):");

        reasonText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        transferredSchoolText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("යාවත්කාලීන කරන්න");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        cancelButton.setText("අවලංගු කරන්න");
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
        monthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));

        studentNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameValueLabel.setText("Student name value");

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
                                .addComponent(submitButton)
                                .addGap(82, 82, 82)
                                .addComponent(cancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reasonLabel)
                                    .addComponent(transferredDammaSchoolLabel)
                                    .addComponent(leftDateLabel)
                                    .addComponent(studentNameLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(transferredSchoolText)
                                            .addComponent(reasonText)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(studentNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(topicLabel)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameValueLabel))
                .addGap(29, 29, 29)
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
                        .addComponent(reasonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitButton))
                .addGap(108, 108, 108))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String year = this.yearComboBx.getSelectedItem().toString();
        String month = this.monthComboBx.getSelectedItem().toString();
        String month_number = GetTimes.getMonthNumber(month);
        String day = this.dayComboBx.getSelectedItem().toString();
        String left_date = year + "-" + month_number + "-" + day;
        String reason = reasonText.getText();
        String transferred_d_school = this.transferredSchoolText.getText();
        
        List<String> l = new ArrayList<String>();
        l.add(0, Integer.toString(this.old_student_id));
        l.add(1, left_date);
        l.add(2, reason);
        l.add(3, transferred_d_school);
        
        OldStudentController osc = new OldStudentController();
        int i = osc.update_old_student_info(l);
        if(i > 0){
            System.out.println("Old student information updated successfully");
            Result_SuccessMessage rsm = new Result_SuccessMessage();
            rsm.setMessage("ආදි ශිෂ්‍ය තොරතුරු සාර්ථක ලෙස මෙම දත්ත පද්ධතිය තුල යාවත්කාලීන විය");
            rsm.setVisible(true);
        }else{
            System.out.println("Failed to update old student information. Pleasr try again");
            Result_ErrorMessage rem = new Result_ErrorMessage();
            rem.setMessage("ආදි ශිෂ්‍ය තොරතුරු දත්ත පද්ධතිය තුල යාවත්කාලීන වීම අසාර්ථක බැවින් කරුණාකර නැවත උත්සහ කරන්න");
            rem.setVisible(true);
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
    private javax.swing.JLabel leftDateLabel;
    private javax.swing.JComboBox<String> monthComboBx;
    private javax.swing.JLabel reasonLabel;
    private javax.swing.JTextField reasonText;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameValueLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JLabel transferredDammaSchoolLabel;
    private javax.swing.JTextField transferredSchoolText;
    private javax.swing.JComboBox<String> yearComboBx;
    // End of variables declaration//GEN-END:variables
}

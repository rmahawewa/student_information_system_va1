/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Edit;

import Controller.StudentSchoolController;
import UserLibraries.GetTimes;
import View.MainView;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class EditStudentSchoolInfo extends javax.swing.JPanel {
    
    MainView mv;
    int stuent_school_id;

    /**
     * Creates new form StudentSchoolInfo
     */
    public EditStudentSchoolInfo() {
        initComponents();
    }
    
    public EditStudentSchoolInfo(MainView mf, int id) {
        initComponents();
        this.mv = mf;
        this.stuent_school_id = id;
    }
    
    public void set_student_name(String student_name){
        studentNameValueLabel.setText(student_name);
    }
    
    public void set_school_name(String school_name){
        schoolNameValueLabel.setText(school_name);
    }
        
    public void set_date_of_entarance(String doe){
        String[] doe_arr = doe.split("-");
        String month = GetTimes.getMonthText(doe_arr[1]);
        doeYearComboBx.setSelectedItem(doe_arr[0]);
        doeMonthComboBx.setSelectedItem(month);
        doeDateComboBx.setSelectedItem(doe_arr[2]);
    }
            
    public void set_is_currently_studing(String is_current_student){
        //String responce = is_current_student.equals("1")?"yes":"no";
        isCurrentlyStudingComboBx.setSelectedItem(is_current_student);
    }
                
    public void set_date_of_leave(String dol){
        if(!dol.equals("")){
            String[] doe_arr = dol.split("-");
            String month = GetTimes.getMonthText(doe_arr[1]);
            dolYearComboBx.setSelectedItem(doe_arr[0]);
            dolMonthComboBx.setSelectedItem(month);
            dolDayComboBx.setSelectedItem(doe_arr[2]);
        }        
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
        doeYearComboBx = new javax.swing.JComboBox<>();
        doeMonthComboBx = new javax.swing.JComboBox<>();
        doeDateComboBx = new javax.swing.JComboBox<>();
        isCurrentlyStudingComboBx = new javax.swing.JComboBox<>();
        dolYearComboBx = new javax.swing.JComboBox<>();
        dolDayComboBx = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        dolMonthComboBx = new javax.swing.JComboBox<>();
        studentNameValueLabel = new javax.swing.JLabel();
        schoolNameValueLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(595, 2147483647));
        setPreferredSize(new java.awt.Dimension(595, 758));

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("සිසු/සිසුවියන්ගේ පාසල් තොරතුරු යාවත්කාලීන කිරීම");

        studentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameLabel.setText("සිසු/සිසුවියගේ නම:");

        schoolNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        schoolNameLabel.setText("පාසලේ නම:");

        dateOfEntaranceLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dateOfEntaranceLabel.setText("ඇතුලත් වීමේ දිනය:");

        isCurrentlyStudingLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        isCurrentlyStudingLabel.setText("වර්ථමානයේ ඉගෙනුම ලබනවාද යන්න:");

        dateOfLeaveLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dateOfLeaveLabel.setText("පාසලෙන් ඉවත් වී ගිය දිනය:");

        doeYearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", " " }));

        doeMonthComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));

        doeDateComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeDateComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        isCurrentlyStudingComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        isCurrentlyStudingComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ඔව්", "නැත" }));

        dolYearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dolYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        dolDayComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dolDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        updateButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        updateButton.setText("යාවත්කාලීන කරන්න");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        closeButton.setText("අවලංගු කරන්න");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        dolMonthComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dolMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));

        studentNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameValueLabel.setText("student name");

        schoolNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        schoolNameValueLabel.setText("school name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfLeaveLabel)
                            .addComponent(isCurrentlyStudingLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(updateButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schoolNameLabel)
                            .addComponent(dateOfEntaranceLabel)
                            .addComponent(studentNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isCurrentlyStudingComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(doeYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(doeMonthComboBx, 0, 149, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(doeDateComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(studentNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(schoolNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dolYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(closeButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dolMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dolDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topicLabel)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(topicLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameValueLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schoolNameLabel)
                            .addComponent(schoolNameValueLabel))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(doeYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doeMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doeDateComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateOfEntaranceLabel)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isCurrentlyStudingComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isCurrentlyStudingLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dolYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfLeaveLabel))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(closeButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String doe_year = this.doeYearComboBx.getSelectedItem().toString();
        String doe_month = this.doeMonthComboBx.getSelectedItem().toString();
        String doe_mnth = GetTimes.getMonthNumber(doe_month);
        String doe_day = this.doeDateComboBx.getSelectedItem().toString();
        String doe = doe_year + "-" + doe_mnth + "-" + doe_day;
        String i_c_s = this.isCurrentlyStudingComboBx.getSelectedItem().toString();
        String yes_sinhala_translation = "ඔව්";
        String is_current_student = i_c_s.equals(yes_sinhala_translation)?"1":"0";
        String dol_year = this.dolYearComboBx.getSelectedItem().toString();
        String dol_month = this.dolMonthComboBx.getSelectedItem().toString();
        String dol_mnth = GetTimes.getMonthNumber(dol_month);
        String dol_day = this.dolDayComboBx.getSelectedItem().toString();
        String dol = dol_year + "-" + dol_mnth + "-" + dol_day;
        List<String> l = new ArrayList<String>();
        l.add(0, Integer.toString(this.stuent_school_id));
        l.add(1, doe);
        l.add(2, is_current_student);
        l.add(3, dol);
        StudentSchoolController ssc = new StudentSchoolController();
        int i = ssc.edit_student_school_info(l);
        if(i > 0){
            System.out.println("Student School record successfully updated");
            Result_SuccessMessage rsm = new Result_SuccessMessage();
            rsm.setMessage("සිසු/සිසුවියගේ පාසල පිලිබද තොරතුරු සාර්ථක ලෙස මෙම දත්ත පද්ධතිය තුල යාවත්කාලීන විය");
            rsm.setVisible(true);
        }else{
            System.out.println("Failed to update the Student School record. Please try again");
            Result_ErrorMessage rem = new Result_ErrorMessage();
            rem.setMessage("සිසු/සිසුවියගේ පාසල පිලිබද තොරතුරු දත්ත පද්ධතිය තුල යාවත්කාලීන වීම අසාර්ථක බැවින් කරුණාකර නැවත උත්සහ කරන්න");
            rem.setVisible(true);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.mv.close_tab();
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
    private javax.swing.JLabel dateOfEntaranceLabel;
    private javax.swing.JLabel dateOfLeaveLabel;
    private javax.swing.JComboBox<String> doeDateComboBx;
    private javax.swing.JComboBox<String> doeMonthComboBx;
    private javax.swing.JComboBox<String> doeYearComboBx;
    private javax.swing.JComboBox<String> dolDayComboBx;
    private javax.swing.JComboBox<String> dolMonthComboBx;
    private javax.swing.JComboBox<String> dolYearComboBx;
    private javax.swing.JComboBox<String> isCurrentlyStudingComboBx;
    private javax.swing.JLabel isCurrentlyStudingLabel;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JLabel schoolNameValueLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameValueLabel;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

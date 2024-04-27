/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import View.MainView;
import Controller.SchoolController;
import Controller.StudentSchoolController;
import java.util.HashMap;
import java.util.Map.Entry;
import UserLibraries.GetTimes;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class AddStudentSchoolInfo extends javax.swing.JPanel {
    
    MainView mv;
    int student_id;
    HashMap<Integer, String> hm = new HashMap<Integer,String>();

    /**
     * Creates new form StudentSchoolInfo
     */
    public AddStudentSchoolInfo() {
        initComponents();
    }
    
    public AddStudentSchoolInfo(MainView mf, int std_id) {
        initComponents();
        this.mv = mf;
        this.student_id = std_id;
        this.set_school_list();
    }
    
    public void set_student_name(String std_name){
        this.studentNameValueLabel.setText(std_name);
    }
    
    private void set_school_list(){
        SchoolController sc = new SchoolController();
        this.hm = sc.get_school_name_with_id();
        schoolNameComboBx.addItem("");
        if(!hm.isEmpty()){
            hm.forEach((key,value) -> {
                schoolNameComboBx.addItem(value);
            });
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
        schoolNameComboBx = new javax.swing.JComboBox<>();
        doeYearComboBx = new javax.swing.JComboBox<>();
        doeMonthComboBx = new javax.swing.JComboBox<>();
        doeDateComboBx = new javax.swing.JComboBox<>();
        isCurrentlyStudingComboBx = new javax.swing.JComboBox<>();
        dolYearComboBx = new javax.swing.JComboBox<>();
        dolDayComboBx = new javax.swing.JComboBox<>();
        submit_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dolMonthComboBx1 = new javax.swing.JComboBox<>();
        studentNameValueLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(595, 2147483647));
        setPreferredSize(new java.awt.Dimension(595, 758));

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("ශිෂ්‍ය පාසල් තොරතුරු ඇතුලත් කිරීම");

        studentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameLabel.setText("ශිෂ්‍යයාගේ නම:");

        schoolNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        schoolNameLabel.setText("පාසලේ නම:");

        dateOfEntaranceLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dateOfEntaranceLabel.setText("ඇතුලත් වූ දිනය:");

        isCurrentlyStudingLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        isCurrentlyStudingLabel.setText("වර්තමානයේ ඉගෙනුම ලබනවාද යන වග:");

        dateOfLeaveLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dateOfLeaveLabel.setText("පාසලෙන් ඉවත් වූ දිනය (ඇත්නම්):");

        schoolNameComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        doeYearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", " " }));

        doeMonthComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));

        doeDateComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeDateComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        doeDateComboBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doeDateComboBxActionPerformed(evt);
            }
        });

        isCurrentlyStudingComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        isCurrentlyStudingComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ඔව්", "නැහැ" }));

        dolYearComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dolYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        dolDayComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dolDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        submit_button.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submit_button.setText("යොමු කරන්න");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        close_button.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        close_button.setText("අවලංගු කරන්න");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "පාසලේ නම"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        dolMonthComboBx1.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dolMonthComboBx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));

        studentNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameValueLabel.setText("student name");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(659, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isCurrentlyStudingLabel)
                                    .addComponent(dateOfLeaveLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(isCurrentlyStudingComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dolYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dolMonthComboBx1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dolDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(close_button))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateOfEntaranceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(schoolNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(studentNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(schoolNameComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(studentNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(doeYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(doeMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(doeDateComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(topicLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameValueLabel)
                    .addComponent(studentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schoolNameComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schoolNameLabel)))
                    .addComponent(jLabel19))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doeYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doeMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfEntaranceLabel)
                    .addComponent(doeDateComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isCurrentlyStudingComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isCurrentlyStudingLabel))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfLeaveLabel)
                    .addComponent(dolYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolMonthComboBx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dolDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_button)
                    .addComponent(close_button))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        // TODO add your handling code here:
        this.mv.close_tab();
    }//GEN-LAST:event_close_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        String school_name = this.schoolNameComboBx.getSelectedItem().toString();
        int school_id = this.get_school_id(school_name);
        String doe_year = this.doeYearComboBx.getSelectedItem().toString();
        String doe_month = this.doeMonthComboBx.getSelectedItem().toString();
        String doe_month_number = GetTimes.getMonthNumber(doe_month);
        String doe_day = this.doeDateComboBx.getSelectedItem().toString();
        String doe = doe_year + "-" + doe_month_number + "-" + doe_day;
        String current_student = this.isCurrentlyStudingComboBx.getSelectedItem().toString();
        String yes_sinhala_translation = "ඔව්";
        int crnt_std = current_student.equals(yes_sinhala_translation)?1:0;
        String date_of_leave_year = this.dolYearComboBx.getSelectedItem().toString();
        String date_of_leave_month = this.dolMonthComboBx1.getSelectedItem().toString();
        String date_of_leave_month_number = GetTimes.getMonthNumber(date_of_leave_month);
        String date_of_leave_day = this.dolDayComboBx.getSelectedItem().toString();
        String date_of_leave = date_of_leave_year + "-" + date_of_leave_month_number + "-" + date_of_leave_day;
        
        List<String> l = new ArrayList<String>();
        if(school_id > 0){
            l.add(0, Integer.toString(school_id));
            l.add(1, doe);
            l.add(2, Integer.toString(crnt_std));
            l.add(3, date_of_leave);
            l.add(4, Integer.toString(student_id));
            
            StudentSchoolController ssc = new StudentSchoolController();
            int i = ssc.add_student_school_record(l);
            if(i > 0){
                System.out.println("Record successfully inserted");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("පාසල් තොරතුරු සාර්ථක ලෙස දත්ත පද්ධතියට සම්ප්‍රේෂණය විය");
                rsm.setVisible(true);
            }else{
                System.out.println("Failed to insert the record. Please try again");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("පාසල් තොරතුරු දත්ත පද්ධතියට එක් කිරීම අසාර්ථක බැවින් කරුණාකර නැවත උත්සහ කරන්න");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("කරුණාකර අනිවාර්ය කරුණු සියල්ල නිසි ලෙස යතුරුලියනය කර ඇති දැයි පරීක්ෂා කරන්න");
            fv.setVisible(true);
        }        
        
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void doeDateComboBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doeDateComboBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doeDateComboBxActionPerformed

    private int get_school_id(String school_name){
        for(Entry<Integer, String> entry: hm.entrySet()) {
            if(entry.getValue() == school_name) {
                return (entry.getKey());
            }            
        }
        return 0;
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
    private javax.swing.JButton close_button;
    private javax.swing.JLabel dateOfEntaranceLabel;
    private javax.swing.JLabel dateOfLeaveLabel;
    private javax.swing.JComboBox<String> doeDateComboBx;
    private javax.swing.JComboBox<String> doeMonthComboBx;
    private javax.swing.JComboBox<String> doeYearComboBx;
    private javax.swing.JComboBox<String> dolDayComboBx;
    private javax.swing.JComboBox<String> dolMonthComboBx1;
    private javax.swing.JComboBox<String> dolYearComboBx;
    private javax.swing.JComboBox<String> isCurrentlyStudingComboBx;
    private javax.swing.JLabel isCurrentlyStudingLabel;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> schoolNameComboBx;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameValueLabel;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

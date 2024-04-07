/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import UserLibraries.GetTimes;
import View.*;
import java.util.HashMap;
import java.util.Map;
import Controller.ExamGradeController;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controller.GradeController;
import Controller.StudentGradeExamController;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class AddGradeExam extends javax.swing.JPanel {

    private MainView mv;
    private int exam_id;
    
    /**
     * Creates new form AddStudentSchoolInfo
     */
//    public AddGradeExam() {
//        initComponents();
//    }
    
    public AddGradeExam(MainView mf, int exm_id) {
        initComponents();
        this.mv = mf;
        this.exam_id = exm_id;
        this.loadGrades();
        this.clearForm();
        this.loadTable();
        System.out.println("Add grade exam 12345");
    }
    
//    public void setExamId(int id){
//        this.exam_id = id;
//    }
    
    public void setExamName(String name){
        this.examNameValueLabel.setText(name);
    }
    
    public void loadGrades(){
        GradeController gc = new GradeController();
        try {
            HashMap<Integer, Map<Integer,String>> hm = gc.getAllGrades();
            if(!hm.isEmpty()){
                hm.forEach((key,value) -> {
                    gradeComboBx.addItem(value.get(1));
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadTable(){
        HashMap<Integer, Map<Integer,String>> e_grade_info = new HashMap<Integer, Map<Integer,String>>();
        ExamGradeController egc = new ExamGradeController();
        e_grade_info = egc.loadExamGradeInfo(exam_id);
        System.out.println("HM info: " + e_grade_info + ", exam id: " + exam_id);
        clearTable(jTable1);
        createTable(e_grade_info, jTable1);
    }
    
    public void clearTable(JTable tbl){
    
        DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
        int row_count = dtm.getRowCount();
        
        for(int i = row_count-1;i>=0;i--){
            dtm.removeRow(i);
        }
    
    }
    
    public void createTable(HashMap hm, JTable tbl){
        if(!hm.isEmpty()){
            hm.forEach((key,value) -> {
                HashMap<Integer,String> hsh = (HashMap) value;
                //System.out.println("hashmap: "+hsh);
                int hlength = hsh.size();
                String[] tbl_data=new String[hlength];
                hsh.forEach((k,v) -> {
                    tbl_data[k] = v;
                    //System.out.println("The grade value: " + v);
                });
                DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
                dtm.addRow(tbl_data);
            });
        }
    }
    
    public void clearForm(){
                gradeComboBx.setSelectedIndex(0);
                sessionComboBx.setSelectedIndex(0);
                yearComboBx.setSelectedItem(GetTimes.getCurrentYear());
                monthComboBx.setSelectedItem(GetTimes.getCurrentMonth());
                dayComboBx.setSelectedItem(GetTimes.getCurrentDay());
                hoursComboBx.setSelectedIndex(0);
                minutesComboBx.setSelectedIndex(0);
                ampmComboBx.setSelectedIndex(0);
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
        dayComboBx = new javax.swing.JComboBox<>();
        yearComboBx = new javax.swing.JComboBox<>();
        monthComboBx = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        gradeComboBx = new javax.swing.JComboBox<>();
        gradeLabel = new javax.swing.JLabel();
        examNameValueLabel = new javax.swing.JLabel();
        sessionLabel = new javax.swing.JLabel();
        sessionComboBx = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Add Exam Grade Information");

        examLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examLabel.setText("Exam:");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timeLabel.setText("Time:");

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("Submit");
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

        minutesComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        minutesComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        dayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        monthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        monthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setText("Date:");

        gradeComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        gradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeLabel.setText("Grade:");

        examNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameValueLabel.setText("exam name      ");

        sessionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sessionLabel.setText("Session:");

        sessionComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sessionComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Session", "Second Session", "Third Session", "Forth Session" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade", "Session", "Date and Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gradeLabel)
                                .addGap(139, 139, 139)
                                .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(examLabel)
                                .addGap(143, 143, 143)
                                .addComponent(examNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sessionLabel)
                                        .addComponent(dateLabel)
                                        .addComponent(timeLabel))
                                    .addGap(129, 129, 129)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sessionComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hoursComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(minutesComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(ampmComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(topicLabel)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(topicLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examLabel)
                    .addComponent(examNameValueLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel)
                    .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionLabel)
                    .addComponent(sessionComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(yearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(hoursComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutesComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampmComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String grade = gradeComboBx.getSelectedItem().toString();
        GradeController gc = new GradeController();
        int grade_id = 0;
        try {
            grade_id = gc.getGradeId(grade);
        } catch (SQLException ex) {
            Logger.getLogger(AddGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        int session = getSessionId(sessionComboBx.getSelectedItem().toString());
        String d_year = yearComboBx.getSelectedItem().toString();
        GetTimes gt = new GetTimes();
        String d_month = gt.getMonthNumber(monthComboBx.getSelectedItem().toString());
        String d_day = dayComboBx.getSelectedItem().toString();
        String hour = hoursComboBx.getSelectedItem().toString();
        String minute = minutesComboBx.getSelectedItem().toString();
        String ampm = ampmComboBx.getSelectedItem().toString();
        if(ampm.equals("PM")){
            int i_hour = Integer.parseInt(hour);
            i_hour = i_hour + 12;
            hour = Integer.toString(i_hour);
        }
        String date_time = d_year + "-" + d_month + "-" + d_day + " " + hour + ":" + minute + ":00";
        
        if(grade_id > 0){
            List<String> egr = new ArrayList<String>();
            egr.add(0, Integer.toString(exam_id));
            egr.add(1, Integer.toString(grade_id));
            egr.add(2, Integer.toString(session));
            egr.add(3, date_time);

            ExamGradeController egc = new ExamGradeController();
            try {
                int stts = egc.addGradeExam(egr);
                System.out.println("the grade exam status is: " + stts);
                if(stts > -1){
                    System.out.println("Grade - Exam record successfully created");
                    Result_SuccessMessage rsm = new Result_SuccessMessage();
                    rsm.setMessage("Grade - Exam record successfully created.");
                    rsm.setVisible(true);
                    clearForm();
                    loadTable();
                    StudentGradeExamController sgec = new StudentGradeExamController();
                    try{
                        sgec.add_students_to_exam_grade(stts, grade_id, d_year);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }else{
                    System.out.println("Faild to create the record.");
                    Result_ErrorMessage rem = new Result_ErrorMessage();
                    rem.setMessage("Faild to create the record. Please try again.");
                    rem.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddGradeExam.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Faild to create the record");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Faild to create the record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }      
        
    }//GEN-LAST:event_submitButtonActionPerformed

    public int getSessionId(String session){
        int sid = 1;        
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("First Session", 1);
        hm.put("Second Session", 2);
        hm.put("Third Session", 3);
        hm.put("Forth Session", 4);
        
        try{
            sid = hm.get(session);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return sid;
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
//            java.util.logging.Logger.getLogger(AddGradeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddGradeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddGradeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddGradeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddGradeExam().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ampmComboBx;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dayComboBx;
    private javax.swing.JLabel examLabel;
    private javax.swing.JLabel examNameValueLabel;
    private javax.swing.JComboBox<String> gradeComboBx;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JComboBox<String> hoursComboBx;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
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

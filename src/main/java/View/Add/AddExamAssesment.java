/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import Controller.AssesmentController;
import Controller.ExamAssesmentController;
import Controller.ExamGradeController;
import Controller.GradeController;
import UserLibraries.GetTimes;
import View.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import UserLibraries.GetTimes;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AddExamAssesment extends javax.swing.JPanel {

    private MainView mv;
    private int exam_id;
    private int assesment_id=0;
    
    /**
     * Creates new form AddStudentSchoolInfo
     */
    public AddExamAssesment() {
        initComponents();
    }
    
    public AddExamAssesment(MainView mf, int xm_id) {
        initComponents();
        this.exam_id = xm_id;
        this.mv = mf;
        this.loadGrades();
        this.clearForm();
        try {
            this.loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(AddExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            Logger.getLogger(AddExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void loadTable() throws SQLException{
        HashMap<Integer, Map<Integer,String>> e_a_info = new HashMap<Integer, Map<Integer,String>>();
        ExamAssesmentController eac = new ExamAssesmentController();
        e_a_info = eac.loadExamAssesmentInfoForId(exam_id);
        System.out.println("HM info: " + e_a_info + ", exam id: " + exam_id);
        clearTable(jTable1);
        createTable(e_a_info, jTable1);
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
                assesmentNameText.setText("");
                //assesmentNamesList.setVisible(false);
                //assesmentNameListScrollPane.setVisible(false);
                gradeComboBx.setSelectedIndex(0);
                levelComboBx.setSelectedIndex(0);
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

        jLabel7 = new javax.swing.JLabel();
        topicLabel = new javax.swing.JLabel();
        examLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        ampmComboBx = new javax.swing.JComboBox<>();
        hoursComboBx = new javax.swing.JComboBox<>();
        minutesComboBx = new javax.swing.JComboBox<>();
        assesmentNameText = new javax.swing.JTextField();
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
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        assesmentNameListScrollPane = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        assesmentNamesList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*");

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Add Assesment in Exam Information");

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

        ampmComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ampmComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM", " " }));

        hoursComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoursComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        minutesComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        minutesComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", " " }));

        assesmentNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmentNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                assesmentNameTextKeyReleased(evt);
            }
        });

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
        sessionComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Session", "Second Session", "Third Session", "Forth Session" }));

        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Assesment", "Grade", "Level", "Session"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        assesmentNamesList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmentNamesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assesmentNamesListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(assesmentNamesList);

        assesmentNameListScrollPane.setViewportView(jScrollPane1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("*");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("*");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(topicLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assesmentLabel)
                                    .addComponent(examLabel))
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assesmentNameListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(examNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(assesmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentLabel)
                    .addComponent(assesmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assesmentNameListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel)
                    .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel)
                    .addComponent(levelComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
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
                    .addComponent(jLabel10))
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
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel dlm = new DefaultListModel();
    private void assesmentNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_assesmentNameTextKeyReleased
        // TODO add your handling code here:
        if(!assesmentNameText.isEditable()){
            return;
        }
        dlm.removeAllElements();
        
        String text = assesmentNameText.getText();
        AssesmentController ac = new AssesmentController();
        try {
            List<String> lst = ac.getAssesmentByText(text);
            System.out.println("Assesment list: " + lst);
            if(!lst.isEmpty() && lst!=null){
                for(String t : lst){
                    dlm.addElement(t);
                }
            }else{
                   dlm.addElement("- No results found -");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
            dlm.addElement("- No results found -");
        }
        assesmentNamesList.setModel(dlm);
        assesmentNameListScrollPane.setVisible(true);
        assesmentNamesList.setVisible(true);        
        
    }//GEN-LAST:event_assesmentNameTextKeyReleased

    private void assesmentNamesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assesmentNamesListMouseClicked
        // TODO add your handling code here:
        JList lst = (JList) evt.getSource();
        if(evt.getClickCount() >= 1){
            int index = lst.locationToIndex(evt.getPoint());
            if(index >= 0){
                Object o = lst.getModel().getElementAt(index);
                String name = o.toString();
                assesmentNameText.setText(name);
                assesmentNameText.setEditable(false);
                ((DefaultListModel)lst.getModel()).clear();
                setAssesmentId(name);                
            }
        }
    }//GEN-LAST:event_assesmentNamesListMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        assesmentNameText.setEditable(true);
        assesmentNameText.setText("");
        ((DefaultListModel)assesmentNamesList.getModel()).clear();
        this.assesment_id = 0;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        int stts = -1;
        int exam_id = this.exam_id;
        int assesment_id = this.assesment_id;
        String grade = gradeComboBx.getSelectedItem().toString();
        int grade_id = 0;
        GradeController gc = new GradeController();
        try {
            grade_id = gc.getGradeId(grade);
        } catch (SQLException ex) {
            Logger.getLogger(AddGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        String level = levelComboBx.getSelectedItem().toString();
        int session = getSessionId(sessionComboBx.getSelectedItem().toString());
        String year = yearComboBx.getSelectedItem().toString();
        String month = monthComboBx.getSelectedItem().toString();
        String day = dayComboBx.getSelectedItem().toString();
        String hour = hoursComboBx.getSelectedItem().toString();
        String minute = minutesComboBx.getSelectedItem().toString();
        String ampm = ampmComboBx.getSelectedItem().toString();
        String month_in_number = GetTimes.getMonthNumber(month);
        if(ampm.equals("PM")){
            int i_hour = Integer.parseInt(hour)+12;
            hour = Integer.toString(i_hour);
        }
        String date_time = year+"-"+month+"-"+day+" "+hour+":"+minute+":00";
        
        if(assesment_id > 0 && grade_id > 0){
            try {
                ExamAssesmentController eac = new ExamAssesmentController();
                List<String> lst = new ArrayList<String>();
                lst.add(0, Integer.toString(exam_id));
                lst.add(1, Integer.toString(assesment_id));
                lst.add(Integer.toString(session));
                lst.add(3, date_time);
                lst.add(4,Integer.toString(grade_id));
                lst.add(level);            
                stts = eac.addRecord(lst);
            } catch (SQLException ex) {
                Logger.getLogger(AddExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }
        if(stts >= 0){
            System.out.println("Exam-Assesment record successfully added.");
            try {
                loadTable();
            } catch (SQLException ex) {
                Logger.getLogger(AddExamAssesment.class.getName()).log(Level.SEVERE, null, ex);
            }
            Result_SuccessMessage rsm = new Result_SuccessMessage();
            rsm.setMessage("Exam-Assesment record successfully added.");
            rsm.setVisible(true);
        }else{
            System.out.println("Failed to add Exam-Assesment record");
            Result_ErrorMessage rem = new Result_ErrorMessage();
            rem.setMessage("Failed to add Exam-Assesment record. Please try again.");
            rem.setVisible(true);
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
    
    public void setAssesmentId(String text){
        String[] values = text.split("-");
        this.assesment_id = Integer.parseInt(values[0]);
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
    private javax.swing.JScrollPane assesmentNameListScrollPane;
    private javax.swing.JTextField assesmentNameText;
    private javax.swing.JList<String> assesmentNamesList;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dayComboBx;
    private javax.swing.JLabel examLabel;
    private javax.swing.JLabel examNameValueLabel;
    private javax.swing.JComboBox<String> gradeComboBx;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JComboBox<String> hoursComboBx;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
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

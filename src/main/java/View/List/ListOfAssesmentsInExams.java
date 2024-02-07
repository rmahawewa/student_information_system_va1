/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;

import View.MainView;
import javax.swing.JTable;
import Controller.ExamAssesmentController;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ListOfAssesmentsInExams extends javax.swing.JPanel {
    
    private MainView mv;

    /**
     * Creates new form ListOfAssesmentsInExams
     */
    public ListOfAssesmentsInExams() {
        initComponents();
    }
    
    public ListOfAssesmentsInExams(MainView mf) {
        initComponents();
        this.mv = mf;
        this.load_table("", "", "", "", "", assesmtsInExamTable);
    }
    
    private void load_table(String exam_name, String asmt_name, String date, String time, String level, JTable tble){
        ExamAssesmentController eac = new ExamAssesmentController();
        HashMap<Integer, Map<Integer,String>> mp = eac.getExamAssesmentInfo(exam_name, asmt_name, date, time, level);
        System.out.println(mp);
        this.clear_table(tble);
        this.create_table(tble, mp);
    }
    
    private void clear_table(JTable table){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int row_count = dtm.getRowCount();
        
        for(int i = row_count-1; i>=0; i--){
            dtm.removeRow(i);
        }
    }
    
    private void create_table(JTable table, HashMap hm){
        if(!hm.isEmpty()){
            hm.forEach((key,value) -> {
                HashMap<Integer, String> mp = (HashMap<Integer, String>) value;
                int hlngth = mp.size();
                String[] tbl_data = new String[hlngth];
                mp.forEach((k,v) -> {
                    tbl_data[k] = v;
                });
                DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                dtm.addRow(tbl_data);
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
        examNameLabel = new javax.swing.JLabel();
        assesmentNameLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        level_label = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addStudentButton = new javax.swing.JButton();
        examNameText = new javax.swing.JTextField();
        assignmentNameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        assesmtsInExamTable = new javax.swing.JTable();
        hoursComboBx = new javax.swing.JComboBox<>();
        minutesComboBx = new javax.swing.JComboBox<>();
        ampmComboBx = new javax.swing.JComboBox<>();
        dateYearComboBx = new javax.swing.JComboBox<>();
        dateMonthComboBx = new javax.swing.JComboBox<>();
        dateDayComboBx = new javax.swing.JComboBox<>();
        levelComboBx = new javax.swing.JComboBox<>();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Assesments in Exams");

        examNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examNameLabel.setText("Exam name:");

        assesmentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmentNameLabel.setText("Assesment name:");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setText("Date:");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timeLabel.setText("Time:");

        level_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level_label.setText("Level:");

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("Search");

        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearButton.setText("Clear");

        viewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewButton.setText("View");

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setText("Edit");

        addStudentButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addStudentButton.setText("Add Student");

        examNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        assignmentNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        assesmtsInExamTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmtsInExamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exam", "Assignment", "Level", "Date Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(assesmtsInExamTable);

        hoursComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoursComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        minutesComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        minutesComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        ampmComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ampmComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        ampmComboBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampmComboBxActionPerformed(evt);
            }
        });

        dateYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        dateMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        dateMonthComboBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateMonthComboBxActionPerformed(evt);
            }
        });

        dateDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        levelComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        levelComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regional Level", "District Level", "Provincial Level", "Whole Island Level", "International Level" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(topicLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(level_label)
                                    .addComponent(assesmentNameLabel)
                                    .addComponent(examNameLabel)
                                    .addComponent(dateLabel)
                                    .addComponent(timeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(assignmentNameText)
                                    .addComponent(examNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hoursComboBx, 0, 100, Short.MAX_VALUE)
                                            .addComponent(dateYearComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(minutesComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(ampmComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(dateMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(dateDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(levelComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(topicLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examNameLabel)
                    .addComponent(examNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentNameLabel)
                    .addComponent(assignmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel)
                            .addComponent(dateYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeLabel)
                            .addComponent(hoursComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minutesComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ampmComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level_label)
                    .addComponent(levelComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(editButton)
                    .addComponent(addStudentButton))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ampmComboBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampmComboBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ampmComboBxActionPerformed

    private void dateMonthComboBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateMonthComboBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMonthComboBxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JComboBox<String> ampmComboBx;
    private javax.swing.JLabel assesmentNameLabel;
    private javax.swing.JTable assesmtsInExamTable;
    private javax.swing.JTextField assignmentNameText;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> dateDayComboBx;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dateMonthComboBx;
    private javax.swing.JComboBox<String> dateYearComboBx;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel examNameLabel;
    private javax.swing.JTextField examNameText;
    private javax.swing.JComboBox<String> hoursComboBx;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> levelComboBx;
    private javax.swing.JLabel level_label;
    private javax.swing.JComboBox<String> minutesComboBx;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

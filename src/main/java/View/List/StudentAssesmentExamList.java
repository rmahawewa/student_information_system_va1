/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;

import Controller.StudentAssesmentExamController;
import Controller.StudentGradeExamController;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import View.MainView;
import View.IndividualView.ViewStudentAssesmentExam;
import View.Edit.EditStudentAssesmentExam;

/**
 *
 * @author HP
 */
public class StudentAssesmentExamList extends javax.swing.JPanel {
    
    MainView mv;

    /**
     * Creates new form StudentGradeExamList
     */
    public StudentAssesmentExamList() {
        initComponents();
    }
    
    public StudentAssesmentExamList(MainView mf) {
        initComponents();
        this.mv = mf;
        try {
            this.loadTable("", "", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExamList.class.getName()).log(Level.SEVERE, null, ex);
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
        examLabel = new javax.swing.JLabel();
        assesmentLabel = new javax.swing.JLabel();
        studentNameText = new javax.swing.JTextField();
        examText = new javax.swing.JTextField();
        assesmentText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentAssesmentExamTable = new javax.swing.JTable();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Students in Assesments");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel.setText("Student Name:");

        examLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examLabel.setText("Exam:");

        assesmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        assesmentLabel.setText("Assesment:");

        studentNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        examText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        assesmentText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        studentAssesmentExamTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentAssesmentExamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student", "Assesment", "Exam", "Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(studentAssesmentExamTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(examLabel)
                            .addComponent(studentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assesmentLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(examText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assesmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(topicLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(topicLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assesmentLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(editButton))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String student_name = studentNameText.getText();
        String exam = examText.getText();
        String assesment = assesmentText.getText();
        
        try {
            this.loadTable(student_name, exam, assesment);
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExamList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.studentNameText.setText("");
        this.examText.setText("");
        this.assesmentText.setText("");
        try {
            this.loadTable("", "", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentAssesmentExamList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int row = studentAssesmentExamTable.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) studentAssesmentExamTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String student = dtm.getValueAt(row, 1).toString();
            String assesment = dtm.getValueAt(row, 2).toString();
            String exam = dtm.getValueAt(row, 3).toString();

            StudentAssesmentExamController sgec = new StudentAssesmentExamController();
            HashMap<Integer,String> hm = new HashMap<Integer,String>();
            try {
                hm = sgec.get_info_by_id(id);
                //System.out.println(hm);
            } catch (SQLException ex) {
                Logger.getLogger(StudentAssesmentExamList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ViewStudentAssesmentExam form = new ViewStudentAssesmentExam(mv);
            form.set_student_name(student);
            form.set_exam(exam);
            form.set_assignment(assesment);
            form.set_marks(hm.get(0));
            form.set_remarks(hm.get(1));
            form.set_description(hm.get(2));
            mv.add_new_component(form, "Student Assesment Exam info");
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int row = studentAssesmentExamTable.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) studentAssesmentExamTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String student = dtm.getValueAt(row, 1).toString();
            String assesment = dtm.getValueAt(row, 2).toString();
            String exam = dtm.getValueAt(row, 3).toString();

            StudentAssesmentExamController sgec = new StudentAssesmentExamController();
            HashMap<Integer,String> hm = new HashMap<Integer,String>();
            try {
                hm = sgec.get_info_by_id(id);
                //System.out.println(hm);
            } catch (SQLException ex) {
                Logger.getLogger(StudentAssesmentExamList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            EditStudentAssesmentExam form = new EditStudentAssesmentExam(mv,id);
            form.set_student_name(student);
            form.set_exam(exam);
            form.set_assignment(assesment);
            form.set_marks(hm.get(0));
            form.set_remarks(hm.get(1));
            form.set_description(hm.get(2));
            mv.add_new_component(form, "Update Student Assesment Exam");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    public void loadTable(String student_name, String exam, String assesment) throws SQLException{
        try{
            this.clearTable(studentAssesmentExamTable);
            StudentAssesmentExamController saec = new StudentAssesmentExamController();
            HashMap<Integer, Map<Integer,String>> hm = saec.get_list_of_sae_details(student_name, exam, assesment);
            this.createTable(hm, studentAssesmentExamTable);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assesmentLabel;
    private javax.swing.JTextField assesmentText;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel examLabel;
    private javax.swing.JTextField examText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable studentAssesmentExamTable;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameText;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;

import Controller.ExamGradeController;
import Controller.GradeController;
import View.Add.AddGradeExam;
import View.MainView;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.StudentGradeExamController;
import View.IndividualView.ViewIndividualGradeExam;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import View.IndividualView.ViewStudentGradeExam;
import View.Edit.EditStudentGradeExam;

/**
 *
 * @author HP
 */
public class StudentGradeExamList extends javax.swing.JPanel {
    
    MainView mv;

    /**
     * Creates new form StudentGradeExamList
     */
    public StudentGradeExamList() {
        initComponents();
    }
    
    public StudentGradeExamList(MainView mf) {
        initComponents();
        this.mv = mf;
        this.loadGrades();
        try {
            this.loadTable("", "", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExamList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadGrades(){
        GradeController gc = new GradeController();
        try {
            gradeComboBx.addItem("");
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
        gradeLabel = new javax.swing.JLabel();
        studentNameText = new javax.swing.JTextField();
        examText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentGradeExamTable = new javax.swing.JTable();
        gradeComboBx = new javax.swing.JComboBox<>();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Students in Exams");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel.setText("Student Name:");

        examLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examLabel.setText("Exam:");

        gradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeLabel.setText("Grade:");

        studentNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        examText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        studentGradeExamTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentGradeExamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student", "Grade", "Exam", "Marks"
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
        jScrollPane1.setViewportView(studentGradeExamTable);

        gradeComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(topicLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(examLabel)
                            .addComponent(studentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(gradeComboBx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(examText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(0, 37, Short.MAX_VALUE))
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
                    .addComponent(gradeLabel)
                    .addComponent(gradeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(editButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String student_name = studentNameText.getText();
        String exam = examText.getText();
        String grade = gradeComboBx.getSelectedItem().toString();
        
        try {
            this.loadTable(student_name, exam, grade);
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExamList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        studentNameText.setText("");
        examText.setText("");
        gradeComboBx.setSelectedIndex(0);
        try {
            this.loadTable("", "", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentGradeExamList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int row = studentGradeExamTable.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) studentGradeExamTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String student = dtm.getValueAt(row, 1).toString();
            String grade = dtm.getValueAt(row, 2).toString();
            String exam = dtm.getValueAt(row, 3).toString();

            StudentGradeExamController sgec = new StudentGradeExamController();
            HashMap<Integer,String> hm = sgec.get_info_by_id(id);
            //System.out.println(hm);
            
            ViewStudentGradeExam form = new ViewStudentGradeExam(mv);
            form.set_student_name(student);
            form.set_exam(exam);
            form.set_grade(grade);
            form.set_marks(hm.get(0));
            form.set_remarks(hm.get(1));
            form.set_description(hm.get(2));
            mv.add_new_component(form, "Student Grade Exam info");
        }        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int row = studentGradeExamTable.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) studentGradeExamTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String student = dtm.getValueAt(row, 1).toString();
            String grade = dtm.getValueAt(row, 2).toString();
            String exam = dtm.getValueAt(row, 3).toString();

            StudentGradeExamController sgec = new StudentGradeExamController();
            HashMap<Integer,String> hm = sgec.get_info_by_id(id);
            //System.out.println(hm);
            
            EditStudentGradeExam form = new EditStudentGradeExam(mv,id);
            form.set_student_name(student);
            form.set_exam(exam);
            form.set_grade(grade);
            form.set_marks(hm.get(0));
            form.set_remarks(hm.get(1));
            form.set_description(hm.get(2));
            mv.add_new_component(form, "Update Student Grade Exam");
        }        
    }//GEN-LAST:event_editButtonActionPerformed

    public void loadTable(String student, String exam, String grade) throws SQLException{
        try{
            this.clearTable(studentGradeExamTable);
            StudentGradeExamController sgec = new StudentGradeExamController();
            HashMap<Integer, Map<Integer, String>> hm = sgec.filtered_Student_grade_exam_list(student, exam, grade);
            this.createTable(hm, studentGradeExamTable);
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
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel examLabel;
    private javax.swing.JTextField examText;
    private javax.swing.JComboBox<String> gradeComboBx;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable studentGradeExamTable;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameText;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

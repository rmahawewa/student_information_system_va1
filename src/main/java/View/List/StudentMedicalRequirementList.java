/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;
import Controller.ExamController;
import Controller.StudentMedicalInformationController;
import View.Edit.EditStudentMedicalRequirement;
import View.IndividualView.ViewExam;
import View.IndividualView.ViewStudentMedicalRequirement;
import View.MainView;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class StudentMedicalRequirementList extends javax.swing.JPanel {
    
    MainView mv;
    

    /**
     * Creates new form AssesmentList
     */
    public StudentMedicalRequirementList() {
        initComponents();
    }
    
    public StudentMedicalRequirementList(MainView mf) {
        initComponents();
        this.mv = mf;
        try {
            this.loadTable("", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirementList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadTable(String student_name, String medical_status) throws SQLException{
        try{
            this.clearTable(studentMedicalStatusListTable);
            StudentMedicalInformationController smic = new StudentMedicalInformationController();
            HashMap<Integer, Map<Integer,String>> hm = smic.get_data_list(student_name, medical_status);
            this.createTable(hm, studentMedicalStatusListTable);
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topicLabel = new javax.swing.JLabel();
        assesmentNameLabel = new javax.swing.JLabel();
        assesmentCodeLabel = new javax.swing.JLabel();
        studentNameText = new javax.swing.JTextField();
        medicalStatusText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentMedicalStatusListTable = new javax.swing.JTable();

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("ශිෂ්‍ය විශේෂ සෞඛ්‍ය අවශ්‍යතා පිලිබද සටහන ");

        assesmentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentNameLabel.setText("සිසු/සිසුවියගේ නම:");

        assesmentCodeLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentCodeLabel.setText("විශේෂ සෞඛ්‍ය අවශ්‍යතාවය:");

        studentNameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        medicalStatusText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        searchButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        searchButton.setText("සොයන්න");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        clearButton.setText("මකා දමන්න");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        viewButton.setText("තව දුරටත් විස්තර පෙන්වන්න");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        editButton.setText("අදාල තොරතුරු යාවත්කාලීන කරන්න");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        studentMedicalStatusListTable.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentMedicalStatusListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "සිසුවාගේ/සිසුවියගේ නම", "රෝගී තත්වය", "රෝගය හදුනාගත් දිනය", "ප්‍රතිකාර ලබාගත් පලමු දිනය", "ප්‍රතිකාර ලබාගත් අවසන් දිනය", "පද්ධති කේතය"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentMedicalStatusListTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(medicalStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(assesmentCodeLabel)
                                            .addComponent(assesmentNameLabel))
                                        .addGap(26, 26, 26)
                                        .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(topicLabel)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(topicLabel)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentNameLabel)
                    .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentCodeLabel)
                    .addComponent(medicalStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(viewButton))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            // TODO add your handling code here:
            String student = studentNameText.getText();
            String medrq = medicalStatusText.getText();
            
            this.loadTable(student, medrq);
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirementList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        try {
            // TODO add your handling code here:
            studentNameText.setText("");
            medicalStatusText.setText("");
            this.loadTable("", "");
        } catch (SQLException ex) {
            Logger.getLogger(StudentMedicalRequirementList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int row = studentMedicalStatusListTable.getSelectedRow();
        System.out.println("selected row: " + row);
        if(row>-1){
            try {
                DefaultTableModel dtm = (DefaultTableModel) studentMedicalStatusListTable.getModel();
                int id = Integer.parseInt(dtm.getValueAt(row, 5).toString());
                String student_name = dtm.getValueAt(row, 0).toString();
                String medical_status = dtm.getValueAt(row, 1).toString();
                String first_date_of_diagnose = dtm.getValueAt(row, 2).toString();
                String first_date_of_getting_treatment = dtm.getValueAt(row, 3).toString();
                String last_date_of_diagnose = dtm.getValueAt(row, 4).toString();
                StudentMedicalInformationController ec = new StudentMedicalInformationController();
                String details = "";
                details = ec.get_std_details_by_id(id);
                ViewStudentMedicalRequirement vsmr = new ViewStudentMedicalRequirement(mv);
                vsmr.set_student_name(student_name);
                vsmr.set_medical_requirement(medical_status);
                vsmr.set_first_date_of_diagnose(first_date_of_diagnose);
                vsmr.set_first_date_of_getting_treatment(first_date_of_getting_treatment);
                vsmr.set_last_date_of_treatment(last_date_of_diagnose);
                vsmr.set_details(details);
                mv.add_new_component(vsmr, "විශේෂ සෞඛ්‍ය අවශ්‍යතා");
            } catch (SQLException ex) {
                Logger.getLogger(StudentMedicalRequirementList.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int row = studentMedicalStatusListTable.getSelectedRow();
        System.out.println("selected row: " + row);
        if(row>-1){
            try {
                DefaultTableModel dtm = (DefaultTableModel) studentMedicalStatusListTable.getModel();
                int id = Integer.parseInt(dtm.getValueAt(row, 5).toString());
                String student_name = dtm.getValueAt(row, 0).toString();
                String medical_status = dtm.getValueAt(row, 1).toString();
                String first_date_of_diagnose = dtm.getValueAt(row, 2).toString();
                String first_date_of_getting_treatment = dtm.getValueAt(row, 3).toString();
                String last_date_of_diagnose = dtm.getValueAt(row, 4).toString();
                StudentMedicalInformationController ec = new StudentMedicalInformationController();
                String details = "";
                details = ec.get_std_details_by_id(id);
                EditStudentMedicalRequirement vsmr = new EditStudentMedicalRequirement(mv, id);
                vsmr.set_student_name(student_name);
                vsmr.set_medical_requirement(medical_status);
                vsmr.set_first_date_of_diagnose(first_date_of_diagnose);
                vsmr.set_first_date_of_getting_treatment(first_date_of_getting_treatment);
                vsmr.set_last_date_of_treatment(last_date_of_diagnose);
                vsmr.set_details(details);
                mv.add_new_component(vsmr, "විශේෂ සෞඛ්‍ය අවශ්‍යතා යාවත්කාලීන කිරීම");
            } catch (SQLException ex) {
                Logger.getLogger(StudentMedicalRequirementList.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assesmentCodeLabel;
    private javax.swing.JLabel assesmentNameLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicalStatusText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable studentMedicalStatusListTable;
    private javax.swing.JTextField studentNameText;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

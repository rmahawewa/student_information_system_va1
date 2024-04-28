/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;

import Controller.SchoolController;
import Controller.StudentGradeExamController;
import View.Edit.EditSchoolInfo;
import View.IndividualView.ViewSchoolInfo;
import View.IndividualView.ViewStudentGradeExam;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import View.MainView;

/**
 *
 * @author HP
 */
public class SchoolList extends javax.swing.JPanel {
    
    MainView mv;

    /**
     * Creates new form ExamList
     */
    public SchoolList() {
        initComponents();
    }
    
    public SchoolList(MainView mf) {
        initComponents();
        this.mv = mf;
        try {
            this.loadTable("");
        } catch (SQLException ex) {
            Logger.getLogger(SchoolList.class.getName()).log(Level.SEVERE, null, ex);
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
        schoolNameLabel = new javax.swing.JLabel();
        schoolNameText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        schoolTable = new javax.swing.JTable();

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("සිසු/සිසුවියන් ඉගෙන ගන්නා පාසල් පිලිබද තොරතුරු සටහන");

        schoolNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        schoolNameLabel.setText("පාසලේ නම:");

        schoolNameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

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

        schoolTable.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        schoolTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "පද්ධති කේතය", "පාසලේ නම", "ලිපිනය", "දුරකතන අංකය"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(schoolTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(schoolNameLabel)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton)))
                            .addComponent(schoolNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(topicLabel)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(topicLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolNameLabel)
                    .addComponent(schoolNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(viewButton))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int row = schoolTable.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) schoolTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String school_name = dtm.getValueAt(row, 1).toString();
            String address = dtm.getValueAt(row, 2).toString();
            String contact_number = dtm.getValueAt(row, 3).toString();

            SchoolController sc = new SchoolController();
            String school_details = sc.get_school_info_by_id(id);
            
            ViewSchoolInfo form = new ViewSchoolInfo(mv);
            form.setSchoolName(school_name);
            form.setSchoolAddress(address);
            form.setContactNumber(contact_number);
            form.setDetails(school_details);
            mv.add_new_component(form, "පාසල් තොරතුරු");
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String school_name = schoolNameText.getText();
        try {
            this.loadTable(school_name);
        } catch (SQLException ex) {
            Logger.getLogger(SchoolList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        schoolNameText.setText("");
        try {
            this.loadTable("");
        } catch (SQLException ex) {
            Logger.getLogger(SchoolList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int row = schoolTable.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) schoolTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String school_name = dtm.getValueAt(row, 1).toString();
            String address = dtm.getValueAt(row, 2).toString();
            String contact_number = dtm.getValueAt(row, 3).toString();

            SchoolController sc = new SchoolController();
            String school_details = sc.get_school_info_by_id(id);
            
            EditSchoolInfo form = new EditSchoolInfo(mv,id);
            form.setSchoolName(school_name);
            form.setSchoolAddress(address);
            form.setContactNumber(contact_number);
            form.setDetails(school_details);
            mv.add_new_component(form, "පාසල් තොරතුරු යාවත්කාලීන කිරීම");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    public void loadTable(String school) throws SQLException{
        try{
            this.clearTable(schoolTable);
            SchoolController schl = new SchoolController();
            HashMap<Integer, Map<Integer, String>> hm = schl.get_school_list(school);
            this.createTable(hm, schoolTable);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel schoolNameLabel;
    private javax.swing.JTextField schoolNameText;
    private javax.swing.JTable schoolTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

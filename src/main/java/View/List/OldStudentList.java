/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;
import Controller.ExamController;
import View.MainView;
import Controller.OldStudentController;
import View.Edit.EditOldStudentInfo;
import View.IndividualView.ViewExam;
import View.IndividualView.ViewOldStudentInfo;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class OldStudentList extends javax.swing.JPanel {

    MainView mv;
    
    /**
     * Creates new form ExamList
     */
    public OldStudentList() {
        initComponents();
    }
    
    public OldStudentList(MainView mf) {
        try {
            initComponents();
            this.mv = mf;
            this.loadTable("");
        } catch (SQLException ex) {
            Logger.getLogger(OldStudentList.class.getName()).log(Level.SEVERE, null, ex);
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
        oldStudentNameLabel = new javax.swing.JLabel();
        olsStudentNameText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        oldStudentTable = new javax.swing.JTable();

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("ආදි ශිෂ්‍ය විස්තර ඇතුලත් තොරතුරු සටහන");

        oldStudentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        oldStudentNameLabel.setText("ආදි සිසු/සිසුවියගේ නම:");

        olsStudentNameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

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

        oldStudentTable.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        oldStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "පද්ධති කේතය", "ආදි සිසු/සිසුවියගේ නම", "දහම් පාසලේ සිටි අවසන් දිනය", "දුරකතන අංකය"
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
        jScrollPane1.setViewportView(oldStudentTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oldStudentNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicLabel)
                                    .addComponent(olsStudentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(topicLabel)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldStudentNameLabel)
                    .addComponent(olsStudentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(viewButton))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int row = oldStudentTable.getSelectedRow();
        System.out.println("selected row: " + row);
        if(row>-1){
            DefaultTableModel dtm = (DefaultTableModel) oldStudentTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String student_name = dtm.getValueAt(row, 1).toString();
            String left_Date = dtm.getValueAt(row, 2).toString();
            OldStudentController osc = new OldStudentController();
            List<String> l = osc.get_old_student_info_by_id(id);
            if(!l.isEmpty()){
                String reason_for_leaving = l.get(0).toString();
                String transferred_damma_school = l.get(1).toString();
                
                ViewOldStudentInfo vosi = new ViewOldStudentInfo(mv);
                vosi.set_student_name(student_name);
                vosi.set_left_date(left_Date);
                vosi.set_reason(reason_for_leaving);
                vosi.set_transferred_damma_school(transferred_damma_school);
                //JFrame frame = new MainView();
                
                mv.add_new_component(vosi, "ආදි ශිෂ්‍ය තොරතුරු");
            }
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String old_student_name = this.olsStudentNameText.getText();
        try {
            this.loadTable(old_student_name);
        } catch (SQLException ex) {
            Logger.getLogger(OldStudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.olsStudentNameText.setText("");
        try {
            this.loadTable("");
        } catch (SQLException ex) {
            Logger.getLogger(OldStudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int row = oldStudentTable.getSelectedRow();
        System.out.println("selected row: " + row);
        if(row>-1){
            DefaultTableModel dtm = (DefaultTableModel) oldStudentTable.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 0).toString());
            String student_name = dtm.getValueAt(row, 1).toString();
            String left_Date = dtm.getValueAt(row, 2).toString();
            OldStudentController osc = new OldStudentController();
            List<String> l = osc.get_old_student_info_by_id(id);
            if(!l.isEmpty()){
                String reason_for_leaving = l.get(0).toString();
                String transferred_damma_school = l.get(1).toString();
                
                EditOldStudentInfo eosi = new EditOldStudentInfo(mv, id);
                eosi.set_student_name(student_name);
                eosi.set_left_date(left_Date);
                eosi.set_reason(reason_for_leaving);
                eosi.set_transferred_damma_school(transferred_damma_school);
                //JFrame frame = new MainView();
                
                mv.add_new_component(eosi, "ආදි ශිෂ්‍ය තොරතුරු යාවත්කාලීන කිරීම");
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    public void loadTable(String old_student_name) throws SQLException{
        try{
            this.clearTable(oldStudentTable);
            OldStudentController osc = new OldStudentController();
            HashMap<Integer, Map<Integer,String>> hm = osc.getInfoByFiltering(old_student_name);
            this.createTable(hm, oldStudentTable);
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
    private javax.swing.JLabel oldStudentNameLabel;
    private javax.swing.JTable oldStudentTable;
    private javax.swing.JTextField olsStudentNameText;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

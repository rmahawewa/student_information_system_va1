/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.List;

import Controller.GradeController;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class GradeList extends javax.swing.JPanel {

    /**
     * Creates new form GradeList
     */
    public GradeList() {
        initComponents();
        try {        
            this.loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(GradeList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadTable() throws SQLException{
        this.clearTable();
        GradeController gc = new GradeController();
        Map<Integer,Map<Integer,String>> hm = gc.getAllGrades();
        if(!hm.isEmpty()){
            hm.forEach((key,value) -> {
                HashMap hshmp = (HashMap) value;
                String[] tbl_data = {(String)hshmp.get(1), (String)hshmp.get(2)};
                DefaultTableModel dtm = (DefaultTableModel) gradesTable.getModel();
                dtm.addRow(tbl_data);
            });
        }
    }
    
    public void clearTable(){
        DefaultTableModel dtm = (DefaultTableModel) gradesTable.getModel();
        int row_count = dtm.getRowCount();
        
        for(int i = row_count-1; i >= 0; i--){
            dtm.removeRow(i);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        gradesTable = new javax.swing.JTable();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Grades");

        gradesTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade in number", "Grade in words"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gradesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topicLabel)
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(topicLabel)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gradesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}
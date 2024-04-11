/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import Controller.StudentController;
import View.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import Controller.StudentAssesmentExamController;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;

/**
 *
 * @author HP
 */
public class StudentAssesmentExam extends javax.swing.JPanel {
    
    private MainView mv;
    int exam_assesment_id;
    int student_id = 0;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public StudentAssesmentExam() {
        initComponents();
    }
    
    public StudentAssesmentExam(MainView mf) {
        initComponents();
        this.mv = mf;
    }
    
    public void set_exam_assesment_id(int id){
        this.exam_assesment_id = id;
    }
    
    public void set_exam_name(String exam){
        this.examNameValueLabel.setText(exam);
    }
    
    public void set_assesment_name(String assesment){
        this.assesmentNameValueLabel.setText(assesment);
    }
    
    public void set_student_id(String text){
        String[] valus = text.split("-");
        this.student_id = Integer.parseInt(valus[0]);
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
        remarksLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        marksLabel = new javax.swing.JLabel();
        assesmentLabel = new javax.swing.JLabel();
        examNameValueLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        assesmentNameValueLabel = new javax.swing.JLabel();
        marksText = new javax.swing.JTextField();
        remarksText = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        studentNameText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        nameListScrollPane = new javax.swing.JScrollPane();
        studentNamesList = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("සිසුන්ගේ තරග කුසලතා පිලිබද විස්තර ඇතුලත් කිරීම");

        examLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        examLabel.setText("තරගාවලිය:");

        remarksLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        remarksLabel.setText("විශේෂ සටහන්:");

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("යොමු කරන්න");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        cancelButton.setText("අවලංගු කරන්න");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        marksLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        marksLabel.setText("ලකුණු/ ස්ථානය:");

        assesmentLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentLabel.setText("තරගය:");

        examNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        examNameValueLabel.setText("exam name");

        gradeLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        gradeLabel.setText("සිසු/සිසුවියගේ නම:");

        assesmentNameValueLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentNameValueLabel.setText("assesment name");

        marksText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        remarksText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        descriptionLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        descriptionLabel.setText("වැඩිදුර විස්තර:");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        studentNameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentNameTextKeyReleased(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        clearButton.setText("මකන්න");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        studentNamesList.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        studentNamesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentNamesListMouseClicked(evt);
            }
        });
        nameListScrollPane.setViewportView(studentNamesList);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("*");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gradeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marksLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(examLabel)
                            .addComponent(assesmentLabel)
                            .addComponent(remarksLabel)
                            .addComponent(descriptionLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assesmentNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(remarksText)
                    .addComponent(marksText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameListScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(studentNameText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(submitButton)
                        .addGap(92, 92, 92)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(topicLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assesmentLabel)
                    .addComponent(assesmentNameValueLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel)
                    .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marksLabel)
                    .addComponent(marksText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remarksLabel)
                    .addComponent(remarksText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(descriptionLabel)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel dlm = new DefaultListModel();
    private void studentNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentNameTextKeyReleased
        // TODO add your handling code here:
        if(!studentNameText.isEditable()){
            return;
        }
        dlm.removeAllElements();
        
        String text = studentNameText.getText();
        StudentController sc = new StudentController();
        List<String> l = new ArrayList<String>();
        l = sc.getStudentsByText(text);
        if(!l.isEmpty() && l!=null){
            for(String i : l){
                dlm.addElement(i);
            }
        }else{
            dlm.addElement("- No results found -");
        }
        
        studentNamesList.setModel(dlm);
        nameListScrollPane.setVisible(true);
        studentNamesList.setVisible(true);
        
    }//GEN-LAST:event_studentNameTextKeyReleased

    private void studentNamesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentNamesListMouseClicked
        // TODO add your handling code here:
        JList lst = (JList) evt.getSource();
        if(evt.getClickCount() >= 1){
            int index = lst.locationToIndex(evt.getPoint());
            if(index >= 0){
                Object o = lst.getModel().getElementAt(index);
                String name = o.toString();
                if(name.equals("- No results found -")){
                    return;
                }
                this.set_student_id(name);
                studentNameText.setText(name);
                studentNameText.setEditable(false);
                ((DefaultListModel)lst.getModel()).clear();
            }
        }
    }//GEN-LAST:event_studentNamesListMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        studentNameText.setEditable(true);
        studentNameText.setText("");
        ((DefaultListModel)studentNamesList.getModel()).clear();
        this.student_id = 0;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String marks = marksText.getText();
        String remarks = remarksText.getText();
        String description = descriptionTextArea.getText();
        String responce = "Failed to insert the record";
        
        if(student_id > 0 && !marks.equals("")){
            String exam_assesment_id = Integer.toString(this.exam_assesment_id);
            String student_id = Integer.toString(this.student_id);
            List<String> l = new ArrayList<String>();
            l.add(0, exam_assesment_id);
            l.add(1,student_id);
            l.add(2,marks);
            l.add(3,remarks);
            l.add(4,description);
            
            StudentAssesmentExamController c = new StudentAssesmentExamController();
            int r = c.addStudentAssesmentExam(l);
            //responce = r>0?"Record successfully inserted":"Failed to insert the record";
            if(r>0){
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("Record successfully inserted.");
                rsm.setVisible(true);
            }else{
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to insert the record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }
        //System.out.println(responce);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed

    
    
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
//            java.util.logging.Logger.getLogger(StudentAssesmentExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StudentAssesmentExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StudentAssesmentExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StudentAssesmentExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StudentAssesmentExam().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assesmentLabel;
    private javax.swing.JLabel assesmentNameValueLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel examLabel;
    private javax.swing.JLabel examNameValueLabel;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel marksLabel;
    private javax.swing.JTextField marksText;
    private javax.swing.JScrollPane nameListScrollPane;
    private javax.swing.JLabel remarksLabel;
    private javax.swing.JTextField remarksText;
    private javax.swing.JTextField studentNameText;
    private javax.swing.JList<String> studentNamesList;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

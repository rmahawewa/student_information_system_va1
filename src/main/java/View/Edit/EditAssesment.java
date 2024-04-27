/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Edit;

//import View.*;

import View.Add.*;
import View.MainView;
import Controller.AssesmentController;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;
import java.util.List;
//import View.*;

/**
 *
 * @author HP
 */
public class EditAssesment extends javax.swing.JPanel {
    
    MainView mv;
    int asmt_id;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public EditAssesment() {
        initComponents();
    }
    
    public EditAssesment(MainView mf) {
        initComponents();
        this.mv = mf;
    }
    
    public void set_id(int id){
        this.asmt_id = id;
    }
    
    public void set_name(String name){
       assesmentNameText.setText(name);
    }
    
    public void set_code(String code){
        assesmentCodeText.setText(code);
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
        assesmentNameText = new javax.swing.JTextField();
        assesmentCodeText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("තරග පිලිබද තොරතුරු ඇතුලත් කිරීම");

        assesmentNameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentNameLabel.setText("තරගයේ නම:");

        assesmentCodeLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentCodeLabel.setText("තරගය හදුනාගැනීමේ කේතය:");

        assesmentNameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        assesmentNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assesmentNameTextActionPerformed(evt);
            }
        });

        assesmentCodeText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("යාවත්කාලීන කරන්න");
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

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(assesmentCodeLabel)
                            .addComponent(assesmentNameLabel))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assesmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assesmentCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(topicLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(submitButton)
                                .addGap(91, 91, 91)
                                .addComponent(cancelButton)))
                        .addGap(138, 138, 138)))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(topicLabel)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assesmentCodeLabel)
                            .addComponent(assesmentCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(assesmentNameLabel)
                        .addComponent(assesmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assesmentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assesmentNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assesmentNameTextActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String name = assesmentNameText.getText();
        String code = assesmentCodeText.getText();
        if(!name.equals("") && !code.equals("")){
            AssesmentController ac = new AssesmentController();
            List<String> lst = new ArrayList<String>();
            lst.add(0, Integer.toString(asmt_id));
            lst.add(1, name);
            lst.add(2, code);
            
            boolean b = ac.updateAssesment(lst);
            if(b){
                System.out.println("තරගය පිලිබද තොරතුරු සාර්ථක ලෙස මෙම දත්ත පද්ධතිය තුල යාවත්කාලීන විය");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("තරගය පිලිබද තොරතුරු සාර්ථක ලෙස මෙම දත්ත පද්ධතිය තුල යාවත්කාලීන විය");
                rsm.setVisible(true);
            }else{
                System.out.println("Failed to update the assesment record");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("තරගය පිලිබද තොරතුරු දත්ත පද්ධතිය තුල යාවත්කාලීන වීම අසාර්ථක බැවින් කරුණාකර නැවත උත්සහ කරන්න");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("කරුණාකර අනිවාර්ය කරුණු සියල්ල නිසි ලෙස යතුරුලියනය කර ඇති දැයි පරීක්ෂා කරන්න");
            fv.setVisible(true);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(AddAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddAssesment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddAssesment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assesmentCodeLabel;
    private javax.swing.JTextField assesmentCodeText;
    private javax.swing.JLabel assesmentNameLabel;
    private javax.swing.JTextField assesmentNameText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

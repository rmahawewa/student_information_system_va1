/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Edit;

import View.MainView;

/**
 *
 * @author HP
 */
public class EditStudentMedicalRequirement extends javax.swing.JPanel {
    
    MainView mv;

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public EditStudentMedicalRequirement() {
        initComponents();
    }
    
    public EditStudentMedicalRequirement(MainView mf) {
        initComponents();
        this.mv = mf;
    }
    
    public void set_student_name(String student_name){
        this.studentNameValueLabel.setText(student_name);
    }
    
    public void set_medical_requirement(String medical_requirement){
        this.medicalRequirementValueLabel.setText(medical_requirement);
    }
    
    public void set_first_date_of_diagnose(String first_date_of_diagnose){
        
    }
    
    public void set_first_date_of_getting_treatment(String first_date_of_treatment){
        
    }
    
    public void set_last_date_of_treatment(String last_date_of_treatment){
        
    }
    
    public void set_details(String details){
        this.detailsTextField.setText(details);
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
        firstDateOfTreatmentLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fdotDayComboBx = new javax.swing.JComboBox<>();
        fdotYearComboBx = new javax.swing.JComboBox<>();
        fdotMonthComboBx = new javax.swing.JComboBox<>();
        medicalRequirementLabel = new javax.swing.JLabel();
        fdofDayComboBx = new javax.swing.JComboBox<>();
        fdodYearComboBx = new javax.swing.JComboBox<>();
        fdodMonthComboBx = new javax.swing.JComboBox<>();
        firstDateOfDiagnoseLabel = new javax.swing.JLabel();
        ldotDayComboBx = new javax.swing.JComboBox<>();
        ldotYearComboBx = new javax.swing.JComboBox<>();
        ldotMonthComboBx = new javax.swing.JComboBox<>();
        lastDateOfTraetementLabel = new javax.swing.JLabel();
        detailsTextField = new javax.swing.JTextField();
        studentNameValueLabel = new javax.swing.JLabel();
        medicalRequirementValueLabel = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Edit Student Medical Requirement Information");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel.setText("Student name:");

        firstDateOfTreatmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfTreatmentLabel.setText("First date of treatement:");

        detailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("Update");

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");

        fdotDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdotDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        fdotYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdotYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        fdotMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdotMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        medicalRequirementLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalRequirementLabel.setText("Medical Requirement:");

        fdofDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdofDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        fdodYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdodYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        fdodMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdodMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        firstDateOfDiagnoseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfDiagnoseLabel.setText("First date of diagnose:");

        ldotDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldotDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ldotYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldotYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        ldotMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ldotMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        lastDateOfTraetementLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastDateOfTraetementLabel.setText("Last date of treatement:");

        detailsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsTextFieldActionPerformed(evt);
            }
        });

        studentNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameValueLabel.setText("student name value");

        medicalRequirementValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalRequirementValueLabel.setText("medical requirement value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detailsLabel)
                        .addGap(138, 138, 138)
                        .addComponent(detailsTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastDateOfTraetementLabel)
                            .addComponent(firstDateOfTreatmentLabel)
                            .addComponent(firstDateOfDiagnoseLabel))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ldotYearComboBx, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fdodYearComboBx, javax.swing.GroupLayout.Alignment.TRAILING, 0, 89, Short.MAX_VALUE)
                            .addComponent(fdotYearComboBx, javax.swing.GroupLayout.Alignment.TRAILING, 0, 89, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fdodMonthComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fdotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fdofDayComboBx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fdotDayComboBx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ldotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ldotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameLabel)
                            .addComponent(medicalRequirementLabel))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicalRequirementValueLabel)
                            .addComponent(studentNameValueLabel))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(topicLabel)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(topicLabel)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentNameValueLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalRequirementLabel)
                    .addComponent(medicalRequirementValueLabel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdodYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdodMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdofDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstDateOfDiagnoseLabel))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdotYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstDateOfTreatmentLabel))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldotYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastDateOfTraetementLabel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsTextFieldActionPerformed

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
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new AddStudentMedicalRequirement().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextField detailsTextField;
    private javax.swing.JComboBox<String> fdodMonthComboBx;
    private javax.swing.JComboBox<String> fdodYearComboBx;
    private javax.swing.JComboBox<String> fdofDayComboBx;
    private javax.swing.JComboBox<String> fdotDayComboBx;
    private javax.swing.JComboBox<String> fdotMonthComboBx;
    private javax.swing.JComboBox<String> fdotYearComboBx;
    private javax.swing.JLabel firstDateOfDiagnoseLabel;
    private javax.swing.JLabel firstDateOfTreatmentLabel;
    private javax.swing.JLabel lastDateOfTraetementLabel;
    private javax.swing.JComboBox<String> ldotDayComboBx;
    private javax.swing.JComboBox<String> ldotMonthComboBx;
    private javax.swing.JComboBox<String> ldotYearComboBx;
    private javax.swing.JLabel medicalRequirementLabel;
    private javax.swing.JLabel medicalRequirementValueLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel studentNameValueLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

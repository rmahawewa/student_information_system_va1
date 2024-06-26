/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Add;

import Controller.MedicalRequirementController;
import Controller.StudentController;
import Controller.StudentMedicalInformationController;
import Controller.UserController;
import View.MainView;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import UserLibraries.GetTimes;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AddStudentMedicalRequirement extends javax.swing.JPanel {
    
    MainView mv;
    int student_id = 0;
    int medical_requirement_id = 0;
    String current_year = GetTimes.getCurrentYear();
    String current_month = GetTimes.getCurrentMonth();
    String current_day = GetTimes.getCurrentDay();

    /**
     * Creates new form AddStudentSchoolInfo
     */
    public AddStudentMedicalRequirement() {
        initComponents();
    }
    
    public AddStudentMedicalRequirement(MainView mf) {
        initComponents();
        this.mv = mf;
        this.current_year = GetTimes.getCurrentYear();
        this.current_month = GetTimes.getCurrentMonth();
        this.current_day = GetTimes.getCurrentDay();
        this.set_first_date_of_diagnose();
        this.set_first_date_of_treatment();
        this.set_last_date_of_treatment();
    }
    
    private void set_first_date_of_diagnose(){
        fdodYearComboBx.setSelectedItem(current_year);
        fdodMonthComboBx.setSelectedItem(current_month);
        fdodDayComboBx.setSelectedItem(current_day);
    }
    
    private void set_first_date_of_treatment(){
    
        fdotYearComboBx.setSelectedItem(current_year);
        fdotMonthComboBx.setSelectedItem(current_month);
        fdotDayComboBx.setSelectedItem(current_day);
        
    }
        
    private void set_last_date_of_treatment(){
    
        ldotYearComboBx.setSelectedItem(current_year);
        ldotMonthComboBx.setSelectedItem(current_month);
        ldotDayComboBx.setSelectedItem(current_day);
        
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
        studentNameText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fdotDayComboBx = new javax.swing.JComboBox<>();
        fdotYearComboBx = new javax.swing.JComboBox<>();
        fdotMonthComboBx = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentNamesList = new javax.swing.JList<>();
        studentNameClearButton = new javax.swing.JButton();
        medicalRequirementText = new javax.swing.JTextField();
        medicalRequirementLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicalRequirementsList = new javax.swing.JList<>();
        medicalRequirementClearButton = new javax.swing.JButton();
        fdodDayComboBx = new javax.swing.JComboBox<>();
        fdodYearComboBx = new javax.swing.JComboBox<>();
        fdodMonthComboBx = new javax.swing.JComboBox<>();
        firstDateOfDiagnoseLabel = new javax.swing.JLabel();
        ldotDayComboBx = new javax.swing.JComboBox<>();
        ldotYearComboBx = new javax.swing.JComboBox<>();
        ldotMonthComboBx = new javax.swing.JComboBox<>();
        lastDateOfTraetementLabel = new javax.swing.JLabel();
        detailsTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("Add Student Medical Requirement Information");

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameLabel.setText("Student name:");

        firstDateOfTreatmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstDateOfTreatmentLabel.setText("First date of treatement:");

        detailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        detailsLabel.setText("Details:");

        studentNameText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentNameTextKeyReleased(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");

        fdotDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdotDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        fdotYearComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdotYearComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        fdotMonthComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdotMonthComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        studentNamesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentNamesListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentNamesList);

        studentNameClearButton.setText("Clear");
        studentNameClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameClearButtonActionPerformed(evt);
            }
        });

        medicalRequirementText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalRequirementText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medicalRequirementTextKeyReleased(evt);
            }
        });

        medicalRequirementLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalRequirementLabel.setText("Medical Requirement:");

        medicalRequirementsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicalRequirementsListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(medicalRequirementsList);

        medicalRequirementClearButton.setText("Clear");
        medicalRequirementClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRequirementClearButtonActionPerformed(evt);
            }
        });

        fdodDayComboBx.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fdodDayComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

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
                .addGap(162, 162, 162)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(firstDateOfTreatmentLabel)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailsLabel)
                            .addComponent(lastDateOfTraetementLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 12, Short.MAX_VALUE)
                            .addComponent(medicalRequirementLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(studentNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fdodYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fdodMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medicalRequirementText, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentNameText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fdodDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameClearButton)
                            .addComponent(medicalRequirementClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fdotYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ldotYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ldotMonthComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ldotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fdotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fdotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(topicLabel)
                .addGap(109, 109, 109))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(firstDateOfDiagnoseLabel)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(topicLabel)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameClearButton)
                    .addComponent(jLabel19)
                    .addComponent(studentNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalRequirementText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicalRequirementClearButton)
                    .addComponent(jLabel20)
                    .addComponent(medicalRequirementLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdodYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdodMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdodDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstDateOfTreatmentLabel)
                    .addComponent(fdotYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldotDayComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldotMonthComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldotYearComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastDateOfTraetementLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addGap(51, 51, 51))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(373, 373, 373)
                    .addComponent(firstDateOfDiagnoseLabel)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsTextFieldActionPerformed

    DefaultListModel demoList = new DefaultListModel();
    private void studentNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentNameTextKeyReleased
        // TODO add your handling code here:
        System.out.println("key released");
        demoList.removeAllElements();
        
        String text = studentNameText.getText();
        StudentController sc = new StudentController();
        try {
            List<String> l = sc.getStudentsByText(text);
            if(!l.isEmpty() && l!=null){
                for(String t : l){
                    System.out.println("HashMap: " + l);
                    demoList.addElement(t);
                }
            }else{
                demoList.addElement("-No results found-");
            }
        }catch(Exception ex) {
            Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(Level.SEVERE, null, ex);
            demoList.addElement("-No results found-");
        }

        studentNamesList.setModel(demoList);
        jScrollPane1.setVisible(true);
//        getContentPane().validate();
//        getContentPane().repaint();
        
        
    }//GEN-LAST:event_studentNameTextKeyReleased

    private void studentNamesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentNamesListMouseClicked
        // TODO add your handling code here:
        JList l = (JList) evt.getSource();
        if(evt.getClickCount() >= 1){
            int index = l.locationToIndex(evt.getPoint());
            System.out.println(index);
            if(index >= 0){
                Object o = l.getModel().getElementAt(index);
                System.out.println("Clicked on " + o.toString());
                String name = o.toString();
                studentNameText.setText(name);
                studentNameText.setEditable(false);
                DefaultListModel dlm = (DefaultListModel) l.getModel();
                dlm.removeAllElements();
//                l.setVisible(false);
//                jScrollPane1.setVisible(false);
                student_id = this.getIdFromString(name);
                System.out.println("student id: " + student_id);
            }
        }
    }//GEN-LAST:event_studentNamesListMouseClicked

    private int getIdFromString(String strg){
        int rtn = -1;
        if(strg.charAt(0)=='-'){ return rtn; }
        try{
            String arr[] = strg.split("-");
            rtn = Integer.parseInt(arr[0]);
        }catch(Exception ex){
            System.out.println(ex);
        }
        return rtn;        
    }
    
    private void studentNameClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameClearButtonActionPerformed
        // TODO add your handling code here:
        studentNameText.setEditable(true);
        studentNameText.setText("");
        student_id = 0;
    }//GEN-LAST:event_studentNameClearButtonActionPerformed

    DefaultListModel demoList1 = new DefaultListModel();
    private void medicalRequirementTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicalRequirementTextKeyReleased
        // TODO add your handling code here:
        
        System.out.println("key released");
        demoList1.removeAllElements();
        
        String text = medicalRequirementText.getText();
        MedicalRequirementController mrc = new MedicalRequirementController();
        try {
            List<String> l = mrc.get_desease_data(text);
            if(!l.isEmpty() && l!=null){
                for(String t : l){
                    System.out.println("HashMap: " + l);
                    demoList1.addElement(t);
                }
            }else{
                demoList1.addElement("-No results found-");
            }
        }catch(Exception ex) {
            Logger.getLogger(AddStudentMedicalRequirement.class.getName()).log(Level.SEVERE, null, ex);
            demoList1.addElement("-No results found-");
        }

        medicalRequirementsList.setModel(demoList1);
        jScrollPane2.setVisible(true);
        
    }//GEN-LAST:event_medicalRequirementTextKeyReleased

    private void medicalRequirementsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicalRequirementsListMouseClicked
        // TODO add your handling code here:
        JList l = (JList) evt.getSource();
        if(evt.getClickCount() >= 1){
            int index = l.locationToIndex(evt.getPoint());
            System.out.println(index);
            if(index >= 0){
                Object o = l.getModel().getElementAt(index);
                System.out.println("Clicked on " + o.toString());
                String name = o.toString();
                medicalRequirementText.setText(name);
                medicalRequirementText.setEditable(false);
                DefaultListModel dlm = (DefaultListModel) l.getModel();
                dlm.removeAllElements();
//                l.setVisible(false);
//                jScrollPane1.setVisible(false);
                medical_requirement_id = this.getIdFromString(name);
                System.out.println("medical_requirement_id: " + medical_requirement_id);
            }
        }
    }//GEN-LAST:event_medicalRequirementsListMouseClicked

    private void medicalRequirementClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRequirementClearButtonActionPerformed
        // TODO add your handling code here:
        medicalRequirementText.setEditable(true);
        medicalRequirementText.setText("");
        medical_requirement_id = 0;
    }//GEN-LAST:event_medicalRequirementClearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String stdnt_id = Integer.toString(this.student_id);
        String medical_requirement_id = Integer.toString(this.medical_requirement_id);
        
        String y_fdod = this.fdodYearComboBx.getSelectedItem().toString();
        String m_fdod = this.fdodMonthComboBx.getSelectedItem().toString();
        String m_fdod_numb = GetTimes.getMonthNumber(m_fdod);
        String d_fdod = this.fdodDayComboBx.getSelectedItem().toString();
        String first_day_of_diagnose = y_fdod + "-" + m_fdod_numb + "-" + d_fdod;
        
        String y_fdot = this.fdotYearComboBx.getSelectedItem().toString();
        String m_fdot = this.fdotMonthComboBx.getSelectedItem().toString();
        String m_fdot_numb = GetTimes.getMonthNumber(m_fdot);
        String d_fdot = this.fdotDayComboBx.getSelectedItem().toString();
        String first_day_of_treatment = y_fdot + "-" + m_fdot_numb + "-" + d_fdot;
        
        String y_ldot = this.ldotYearComboBx.getSelectedItem().toString();
        String m_ldot = this.ldotMonthComboBx.getSelectedItem().toString();
        String m_ldot_numb = GetTimes.getMonthNumber(m_ldot);
        String d_ldot = this.ldotDayComboBx.getSelectedItem().toString();
        String last_day_of_treatment = y_ldot + "-" + m_ldot_numb + "-" + d_ldot;
        
        String details = detailsTextField.getText();
        
        if(!stdnt_id.equals("0") && !medical_requirement_id.equals("0")){
            List<String> l = new ArrayList<String>();
            l.add(0, stdnt_id);
            l.add(1, medical_requirement_id);
            l.add(2, first_day_of_diagnose);
            l.add(3, first_day_of_treatment);
            l.add(4, last_day_of_treatment);
            l.add(5, details);

            StudentMedicalInformationController smic = new StudentMedicalInformationController();
            int i = smic.insert_student_medical_requirement_record(l);

            if(i > 0){
                System.out.println("The Student Medical record successfully inserted");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("The Student Medical record successfully inserted.");
                rsm.setVisible(true);
            }else{
                System.out.println("Failed to insert the Student Medical record. Please try again");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to insert the Student Medical record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
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
    private javax.swing.JComboBox<String> fdodDayComboBx;
    private javax.swing.JComboBox<String> fdodMonthComboBx;
    private javax.swing.JComboBox<String> fdodYearComboBx;
    private javax.swing.JComboBox<String> fdotDayComboBx;
    private javax.swing.JComboBox<String> fdotMonthComboBx;
    private javax.swing.JComboBox<String> fdotYearComboBx;
    private javax.swing.JLabel firstDateOfDiagnoseLabel;
    private javax.swing.JLabel firstDateOfTreatmentLabel;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastDateOfTraetementLabel;
    private javax.swing.JComboBox<String> ldotDayComboBx;
    private javax.swing.JComboBox<String> ldotMonthComboBx;
    private javax.swing.JComboBox<String> ldotYearComboBx;
    private javax.swing.JButton medicalRequirementClearButton;
    private javax.swing.JLabel medicalRequirementLabel;
    private javax.swing.JTextField medicalRequirementText;
    private javax.swing.JList<String> medicalRequirementsList;
    private javax.swing.JButton studentNameClearButton;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameText;
    private javax.swing.JList<String> studentNamesList;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

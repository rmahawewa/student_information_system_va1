/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.IndividualView.Student;

import Controller.ExcelMaker;
import Controller.GradeController;
import Controller.StudentController;
import Controller.StudentFamilyMemberController;
import View.MainView;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controller.StudentSchoolController;
import Controller.StudentAssesmentExamController;
import Controller.StudentGradeExamController;
import Controller.StudentMedicalInformationController;
import View.IndividualView.ViewSchoolInfo;
import View.IndividualView.ViewStudentAssesmentExam;
import View.IndividualView.ViewStudentFamilyInfo;
import View.IndividualView.ViewStudentGradeExam;
import View.IndividualView.ViewStudentMedicalRequirement;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ViewStudent_fromList extends javax.swing.JPanel {

    /**
     * Creates new form AddStudent
     */
    
    MainView mv;
    int student_id;
    String student_name = "";
    
    public ViewStudent_fromList() {
        initComponents();
    }
    
    public ViewStudent_fromList(MainView mf, int student_id) throws SQLException {
        initComponents();
        this.mv = mf;
        this.student_id = student_id;
        this.studentFamilyInformationTable(student_id);
        this.studentSchoolInformation(student_id);
        this.studentAssesmentPerformance(student_id);
        this.studentExamPerformance(student_id);
        this.studentMedicalStatusInformation(student_id);
    }

    public void setName(String name){
        this.studentNameValueLabel.setText(name);
        this.student_name = name;
    }
    
    public void setAddress(String address){
        this.addressValueLabel.setText(address);
    }
    
    public void setBirthday(String birthday){
        this.birthdayValueLabel.setText(birthday);
    }
    
    public void setContactNumber(String contact_number){
        this.contactNumberValueLabel.setText(contact_number);
    }
    
    public void setPhoto(String photo){
        Image im = Toolkit.getDefaultToolkit().createImage(photo);
        im = im.getScaledInstance(105, 135, Image.SCALE_SMOOTH);
        ImageIcon imicn = new ImageIcon(im);
        photoContainerLabel.setIcon(imicn);
    }
    
    public void setIdentityCode(String ic){
        this.identityCodeValueLabel.setText(ic);
    }
    
    public void setPassportLabel(String psptnmb){
        this.passportNumberValueLabel.setText(psptnmb);
    }
    
    public void setDateOfEntarance(String doe){
        this.dateOfEntaranceValueLabel.setText(doe);
    }
    
    public void setGradeInYearOfEntarance(String grade){
        this.gradeInyearOfEntaranceValueLabel.setText(grade);
    }
    
    public void setCurrentGrade(String g){
        this.currentGradeValueLabel.setText(g);
    }
    
    public void studentFamilyInformationTable(int student_id) throws SQLException{
        StudentFamilyMemberController sfmc = new StudentFamilyMemberController();
        HashMap<Integer, Map<Integer,String>> hm = sfmc.getStudentFamilyMembersByStudentId(student_id);
        this.clearTable(viewStudentForm_studentFamily_table);
        this.createTable(hm, viewStudentForm_studentFamily_table);
    }
    
    public void studentSchoolInformation(int student_id) throws SQLException{
        StudentSchoolController ssc = new StudentSchoolController();
        HashMap<Integer, Map<Integer,String>> hm = ssc.getStudentSchoolDetailsForStudentId(student_id);
        this.clearTable(viewStudent_studentSchoolInformation_table);
        this.createTable(hm, viewStudent_studentSchoolInformation_table);
    }
    
    public void studentAssesmentPerformance(int student_id) throws SQLException{
        StudentAssesmentExamController saec = new StudentAssesmentExamController();
        HashMap<Integer, Map<Integer,String>> hm = saec.get_student_assesment_exam_details(student_id);
        this.clearTable(viewStudentTable_assesmentPerformance_table);
        this.createTable(hm, viewStudentTable_assesmentPerformance_table);
    }
    
    public void studentExamPerformance(int student_id) throws SQLException{
        StudentGradeExamController sgec = new StudentGradeExamController();
        HashMap<Integer, Map<Integer,String>> hm = sgec.get_Info_by_student_id(student_id);
        this.clearTable(viewStudentForm_examPerformance_table);
        this.createTable(hm, viewStudentForm_examPerformance_table);
    }
    
    public void studentMedicalStatusInformation(int student_id){
        StudentMedicalInformationController c = new StudentMedicalInformationController();
        HashMap<Integer, Map<Integer,String>> hm = c.get_student_medical_requirement_info(student_id);
        this.clearTable(viewStudentForm_medicalStatus_table);
        this.createTable(hm, viewStudentForm_medicalStatus_table);
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

        dateOfEnteranceLabel = new javax.swing.JLabel();
        gradeInYearOfEnteranceLabel = new javax.swing.JLabel();
        topicLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        photoContainerLabel = new javax.swing.JLabel();
        identityCodeLabel = new javax.swing.JLabel();
        passportNumberLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewStudentForm_studentFamily_table = new javax.swing.JTable();
        familyInfoViewButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewStudent_studentSchoolInformation_table = new javax.swing.JTable();
        studentSchoolInfoViewButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewStudentTable_assesmentPerformance_table = new javax.swing.JTable();
        studentAssesmentPerformanceInfoViewButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        viewStudentForm_examPerformance_table = new javax.swing.JTable();
        examPerformanceInfoViewButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        viewStudentForm_medicalStatus_table = new javax.swing.JTable();
        medicalStatusViewButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        familyContactNumberLabel = new javax.swing.JLabel();
        studentNameValueLabel = new javax.swing.JLabel();
        addressValueLabel = new javax.swing.JLabel();
        birthdayValueLabel = new javax.swing.JLabel();
        contactNumberValueLabel = new javax.swing.JLabel();
        identityCodeValueLabel = new javax.swing.JLabel();
        passportNumberValueLabel = new javax.swing.JLabel();
        dateOfEntaranceValueLabel = new javax.swing.JLabel();
        gradeInyearOfEntaranceValueLabel = new javax.swing.JLabel();
        excelExportButton = new javax.swing.JButton();
        currentGradeValueLabel = new javax.swing.JLabel();
        currentGradeLabel = new javax.swing.JLabel();

        dateOfEnteranceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfEnteranceLabel.setText("Date of entarance:  ");

        gradeInYearOfEnteranceLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeInYearOfEnteranceLabel.setText("Grade in year of entarance:   ");

        topicLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topicLabel.setText("View Student Information");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Name:  ");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLabel.setText("Address:");

        birthdayLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        birthdayLabel.setText("Birthday:  ");

        photoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        photoLabel.setText("Photo:");

        photoContainerLabel.setBackground(new java.awt.Color(255, 204, 153));
        photoContainerLabel.setForeground(new java.awt.Color(255, 204, 153));

        identityCodeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        identityCodeLabel.setText("Identity code:");

        passportNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passportNumberLabel.setText("Passport number:");

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student's Family Information");

        viewStudentForm_studentFamily_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewStudentForm_studentFamily_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Relationship", "Name", "NIC", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(viewStudentForm_studentFamily_table);

        familyInfoViewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        familyInfoViewButton.setText("View information");
        familyInfoViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyInfoViewButtonActionPerformed(evt);
            }
        });

        viewStudent_studentSchoolInformation_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewStudent_studentSchoolInformation_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "School name", "Date of entarance", "Is currently studing", "Date of leave", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(viewStudent_studentSchoolInformation_table);

        studentSchoolInfoViewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentSchoolInfoViewButton.setText("View information");
        studentSchoolInfoViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSchoolInfoViewButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student's School Information");

        viewStudentTable_assesmentPerformance_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewStudentTable_assesmentPerformance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date and Time", "Assesment", "Exam", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane3.setViewportView(viewStudentTable_assesmentPerformance_table);

        studentAssesmentPerformanceInfoViewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentAssesmentPerformanceInfoViewButton.setText("View information");
        studentAssesmentPerformanceInfoViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAssesmentPerformanceInfoViewButtonActionPerformed(evt);
            }
        });

        viewStudentForm_examPerformance_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewStudentForm_examPerformance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date and Time", "Grade", "Exam", "Marks", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane4.setViewportView(viewStudentForm_examPerformance_table);

        examPerformanceInfoViewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        examPerformanceInfoViewButton.setText("View information");
        examPerformanceInfoViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examPerformanceInfoViewButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student's Exam Performance Information");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Student's Assesment Performance");

        viewStudentForm_medicalStatus_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewStudentForm_medicalStatus_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Desease", "First date of diagnose", "First treatement day", "Last treatement day", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane5.setViewportView(viewStudentForm_medicalStatus_table);

        medicalStatusViewButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicalStatusViewButton.setText("View information");
        medicalStatusViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalStatusViewButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Student's Medical Status Information");

        familyContactNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        familyContactNumberLabel.setText("Family contact number:");

        studentNameValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentNameValueLabel.setText("student name value");

        addressValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressValueLabel.setText("student address value");

        birthdayValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        birthdayValueLabel.setText("student birthday value");

        contactNumberValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactNumberValueLabel.setText("student contact number value");

        identityCodeValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        identityCodeValueLabel.setText("identity code value");

        passportNumberValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passportNumberValueLabel.setText("passport nuber value");

        dateOfEntaranceValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfEntaranceValueLabel.setText("date of entarance value");

        gradeInyearOfEntaranceValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gradeInyearOfEntaranceValueLabel.setText("grade in year of entarance value");

        excelExportButton.setBackground(new java.awt.Color(0, 153, 51));
        excelExportButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excelExportButton.setForeground(new java.awt.Color(255, 255, 255));
        excelExportButton.setText("Excel");
        excelExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelExportButtonActionPerformed(evt);
            }
        });

        currentGradeValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        currentGradeValueLabel.setText("current grade");

        currentGradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        currentGradeLabel.setText("                   Current Grade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gradeInYearOfEnteranceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateOfEnteranceLabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(identityCodeLabel)
                                            .addComponent(passportNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(photoLabel)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressLabel)
                                        .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(familyContactNumberLabel)
                                        .addGap(11, 11, 11))
                                    .addComponent(currentGradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gradeInyearOfEntaranceValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                    .addComponent(dateOfEntaranceValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(photoContainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(passportNumberValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(identityCodeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(contactNumberValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(birthdayValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentNameValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(topicLabel)
                                .addGap(75, 75, 75)
                                .addComponent(excelExportButton)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(currentGradeValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(familyInfoViewButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentSchoolInfoViewButton)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(studentAssesmentPerformanceInfoViewButton)
                            .addComponent(examPerformanceInfoViewButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(153, 153, 153)
                                    .addComponent(medicalStatusViewButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excelExportButton))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(studentNameValueLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressValueLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayLabel)
                    .addComponent(birthdayValueLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyContactNumberLabel)
                    .addComponent(contactNumberValueLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(photoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(photoContainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identityCodeLabel)
                    .addComponent(identityCodeValueLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportNumberLabel)
                    .addComponent(passportNumberValueLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfEnteranceLabel)
                    .addComponent(dateOfEntaranceValueLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeInYearOfEnteranceLabel)
                    .addComponent(gradeInyearOfEntaranceValueLabel))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentGradeLabel)
                    .addComponent(currentGradeValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyInfoViewButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentSchoolInfoViewButton))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentAssesmentPerformanceInfoViewButton)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(examPerformanceInfoViewButton))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(medicalStatusViewButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(closeButton)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        //System.out.println(nameText.getText());
        this.mv.close_tab();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void familyInfoViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyInfoViewButtonActionPerformed
        // TODO add your handling code here:
        int row = viewStudentForm_studentFamily_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) viewStudentForm_studentFamily_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 3).toString());
            StudentFamilyMemberController sfmc = new StudentFamilyMemberController();
            List<String> l = new ArrayList<String>();
            try {
                l = sfmc.get_family_member_info_by_id(id);
            } catch (SQLException ex) {
                Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
            }
            ViewStudentFamilyInfo vsfi = new ViewStudentFamilyInfo(mv);
            vsfi.set_student_name(l.get(0));
            vsfi.set_family_member_name(l.get(1));
            vsfi.set_relationship(l.get(2));
            vsfi.set_nic(l.get(3));
            vsfi.set_fm_birthday(l.get(4));            
            vsfi.set_career(l.get(5));
            
            mv.add_new_component(vsfi, "Student Family Member");
        }
    }//GEN-LAST:event_familyInfoViewButtonActionPerformed

    private void studentSchoolInfoViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSchoolInfoViewButtonActionPerformed
        // TODO add your handling code here:
        int row = viewStudent_studentSchoolInformation_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) viewStudent_studentSchoolInformation_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 4).toString());
            StudentSchoolController ssc = new StudentSchoolController();
            List<String> l = ssc.get_student_school_information(id);
            ViewSchoolInfo vsi = new ViewSchoolInfo(mv);
            vsi.setSchoolName(l.get(0));
            vsi.setSchoolAddress(l.get(1));
            vsi.setContactNumber(l.get(2));
            vsi.setDetails(l.get(3));
            
            mv.add_new_component(vsi, "Student School Information");
        }
    }//GEN-LAST:event_studentSchoolInfoViewButtonActionPerformed

    private void studentAssesmentPerformanceInfoViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAssesmentPerformanceInfoViewButtonActionPerformed
        // TODO add your handling code here:
        int row = viewStudentTable_assesmentPerformance_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) viewStudentTable_assesmentPerformance_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 3).toString());
            String exam = dtm.getValueAt(row, 2).toString();
            String assesment = dtm.getValueAt(row, 1).toString();
            StudentAssesmentExamController ssc = new StudentAssesmentExamController();
            HashMap<Integer, String> hm = new HashMap<Integer, String>();
            try {
                hm = ssc.get_info_by_id(id);
            } catch (SQLException ex) {
                Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
            }
            ViewStudentAssesmentExam view = new ViewStudentAssesmentExam(mv);
            view.set_student_name(this.student_name);
            view.set_exam(exam);
            view.set_assignment(assesment);
            view.set_marks(hm.get(0));
            view.set_remarks(hm.get(1));
            view.set_description(hm.get(2));
            
            mv.add_new_component(view, "Student Exam Assesment");
        }
    }//GEN-LAST:event_studentAssesmentPerformanceInfoViewButtonActionPerformed

    private void examPerformanceInfoViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examPerformanceInfoViewButtonActionPerformed
        // TODO add your handling code here:
        int row = viewStudentForm_examPerformance_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) viewStudentForm_examPerformance_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 4).toString());
            String grade = dtm.getValueAt(row, 1).toString();
            String exam = dtm.getValueAt(row, 2).toString();
            String marks = dtm.getValueAt(row, 3).toString();
            StudentGradeExamController sgec = new StudentGradeExamController();
            HashMap<Integer, String> hm = sgec.get_info_by_id(id);
            ViewStudentGradeExam view = new ViewStudentGradeExam(mv);
            view.set_student_name(this.student_name);
            view.set_exam(exam);
            view.set_grade(grade);
            view.set_marks(marks);
            view.set_remarks(hm.get(1));
            view.set_description(hm.get(2));
            
            mv.add_new_component(view, "Student Exam performance");
        }
    }//GEN-LAST:event_examPerformanceInfoViewButtonActionPerformed

    private void medicalStatusViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalStatusViewButtonActionPerformed
        // TODO add your handling code here:
        int row = viewStudentForm_medicalStatus_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) viewStudentForm_medicalStatus_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 4).toString());
            String desease = dtm.getValueAt(row, 0).toString();
            String fdod = dtm.getValueAt(row, 1).toString();
            String fdogt = dtm.getValueAt(row, 2).toString();
            String ldogt = dtm.getValueAt(row, 3).toString();
            StudentMedicalInformationController smic = new StudentMedicalInformationController();
            try {
                String details = smic.get_std_details_by_id(id);
                ViewStudentMedicalRequirement view = new ViewStudentMedicalRequirement(mv);
                view.set_student_name(this.student_name);
                view.set_medical_requirement(desease);
                view.set_first_date_of_diagnose(fdod);
                view.set_first_date_of_getting_treatment(fdogt);
                view.set_last_date_of_treatment(ldogt);
                view.set_details(details);

                mv.add_new_component(view, "Student Medical Status");
            } catch (SQLException ex) {
                Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_medicalStatusViewButtonActionPerformed

    private void excelExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelExportButtonActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> student_info = new HashMap<String, String>();
        HashMap<Integer, Map<String, String>> family_member_info = new HashMap<Integer, Map<String, String>>();
        HashMap<Integer, Map<String, String>> student_school_info = new HashMap<Integer, Map<String, String>>();
        HashMap<Integer, Map<String, String>> student_assesment_info = new HashMap<Integer, Map<String, String>>();
        HashMap<Integer, Map<String, String>> student_exam_info = new HashMap<Integer, Map<String, String>>();
        HashMap<Integer, Map<String, String>> student_medical_info = new HashMap<Integer, Map<String, String>>();
        
        StudentController sc = new StudentController();
        student_info = sc.get_student_info_by_id(student_id);
        
        StudentFamilyMemberController sfmc = new StudentFamilyMemberController();
        try {
            family_member_info = sfmc.get_student_family_info(student_id);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StudentSchoolController ssc = new StudentSchoolController();
        student_school_info = ssc.get_student_school_details(student_id);
        
        StudentAssesmentExamController saec = new StudentAssesmentExamController();
        try {
            student_assesment_info = saec.get_student_exam_assesment_info(student_id);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StudentGradeExamController sgec = new StudentGradeExamController();
        try {
            student_exam_info = sgec.get_student_grade_exam_info(student_id);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StudentMedicalInformationController smic = new StudentMedicalInformationController();
        try {
            student_medical_info = smic.get_student_medical_requirement_data(student_id);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ExcelMaker em = new ExcelMaker();
        boolean stts = false;
        try {
            stts = em.get_student_info(this.student_id,student_info,family_member_info,student_school_info,student_assesment_info,student_exam_info,student_medical_info);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        if(stts){System.out.println("Excel document successfully created");}
        else{System.out.println("Failed to create the Excel file");}
        
    }//GEN-LAST:event_excelExportButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressValueLabel;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel birthdayValueLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel contactNumberValueLabel;
    private javax.swing.JLabel currentGradeLabel;
    private javax.swing.JLabel currentGradeValueLabel;
    private javax.swing.JLabel dateOfEntaranceValueLabel;
    private javax.swing.JLabel dateOfEnteranceLabel;
    private javax.swing.JButton examPerformanceInfoViewButton;
    private javax.swing.JButton excelExportButton;
    private javax.swing.JLabel familyContactNumberLabel;
    private javax.swing.JButton familyInfoViewButton;
    private javax.swing.JLabel gradeInYearOfEnteranceLabel;
    private javax.swing.JLabel gradeInyearOfEntaranceValueLabel;
    private javax.swing.JLabel identityCodeLabel;
    private javax.swing.JLabel identityCodeValueLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton medicalStatusViewButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passportNumberLabel;
    private javax.swing.JLabel passportNumberValueLabel;
    private javax.swing.JLabel photoContainerLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton studentAssesmentPerformanceInfoViewButton;
    private javax.swing.JLabel studentNameValueLabel;
    private javax.swing.JButton studentSchoolInfoViewButton;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JTable viewStudentForm_examPerformance_table;
    private javax.swing.JTable viewStudentForm_medicalStatus_table;
    private javax.swing.JTable viewStudentForm_studentFamily_table;
    private javax.swing.JTable viewStudentTable_assesmentPerformance_table;
    private javax.swing.JTable viewStudent_studentSchoolInformation_table;
    // End of variables declaration//GEN-END:variables
}

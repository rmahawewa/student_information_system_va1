/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Edit;

import Controller.StudentAssesmentExamController;
import Controller.StudentFamilyMemberController;
import Controller.StudentGradeExamController;
import Controller.StudentMedicalInformationController;
import Controller.StudentSchoolController;
import View.MainView;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import UserLibraries.GetTimes;
import Controller.GradeController;
import Controller.StudentController;
import View.Add.AddGradeExam;
import View.Add.AddStudent;
import View.IndividualView.Student.ViewStudent_fromList;
import View.IndividualView.ViewSchoolInfo;
import View.IndividualView.ViewStudentAssesmentExam;
import View.IndividualView.ViewStudentFamilyInfo;
import View.IndividualView.ViewStudentGradeExam;
import View.IndividualView.ViewStudentMedicalRequirement;
import View.List.StudentList;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class EditStudent extends javax.swing.JPanel {
    
    MainView mv;
    int student_id;
    String student_name;
    private File file = null;

    /**
     * Creates new form AddStudent
     */
    public EditStudent() {
        initComponents();
    }
    
    public EditStudent(MainView mf, int sid) throws SQLException {
        initComponents();
        this.mv = mf;
        this.student_id = sid;
        this.loadGrades();
        this.studentFamilyInformationTable(student_id);
        this.studentSchoolInformation(student_id);
        this.studentAssesmentPerformance(student_id);
        this.studentExamPerformance(student_id);
        this.studentMedicalStatusInformation(student_id);
    }
    
    public void loadGrades(){
        GradeController gc = new GradeController();
        try {
            gradeInYEComboBx.addItem("Select grade");
            HashMap<Integer, Map<Integer,String>> hm = gc.getAllGrades();
            if(!hm.isEmpty()){
                hm.forEach((key,value) -> {
                    gradeInYEComboBx.addItem(value.get(1));
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void setName(String name){
        this.nameText.setText(name);
        this.student_name = name;
    }
    
    public void setAddress(String address){
        this.addressText.setText(address);
    }
    
    public void setBirthday(String birthday){
        String[] bd = birthday.split("-");
        String bd_month = GetTimes.getMonthText(bd[1]);
        
        this.bdYComboBx.setSelectedItem(bd[0]);
        this.bdMComboBx.setSelectedItem(bd_month);
        this.bdDComboBx.setSelectedItem(bd[2]);
    }
    
    public void setContactNumber(String contact_number){
        this.editFamilyContactNumberText.setText(contact_number);
    }
    
    public void setPhoto(String photo){
        Image im = Toolkit.getDefaultToolkit().createImage(photo);
        im = im.getScaledInstance(105, 135, Image.SCALE_SMOOTH);
        ImageIcon imicn = new ImageIcon(im);
        photoContainerLabel.setIcon(imicn);
    }
    
    public void setIdentityCode(String ic){
        this.identityCodeText.setText(ic);
    }
    
    public void setPassportLabel(String psptnmb){
        this.passportNumberText.setText(psptnmb);
    }
    
    public void setDateOfEntarance(String doe){
        String[] date_oe = doe.split("-");
        String doe_month = GetTimes.getMonthText(date_oe[1]);
        doeYComboBx.setSelectedItem(date_oe[0]);
        doeMComboBx.setSelectedItem(doe_month);
        doeDComboBx.setSelectedItem(date_oe[2]);
    }
    
    public void setGradeInYearOfEntarance(String grade){
        GradeController gc = new GradeController();
        String grade_text = gc.get_grade_in_words(Integer.parseInt(grade));
        this.gradeInYEComboBx.setSelectedItem(grade_text);
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
    
    public void studentFamilyInformationTable(int student_id) throws SQLException{
        StudentFamilyMemberController sfmc = new StudentFamilyMemberController();
        HashMap<Integer, Map<Integer,String>> hm = sfmc.getStudentFamilyMembersByStudentId(student_id);
        this.clearTable(editStudentForm_studentFamily_table);
        this.createTable(hm, editStudentForm_studentFamily_table);
    }
    
    public void studentSchoolInformation(int student_id) throws SQLException{
        StudentSchoolController ssc = new StudentSchoolController();
        HashMap<Integer, Map<Integer,String>> hm = ssc.getStudentSchoolDetailsForStudentId(student_id);
        this.clearTable(editStudent_studentSchoolInformation_table);
        this.createTable(hm, editStudent_studentSchoolInformation_table);
    }
    
    public void studentAssesmentPerformance(int student_id) throws SQLException{
        StudentAssesmentExamController saec = new StudentAssesmentExamController();
        HashMap<Integer, Map<Integer,String>> hm = saec.get_student_assesment_exam_details(student_id);
        this.clearTable(editStudentTable_assesmentPerformance_table);
        this.createTable(hm, editStudentTable_assesmentPerformance_table);
    }
    
    public void studentExamPerformance(int student_id) throws SQLException{
        StudentGradeExamController sgec = new StudentGradeExamController();
        HashMap<Integer, Map<Integer,String>> hm = sgec.get_Info_by_student_id(student_id);
        this.clearTable(editStudentForm_examPerformance_table);
        this.createTable(hm, editStudentForm_examPerformance_table);
    }
    
    public void studentMedicalStatusInformation(int student_id){
        StudentMedicalInformationController c = new StudentMedicalInformationController();
        HashMap<Integer, Map<Integer,String>> hm = c.get_student_medical_requirement_info(student_id);
        this.clearTable(editStudentForm_medicalStatus_table);
        this.createTable(hm, editStudentForm_medicalStatus_table);
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
        addressText = new javax.swing.JTextField();
        gradeInYearOfEnteranceLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        gradeInYEComboBx = new javax.swing.JComboBox<>();
        doeYComboBx = new javax.swing.JComboBox<>();
        doeMComboBx = new javax.swing.JComboBox<>();
        doeDComboBx = new javax.swing.JComboBox<>();
        passportNumberText = new javax.swing.JTextField();
        identityCodeText = new javax.swing.JTextField();
        bdYComboBx = new javax.swing.JComboBox<>();
        topicLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        photoContainerLabel = new javax.swing.JLabel();
        addPhotoButton = new javax.swing.JButton();
        identityCodeLabel = new javax.swing.JLabel();
        bdMComboBx = new javax.swing.JComboBox<>();
        passportNumberLabel = new javax.swing.JLabel();
        bdDComboBx = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editStudentForm_studentFamily_table = new javax.swing.JTable();
        familyInfoEditButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        editStudent_studentSchoolInformation_table = new javax.swing.JTable();
        studentSchoolInfoEditButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        editStudentTable_assesmentPerformance_table = new javax.swing.JTable();
        studentAssesmentPerformanceInfoEditButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        editStudentForm_examPerformance_table = new javax.swing.JTable();
        examPerformanceInfoEditButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        editStudentForm_medicalStatus_table = new javax.swing.JTable();
        medicalStatusEditButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        editFamilyContactNumberText = new javax.swing.JTextField();
        familyContactNumberLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        dateOfEnteranceLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dateOfEnteranceLabel.setText("Date of entarance:  ");

        addressText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        gradeInYearOfEnteranceLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        gradeInYearOfEnteranceLabel.setText("Grade in year of entarance:   ");

        nameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        gradeInYEComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        gradeInYEComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05", "Grade 06", "Grade 07", "Grade 08", "Grade 09", "Grade 10", "Grade 11" }));

        doeYComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeYComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", " " }));

        doeMComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeMComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        doeMComboBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doeMComboBxActionPerformed(evt);
            }
        });

        doeDComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeDComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        passportNumberText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        identityCodeText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        bdYComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        bdYComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", " " }));

        topicLabel.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        topicLabel.setText("Edit Student Information");

        nameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        nameLabel.setText("Name:  ");

        addressLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        addressLabel.setText("Address:");

        birthdayLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        birthdayLabel.setText("Birthday:  ");

        photoLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        photoLabel.setText("Photo:");

        photoContainerLabel.setBackground(new java.awt.Color(255, 204, 153));
        photoContainerLabel.setForeground(new java.awt.Color(255, 204, 153));

        addPhotoButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        addPhotoButton.setText("Add photo");
        addPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoButtonActionPerformed(evt);
            }
        });

        identityCodeLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        identityCodeLabel.setText("Identity code:");

        bdMComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        bdMComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        passportNumberLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        passportNumberLabel.setText("Passport number:");

        bdDComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        bdDComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("Update");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        jLabel1.setText("පවුලේ විස්තර");

        editStudentForm_studentFamily_table.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        editStudentForm_studentFamily_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "නෑකම", "නම", "ජාතික හැඳුනුම්පත් අංකය ", "පද්ධති කේතය"
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
        jScrollPane1.setViewportView(editStudentForm_studentFamily_table);

        familyInfoEditButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        familyInfoEditButton.setText("යාවත්කාලීන කිරීම");
        familyInfoEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyInfoEditButtonActionPerformed(evt);
            }
        });

        editStudent_studentSchoolInformation_table.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        editStudent_studentSchoolInformation_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "පාසලේ නම", "ඇතුලත් වූ දිනය", "වර්තමානයේ මෙම පාසලෙහි ඉගෙනුම ලබනවාද යන වග", "ඉවත් වූ දිනය", "පද්ධති කේතය"
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
        jScrollPane2.setViewportView(editStudent_studentSchoolInformation_table);

        studentSchoolInfoEditButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentSchoolInfoEditButton.setText("යාවත්කාලීන කිරීම");
        studentSchoolInfoEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSchoolInfoEditButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        jLabel2.setText("පාසල් තොරතුරු");

        editStudentTable_assesmentPerformance_table.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        editStudentTable_assesmentPerformance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "දිනය සහ වේලාව", "තරඟය", "තරඟාවලිය", "පද්ධති කේතය"
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
        jScrollPane3.setViewportView(editStudentTable_assesmentPerformance_table);

        studentAssesmentPerformanceInfoEditButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        studentAssesmentPerformanceInfoEditButton.setText("යාවත්කාලීන කිරීම");
        studentAssesmentPerformanceInfoEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAssesmentPerformanceInfoEditButtonActionPerformed(evt);
            }
        });

        editStudentForm_examPerformance_table.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        editStudentForm_examPerformance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "දිනය සහ වේලාව", "වසර", "විභාගය", "ලකුණු", "පද්ධති කේතය"
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
        jScrollPane4.setViewportView(editStudentForm_examPerformance_table);

        examPerformanceInfoEditButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        examPerformanceInfoEditButton.setText("යාවත්කාලීන කිරීම");
        examPerformanceInfoEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examPerformanceInfoEditButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        jLabel3.setText("විභාග තොරතුරු");

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        jLabel4.setText("සහභාගී වූ තරඟ පිලිබඳ තොරතුරු");

        editStudentForm_medicalStatus_table.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        editStudentForm_medicalStatus_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "රෝගය", "හඳුනාගත් දිනය", "ප්‍රතිකාර ලද පලමු දිනය", "ප්‍රතිකාර ලද අවසන් දිනය", "පද්ධති කේතය"
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
        jScrollPane5.setViewportView(editStudentForm_medicalStatus_table);

        medicalStatusEditButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        medicalStatusEditButton.setText("යාවත්කාලීන කිරීම");
        medicalStatusEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalStatusEditButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        jLabel5.setText("විශේෂ සෞඛ්‍ය තොරතුරු");

        editFamilyContactNumberText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        familyContactNumberLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        familyContactNumberLabel.setText("Family contact number:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPhotoButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(topicLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addressLabel)
                                            .addComponent(birthdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(nameLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bdYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bdMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bdDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(399, 399, 399)
                                        .addComponent(studentAssesmentPerformanceInfoEditButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dateOfEnteranceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(gradeInYearOfEnteranceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(doeYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(doeMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(doeDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(gradeInYEComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(identityCodeLabel)
                                                .addComponent(passportNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(identityCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passportNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(familyContactNumberLabel)
                                                .addComponent(photoLabel))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(editFamilyContactNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(photoContainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(studentSchoolInfoEditButton))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(familyInfoEditButton))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(examPerformanceInfoEditButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(medicalStatusEditButton)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressText, nameText, passportNumberText});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(topicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(jLabel21))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel)
                    .addComponent(jLabel22))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editFamilyContactNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familyContactNumberLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(photoContainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(photoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPhotoButton)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identityCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identityCodeLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passportNumberLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doeMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doeDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doeYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfEnteranceLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeInYEComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeInYearOfEnteranceLabel)
                    .addComponent(jLabel20))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(familyInfoEditButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentSchoolInfoEditButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentAssesmentPerformanceInfoEditButton)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examPerformanceInfoEditButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicalStatusEditButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addGap(41, 41, 41))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bdDComboBx, bdMComboBx, bdYComboBx});

    }// </editor-fold>//GEN-END:initComponents

    private void addPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoButtonActionPerformed
        // TODO add your handling code here:
        FileFilter filter = new FileNameExtensionFilter("JPEG or PNG file", "jpg", "jpeg", "png");
            final JFileChooser fc = new JFileChooser();
            fc.addChoosableFileFilter(filter);
            fc.setAcceptAllFileFilterUsed(false);
            int returnValue = fc.showOpenDialog(EditStudent.this); 
            
            if(returnValue == JFileChooser.APPROVE_OPTION){
                
                file = fc.getSelectedFile();
                System.out.println("Opening: " + file.getName());
                String path = file.getAbsolutePath();
                //System.out.println(path);
                
                Image im = Toolkit.getDefaultToolkit().createImage(path);
                im = im.getScaledInstance(photoContainerLabel.getWidth(), photoContainerLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon imicn = new ImageIcon(im);
                photoContainerLabel.setIcon(imicn);               
                
            }else{
                System.out.println("Open command cancelled by user");
            }
    }//GEN-LAST:event_addPhotoButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(nameText.getText());
        String stdnt_name = nameText.getText();
        String address = addressText.getText();
        String bYear = bdYComboBx.getSelectedItem().toString();
        String bMonth = bdMComboBx.getSelectedItem().toString();
        String bMonthNumber = GetTimes.getMonthNumber(bMonth);
        String bDay = bdDComboBx.getSelectedItem().toString();
        String birthday = bYear + "-" + bMonthNumber + "- " + bDay;
        String contactNumber = editFamilyContactNumberText.getText();
        String identityCode = identityCodeText.getText();
        String passportNumber = passportNumberText.getText();
        String doeYear = doeYComboBx.getSelectedItem().toString();
        String doeMonth = doeMComboBx.getSelectedItem().toString();
        String doeMonthNumber = GetTimes.getMonthNumber(doeMonth);
        String doeDay = doeDComboBx.getSelectedItem().toString();
        String dateOfEnterance = doeYear + "-" + doeMonthNumber + "-" + doeDay;
        String grade = gradeInYEComboBx.getSelectedItem().toString();
        GradeController gc = new GradeController();
        int grade_id = 0;
        try {
            grade_id = gc.getGradeId(grade);
        } catch (SQLException ex) {
            Logger.getLogger(AddGradeExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        LocalDateTime timenow = LocalDateTime.now();
        Timestamp ts = Timestamp.valueOf(timenow);
        Long ms = ts.getTime();
        String img_newname = student_name + "_" + ms + ".jpg";
        File directory = new File("./img/.");
        String path = directory.getAbsolutePath();
        String file_location = path.substring(0, path.length()-1) + img_newname;
        
        if(!stdnt_name.equals("") && !address.equals("") && grade_id > 0){
            List<String> l = new ArrayList<String>();
            l.add(0, stdnt_name);
            l.add(1, address);
            l.add(2, birthday);
            l.add(3, contactNumber);
            l.add(4, identityCode);
            l.add(5, passportNumber);
            l.add(6, dateOfEnterance);
            l.add(7, Integer.toString(grade_id));
            l.add(8, file_location);
            l.add(9, doeYear+"-01-01");
            l.add(10, Integer.toString(student_id));

            StudentController sc = new StudentController();
            boolean b = sc.updateStudentRecord(l);

            if(b){
                BufferedImage bi;
                try {
                    bi = ImageIO.read(file);
                    File outputfile = new File(file_location);
                    ImageIO.write(bi, "png", outputfile);
                } catch (IOException ex) {
                    Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("The Student record successfully updated");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("The Student record successfully updated.");
                rsm.setVisible(true);
            }else{
                System.out.println("Failed to update the Student record. Please try again");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to update the Student record. Please try again.");
                rem.setVisible(true);
            }
        }else{
            FormValidation fv = new FormValidation();
            fv.set_error_message("Please fill all the required fields before proceed");
            fv.setVisible(true);
        }     
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void doeMComboBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doeMComboBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doeMComboBxActionPerformed

    private void familyInfoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyInfoEditButtonActionPerformed
        // TODO add your handling code here:
        int row = editStudentForm_studentFamily_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) editStudentForm_studentFamily_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 3).toString());
            StudentFamilyMemberController sfmc = new StudentFamilyMemberController();
            List<String> l = new ArrayList<String>();
            try {
                l = sfmc.get_family_member_info_by_id(id);
            } catch (SQLException ex) {
                Logger.getLogger(EditStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            EditStudentFamilyInfo esfi = new EditStudentFamilyInfo(mv, id);
            esfi.set_student_name(l.get(0));
            esfi.set_family_member_name(l.get(1));
            esfi.set_relationship(l.get(2));
            esfi.set_nic(l.get(3));
            esfi.set_fm_birthday(l.get(4));            
            esfi.set_career(l.get(5));
            
            mv.add_new_component(esfi, "Update Student Family Member");
        }
    }//GEN-LAST:event_familyInfoEditButtonActionPerformed

    private void studentSchoolInfoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSchoolInfoEditButtonActionPerformed
        // TODO add your handling code here:
        int row = editStudent_studentSchoolInformation_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) editStudent_studentSchoolInformation_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 4).toString());
            String school_name = dtm.getValueAt(row, 0).toString();
            String doe = dtm.getValueAt(row, 1).toString();
            String is_current_student = dtm.getValueAt(row, 2).toString();
            String dol = dtm.getValueAt(row, 3).toString();
            EditStudentSchoolInfo essi = new EditStudentSchoolInfo(mv, id);
            essi.set_student_name(this.student_name);
            essi.set_school_name(school_name);
            essi.set_date_of_entarance(doe);
            essi.set_is_currently_studing(is_current_student);
            essi.set_date_of_leave(dol);
            
            mv.add_new_component(essi, "Update Student School Information");
        }
    }//GEN-LAST:event_studentSchoolInfoEditButtonActionPerformed

    private void studentAssesmentPerformanceInfoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAssesmentPerformanceInfoEditButtonActionPerformed
        // TODO add your handling code here:
        int row = editStudentTable_assesmentPerformance_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) editStudentTable_assesmentPerformance_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 3).toString());
            String exam = dtm.getValueAt(row, 2).toString();
            String assesment = dtm.getValueAt(row, 1).toString();
            StudentAssesmentExamController ssc = new StudentAssesmentExamController();
            HashMap<Integer, String> hm = new HashMap<Integer, String>();
            try {
                hm = ssc.get_info_by_id(id);
            } catch (SQLException ex) {
                Logger.getLogger(EditStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            EditStudentAssesmentExam view = new EditStudentAssesmentExam(mv, id);
            view.set_student_name(this.student_name);
            view.set_exam(exam);
            view.set_assignment(assesment);
            view.set_marks(hm.get(0));
            view.set_remarks(hm.get(1));
            view.set_description(hm.get(2));
            
            mv.add_new_component(view, "Update Student Exam Assesment");
        }
    }//GEN-LAST:event_studentAssesmentPerformanceInfoEditButtonActionPerformed

    private void examPerformanceInfoEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examPerformanceInfoEditButtonActionPerformed
        // TODO add your handling code here:
        int row = editStudentForm_examPerformance_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) editStudentForm_examPerformance_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 4).toString());
            String grade = dtm.getValueAt(row, 1).toString();
            String exam = dtm.getValueAt(row, 2).toString();
            String marks = dtm.getValueAt(row, 3).toString();
            StudentGradeExamController sgec = new StudentGradeExamController();
            HashMap<Integer, String> hm = sgec.get_info_by_id(id);
            EditStudentGradeExam view = new EditStudentGradeExam(mv, id);
            view.set_student_name(this.student_name);
            view.set_exam(exam);
            view.set_grade(grade);
            view.set_marks(marks);
            view.set_remarks(hm.get(1));
            view.set_description(hm.get(2));
            
            mv.add_new_component(view, "Edit Student Exam performance");
        }
    }//GEN-LAST:event_examPerformanceInfoEditButtonActionPerformed

    private void medicalStatusEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalStatusEditButtonActionPerformed
        // TODO add your handling code here:
        int row = editStudentForm_medicalStatus_table.getSelectedRow();
        if(row > -1){
            DefaultTableModel dtm = (DefaultTableModel) editStudentForm_medicalStatus_table.getModel();
            int id = Integer.parseInt(dtm.getValueAt(row, 4).toString());
            String desease = dtm.getValueAt(row, 0).toString();
            String fdod = dtm.getValueAt(row, 1).toString();
            String fdogt = dtm.getValueAt(row, 2).toString();
            String ldogt = dtm.getValueAt(row, 3).toString();
            StudentMedicalInformationController smic = new StudentMedicalInformationController();
            try {
                String details = smic.get_std_details_by_id(id);
                EditStudentMedicalRequirement view = new EditStudentMedicalRequirement(mv, id);
                view.set_student_name(this.student_name);
                view.set_medical_requirement(desease);
                view.set_first_date_of_diagnose(fdod);
                view.set_first_date_of_getting_treatment(fdogt);
                view.set_last_date_of_treatment(ldogt);
                view.set_details(details);

                mv.add_new_component(view, "Update Student Medical Status");
            } catch (SQLException ex) {
                Logger.getLogger(ViewStudent_fromList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_medicalStatusEditButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.mv.close_tab();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhotoButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JComboBox<String> bdDComboBx;
    private javax.swing.JComboBox<String> bdMComboBx;
    private javax.swing.JComboBox<String> bdYComboBx;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateOfEnteranceLabel;
    private javax.swing.JComboBox<String> doeDComboBx;
    private javax.swing.JComboBox<String> doeMComboBx;
    private javax.swing.JComboBox<String> doeYComboBx;
    private javax.swing.JTextField editFamilyContactNumberText;
    private javax.swing.JTable editStudentForm_examPerformance_table;
    private javax.swing.JTable editStudentForm_medicalStatus_table;
    private javax.swing.JTable editStudentForm_studentFamily_table;
    private javax.swing.JTable editStudentTable_assesmentPerformance_table;
    private javax.swing.JTable editStudent_studentSchoolInformation_table;
    private javax.swing.JButton examPerformanceInfoEditButton;
    private javax.swing.JLabel familyContactNumberLabel;
    private javax.swing.JButton familyInfoEditButton;
    private javax.swing.JComboBox<String> gradeInYEComboBx;
    private javax.swing.JLabel gradeInYearOfEnteranceLabel;
    private javax.swing.JLabel identityCodeLabel;
    private javax.swing.JTextField identityCodeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton medicalStatusEditButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel passportNumberLabel;
    private javax.swing.JTextField passportNumberText;
    private javax.swing.JLabel photoContainerLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton studentAssesmentPerformanceInfoEditButton;
    private javax.swing.JButton studentSchoolInfoEditButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

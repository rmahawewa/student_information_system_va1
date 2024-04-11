/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Add;

import UserLibraries.GetTimes;
import Controller.GradeController;
import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.StudentController;
import View.MessageBox.FormValidation;
import View.MessageBox.Result_ErrorMessage;
import View.MessageBox.Result_SuccessMessage;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP
 */
public class AddStudent extends javax.swing.JPanel {
    
    private File file = null;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        loadGrades();
    }
    
    public void loadGrades(){
        GradeController gc = new GradeController();
        try {
            HashMap<Integer, Map<Integer,String>> hm = gc.getAllGrades();
            if(!hm.isEmpty()){
                hm.forEach((key,value) -> {
                    gradeInYEComboBx.addItem(value.get(1));
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddGradeExam.class.getName()).log(Level.SEVERE, null, ex);
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
        clearButton = new javax.swing.JButton();
        contactNumberText = new javax.swing.JTextField();
        addressLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        dateOfEnteranceLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        dateOfEnteranceLabel.setText("ඇතුලත් වීමේ දිනය:");

        addressText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        gradeInYearOfEnteranceLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        gradeInYearOfEnteranceLabel.setText("සිසුවා ඇතුලත් වූ වර්ෂයේදී සිටී වසර:");

        nameText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        gradeInYEComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        doeYComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeYComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", " " }));

        doeMComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        doeMComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));
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
        topicLabel.setText("ශිෂ්‍ය විස්තර ඇතුලත් කිරීම");

        nameLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        nameLabel.setText("නම:");

        addressLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        addressLabel.setText("ලිපිනය:");

        birthdayLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        birthdayLabel.setText("උපන් දිනය:");

        photoLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        photoLabel.setText("ඡායාරූපය:");

        photoContainerLabel.setBackground(new java.awt.Color(255, 204, 153));
        photoContainerLabel.setForeground(new java.awt.Color(255, 204, 153));

        addPhotoButton.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        addPhotoButton.setText("ඡායා රූපය තෝරන්න");
        addPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoButtonActionPerformed(evt);
            }
        });

        identityCodeLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        identityCodeLabel.setText("ඇතුලත් වීමේ අංකය:");

        bdMComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        bdMComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "දුරුතු", "නවම්", "මැදින්", "බක්", "වෙසක්", "පොසොන්", "ඇසල", "නිකිනි", "බිනර", "වප්", "ඉල්", "උදුවප්" }));

        passportNumberLabel.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        passportNumberLabel.setText("විදේශ ගමන් බලපත්‍ර අංකය:");

        bdDComboBx.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        bdDComboBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        submitButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        submitButton.setText("යොමු කරන්න");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        clearButton.setText("මකා දමන්න");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        contactNumberText.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

        addressLabel1.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        addressLabel1.setText("පවුලේ දුරකතන අංකය:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(submitButton)
                .addGap(87, 87, 87)
                .addComponent(clearButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passportNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfEnteranceLabel)
                            .addComponent(identityCodeLabel)
                            .addComponent(gradeInYearOfEnteranceLabel)
                            .addComponent(addressLabel)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdayLabel)
                            .addComponent(photoLabel)
                            .addComponent(addressLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gradeInYEComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bdYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bdMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bdDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(doeYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(doeMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(doeDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(photoContainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addPhotoButton))
                                    .addComponent(passportNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                    .addComponent(identityCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                    .addComponent(nameText)))
                            .addComponent(contactNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressText, identityCodeText, nameText, passportNumberText});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(topicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayLabel)
                    .addComponent(jLabel14))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contactNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(photoContainerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addPhotoButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(photoLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identityCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identityCodeLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportNumberLabel)
                    .addComponent(passportNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfEnteranceLabel)
                    .addComponent(doeMComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doeDComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doeYComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeInYearOfEnteranceLabel)
                    .addComponent(gradeInYEComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(clearButton))
                .addGap(45, 45, 45))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bdDComboBx, bdMComboBx, bdYComboBx});

    }// </editor-fold>//GEN-END:initComponents

    private void clear_form(){
    
        this.nameText.setText("");
        this.addressText.setText("");
        this.bdYComboBx.setSelectedIndex(0);
        this.bdMComboBx.setSelectedIndex(0);
        this.bdDComboBx.setSelectedIndex(0);
        this.contactNumberText.setText("");
        this.photoContainerLabel.setIcon(null);
        this.file = null;
        this.identityCodeText.setText("");
        this.passportNumberText.setText("");
        //String today = GetTimes.getCurrentDay();
        String[] day = GetTimes.getDateWithMonthName(String.valueOf(LocalDateTime.now()));
        this.doeYComboBx.setSelectedItem(day[0]);
        this.doeMComboBx.setSelectedItem(day[1]);
        this.doeDComboBx.setSelectedItem(day[2]);
        this.gradeInYEComboBx.setSelectedIndex(0);
    }
    
    private void addPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoButtonActionPerformed
        // TODO add your handling code here:
            FileFilter filter = new FileNameExtensionFilter("JPEG or PNG file", "jpg", "jpeg", "png");
            final JFileChooser fc = new JFileChooser();
            fc.addChoosableFileFilter(filter);
            fc.setAcceptAllFileFilterUsed(false);
            int returnValue = fc.showOpenDialog(AddStudent.this); 
            
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
        String student_name = nameText.getText();
        String address = addressText.getText();
        String bYear = bdYComboBx.getSelectedItem().toString();
        String bMonth = bdMComboBx.getSelectedItem().toString();
        String bMonthNumber = GetTimes.getMonthNumber(bMonth);
        String bDay = bdDComboBx.getSelectedItem().toString();
        String birthday = bYear + "-" + bMonthNumber + "- " + bDay;
        String contactNumber = contactNumberText.getText();
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
        
        if(!student_name.equals("") && !address.equals("") && grade_id > 0){
            List<String> l = new ArrayList<String>();
            l.add(0, student_name);
            l.add(1, address);
            l.add(2, birthday);
            l.add(3, contactNumber);
            l.add(4, identityCode);
            l.add(5, passportNumber);
            l.add(6, dateOfEnterance);
            l.add(7, Integer.toString(grade_id));
            l.add(8, file_location);
            l.add(9, doeYear+"-01-01");

            StudentController sc = new StudentController();
            boolean b = sc.addStudentRecord(l);

            if(b){
                BufferedImage bi;
                try {
                    bi = ImageIO.read(file);
                    File outputfile = new File(file_location);
                    ImageIO.write(bi, "png", outputfile);
                } catch (IOException ex) {
                    Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("The Student record successfully created");
                Result_SuccessMessage rsm = new Result_SuccessMessage();
                rsm.setMessage("The Student record successfully created.");
                rsm.setVisible(true);
                this.clear_form();
            }else{
                System.out.println("Failed to create the Student record");
                Result_ErrorMessage rem = new Result_ErrorMessage();
                rem.setMessage("Failed to create the Student record. Please try again.");
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

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.clear_form();
    }//GEN-LAST:event_clearButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhotoButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JTextField addressText;
    private javax.swing.JComboBox<String> bdDComboBx;
    private javax.swing.JComboBox<String> bdMComboBx;
    private javax.swing.JComboBox<String> bdYComboBx;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField contactNumberText;
    private javax.swing.JLabel dateOfEnteranceLabel;
    private javax.swing.JComboBox<String> doeDComboBx;
    private javax.swing.JComboBox<String> doeMComboBx;
    private javax.swing.JComboBox<String> doeYComboBx;
    private javax.swing.JComboBox<String> gradeInYEComboBx;
    private javax.swing.JLabel gradeInYearOfEnteranceLabel;
    private javax.swing.JLabel identityCodeLabel;
    private javax.swing.JTextField identityCodeText;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel passportNumberLabel;
    private javax.swing.JTextField passportNumberText;
    private javax.swing.JLabel photoContainerLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topicLabel;
    // End of variables declaration//GEN-END:variables
}

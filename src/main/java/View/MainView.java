/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import View.*;
import View.Add.*;
import View.List.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 *
 * @author HP
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initialTabbedPane = new javax.swing.JTabbedPane();
        mainView_ScrollPane = new javax.swing.JScrollPane();
        menuBar = new javax.swing.JMenuBar();
        l1_student_menu = new javax.swing.JMenu();
        l2_addStudent_menuItem = new javax.swing.JMenuItem();
        l2_listStudents_menuItem = new javax.swing.JMenuItem();
        l2_viewStudent_menuItem = new javax.swing.JMenuItem();
        l2_studentMedicalRequirement_menu = new javax.swing.JMenu();
        l3_addStudentMedicalRequirement_menuItem = new javax.swing.JMenuItem();
        l3_listStudentsMedicalRequirements_menuItem = new javax.swing.JMenuItem();
        l2_student_oldStudentList_menuItem = new javax.swing.JMenuItem();
        l1_exam_menu = new javax.swing.JMenu();
        l2_addExam_menuItem = new javax.swing.JMenuItem();
        l2_listExams_menuItem = new javax.swing.JMenuItem();
        l1_grade_menu = new javax.swing.JMenu();
        l2_addGrade_menuItem = new javax.swing.JMenuItem();
        l2_listGrade_menuItem = new javax.swing.JMenuItem();
        l1_assesment_menu = new javax.swing.JMenu();
        l2_addAssesment_menuItem = new javax.swing.JMenuItem();
        l2_listAssesment_menuItem = new javax.swing.JMenuItem();
        l1_assesmentInExam_menu = new javax.swing.JMenu();
        l2_listAssesmentInExam_menuItem = new javax.swing.JMenuItem();
        l1_examForGrades_menu = new javax.swing.JMenu();
        l2_listExamForGrades_menuItem = new javax.swing.JMenuItem();
        l1_studentPerformance_menu = new javax.swing.JMenu();
        l2_gradeViseExamStudentPerformance_menu = new javax.swing.JMenu();
        l3_listGVESP_menuItem = new javax.swing.JMenuItem();
        l3_viewGVESP_menuItem = new javax.swing.JMenuItem();
        l3_editGVESP_menuItem = new javax.swing.JMenuItem();
        l2_studentPerformanceAssesment_menu = new javax.swing.JMenu();
        l3_listSPA_menuItem = new javax.swing.JMenuItem();
        l3_viewSPA_menuItem = new javax.swing.JMenuItem();
        l3_editSPA_menuItem = new javax.swing.JMenuItem();
        l1_school_menu = new javax.swing.JMenu();
        l2_addSchool_menuItem = new javax.swing.JMenuItem();
        l2_listSchools_menuItem = new javax.swing.JMenuItem();
        l1_medicalRequirement_menu = new javax.swing.JMenu();
        l2_addMedicalRequirement_menuItem = new javax.swing.JMenuItem();
        l2_listMedicalRequirement_menuItem = new javax.swing.JMenuItem();
        l1_settings_menu = new javax.swing.JMenu();
        l2_userSettings_menuItem = new javax.swing.JMenuItem();
        l2_adminS_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");
        setResizable(false);

        initialTabbedPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                initialTabbedPaneKeyPressed(evt);
            }
        });
        initialTabbedPane.addTab("Hello", mainView_ScrollPane);

        l1_student_menu.setText("Student");

        l2_addStudent_menuItem.setText("Add");
        l2_addStudent_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_addStudent_menuItemActionPerformed(evt);
            }
        });
        l1_student_menu.add(l2_addStudent_menuItem);

        l2_listStudents_menuItem.setText("List");
        l2_listStudents_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listStudents_menuItemActionPerformed(evt);
            }
        });
        l1_student_menu.add(l2_listStudents_menuItem);

        l2_viewStudent_menuItem.setText("View");
        l1_student_menu.add(l2_viewStudent_menuItem);

        l2_studentMedicalRequirement_menu.setText("Medical Requirements");

        l3_addStudentMedicalRequirement_menuItem.setText("Add");
        l3_addStudentMedicalRequirement_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3_addStudentMedicalRequirement_menuItemActionPerformed(evt);
            }
        });
        l2_studentMedicalRequirement_menu.add(l3_addStudentMedicalRequirement_menuItem);

        l3_listStudentsMedicalRequirements_menuItem.setText("List");
        l2_studentMedicalRequirement_menu.add(l3_listStudentsMedicalRequirements_menuItem);

        l1_student_menu.add(l2_studentMedicalRequirement_menu);

        l2_student_oldStudentList_menuItem.setText("Old Students List");
        l2_student_oldStudentList_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_student_oldStudentList_menuItemActionPerformed(evt);
            }
        });
        l1_student_menu.add(l2_student_oldStudentList_menuItem);

        menuBar.add(l1_student_menu);

        l1_exam_menu.setText("Exam");

        l2_addExam_menuItem.setText("Add");
        l2_addExam_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_addExam_menuItemActionPerformed(evt);
            }
        });
        l1_exam_menu.add(l2_addExam_menuItem);

        l2_listExams_menuItem.setText("List");
        l2_listExams_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listExams_menuItemActionPerformed(evt);
            }
        });
        l1_exam_menu.add(l2_listExams_menuItem);

        menuBar.add(l1_exam_menu);

        l1_grade_menu.setText("Grade");

        l2_addGrade_menuItem.setText("Add");
        l2_addGrade_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_addGrade_menuItemActionPerformed(evt);
            }
        });
        l1_grade_menu.add(l2_addGrade_menuItem);

        l2_listGrade_menuItem.setText("List");
        l2_listGrade_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listGrade_menuItemActionPerformed(evt);
            }
        });
        l1_grade_menu.add(l2_listGrade_menuItem);

        menuBar.add(l1_grade_menu);

        l1_assesment_menu.setText("Assesment");

        l2_addAssesment_menuItem.setText("Add");
        l2_addAssesment_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_addAssesment_menuItemActionPerformed(evt);
            }
        });
        l1_assesment_menu.add(l2_addAssesment_menuItem);

        l2_listAssesment_menuItem.setText("List");
        l2_listAssesment_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listAssesment_menuItemActionPerformed(evt);
            }
        });
        l1_assesment_menu.add(l2_listAssesment_menuItem);

        menuBar.add(l1_assesment_menu);

        l1_assesmentInExam_menu.setText("Assesment in Exam");

        l2_listAssesmentInExam_menuItem.setText("List             ");
        l2_listAssesmentInExam_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listAssesmentInExam_menuItemActionPerformed(evt);
            }
        });
        l1_assesmentInExam_menu.add(l2_listAssesmentInExam_menuItem);

        menuBar.add(l1_assesmentInExam_menu);

        l1_examForGrades_menu.setText("Exam for Grades");

        l2_listExamForGrades_menuItem.setText("List");
        l2_listExamForGrades_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listExamForGrades_menuItemActionPerformed(evt);
            }
        });
        l1_examForGrades_menu.add(l2_listExamForGrades_menuItem);

        menuBar.add(l1_examForGrades_menu);

        l1_studentPerformance_menu.setText("Student Performance");

        l2_gradeViseExamStudentPerformance_menu.setText("Grade vise Exam");

        l3_listGVESP_menuItem.setText("List");
        l3_listGVESP_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3_listGVESP_menuItemActionPerformed(evt);
            }
        });
        l2_gradeViseExamStudentPerformance_menu.add(l3_listGVESP_menuItem);

        l3_viewGVESP_menuItem.setText("View");
        l2_gradeViseExamStudentPerformance_menu.add(l3_viewGVESP_menuItem);

        l3_editGVESP_menuItem.setText("Edit");
        l2_gradeViseExamStudentPerformance_menu.add(l3_editGVESP_menuItem);

        l1_studentPerformance_menu.add(l2_gradeViseExamStudentPerformance_menu);

        l2_studentPerformanceAssesment_menu.setText("Assesment");

        l3_listSPA_menuItem.setText("List");
        l3_listSPA_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3_listSPA_menuItemActionPerformed(evt);
            }
        });
        l2_studentPerformanceAssesment_menu.add(l3_listSPA_menuItem);

        l3_viewSPA_menuItem.setText("View");
        l2_studentPerformanceAssesment_menu.add(l3_viewSPA_menuItem);

        l3_editSPA_menuItem.setText("Edit");
        l2_studentPerformanceAssesment_menu.add(l3_editSPA_menuItem);

        l1_studentPerformance_menu.add(l2_studentPerformanceAssesment_menu);

        menuBar.add(l1_studentPerformance_menu);

        l1_school_menu.setText("School");

        l2_addSchool_menuItem.setText("Add School");
        l2_addSchool_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_addSchool_menuItemActionPerformed(evt);
            }
        });
        l1_school_menu.add(l2_addSchool_menuItem);

        l2_listSchools_menuItem.setText("List Schools");
        l2_listSchools_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listSchools_menuItemActionPerformed(evt);
            }
        });
        l1_school_menu.add(l2_listSchools_menuItem);

        menuBar.add(l1_school_menu);

        l1_medicalRequirement_menu.setText("Medical Requirement");

        l2_addMedicalRequirement_menuItem.setText("Add");
        l2_addMedicalRequirement_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_addMedicalRequirement_menuItemActionPerformed(evt);
            }
        });
        l1_medicalRequirement_menu.add(l2_addMedicalRequirement_menuItem);

        l2_listMedicalRequirement_menuItem.setText("List");
        l2_listMedicalRequirement_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2_listMedicalRequirement_menuItemActionPerformed(evt);
            }
        });
        l1_medicalRequirement_menu.add(l2_listMedicalRequirement_menuItem);

        menuBar.add(l1_medicalRequirement_menu);

        l1_settings_menu.setText("Settings");

        l2_userSettings_menuItem.setText("User");
        l1_settings_menu.add(l2_userSettings_menuItem);

        l2_adminS_menuItem.setText("Admin");
        l1_settings_menu.add(l2_adminS_menuItem);

        menuBar.add(l1_settings_menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(initialTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(initialTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void add_new_component(JPanel panel, String topic){
        int tab_count = initialTabbedPane.getTabCount();
        if(tab_count>1){
            initialTabbedPane.removeTabAt(tab_count-1);
        }        
        JScrollPane sp = new JScrollPane();
        sp.setViewportView(panel);
        initialTabbedPane.addTab(topic, sp);
        
    }
    
    private void l3_listSPA_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3_listSPA_menuItemActionPerformed
        // TODO add your handling code here:
        StudentAssesmentExamList sae = new StudentAssesmentExamList();
        this.mainView_ScrollPane.setViewportView(sae);
    }//GEN-LAST:event_l3_listSPA_menuItemActionPerformed

    private void l3_addStudentMedicalRequirement_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3_addStudentMedicalRequirement_menuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l3_addStudentMedicalRequirement_menuItemActionPerformed

    private void l2_listExamForGrades_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listExamForGrades_menuItemActionPerformed
        // TODO add your handling code here:
        GradeExamList gel = new GradeExamList();
        this.mainView_ScrollPane.setViewportView(gel);
    }//GEN-LAST:event_l2_listExamForGrades_menuItemActionPerformed

    private void l2_addStudent_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_addStudent_menuItemActionPerformed
        // TODO add your handling code here:
        AddStudent adst = new AddStudent();
        this.mainView_ScrollPane.setViewportView(adst);
    }//GEN-LAST:event_l2_addStudent_menuItemActionPerformed

    private void l2_addAssesment_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_addAssesment_menuItemActionPerformed
        // TODO add your handling code here:
        AddAssesment addasmnt = new AddAssesment();
        this.mainView_ScrollPane.setViewportView(addasmnt);
    }//GEN-LAST:event_l2_addAssesment_menuItemActionPerformed

    private void l2_addExam_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_addExam_menuItemActionPerformed
        // TODO add your handling code here:
        AddExam adem = new AddExam();
        this.mainView_ScrollPane.setViewportView(adem);
    }//GEN-LAST:event_l2_addExam_menuItemActionPerformed

    private void l2_addGrade_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_addGrade_menuItemActionPerformed
        // TODO add your handling code here:
        AddGradeInfo agin = new AddGradeInfo();
        this.mainView_ScrollPane.setViewportView(agin);
    }//GEN-LAST:event_l2_addGrade_menuItemActionPerformed

    private void l2_addSchool_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_addSchool_menuItemActionPerformed
        // TODO add your handling code here:
        AddSchoolInfo asin = new AddSchoolInfo();
        this.mainView_ScrollPane.setViewportView(asin);
    }//GEN-LAST:event_l2_addSchool_menuItemActionPerformed

    private void l2_addMedicalRequirement_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_addMedicalRequirement_menuItemActionPerformed
        // TODO add your handling code here:
        AddMedicalRequirements amrs = new AddMedicalRequirements();
        this.mainView_ScrollPane.setViewportView(amrs);
    }//GEN-LAST:event_l2_addMedicalRequirement_menuItemActionPerformed

    private void l2_listStudents_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listStudents_menuItemActionPerformed
        // TODO add your handling code here:
        StudentList stlst = new StudentList();
        this.mainView_ScrollPane.setViewportView(stlst);
    }//GEN-LAST:event_l2_listStudents_menuItemActionPerformed

    private void l2_listExams_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listExams_menuItemActionPerformed
        // TODO add your handling code here:
        ExamList exmlst = new ExamList(this);
        this.mainView_ScrollPane.setViewportView(exmlst);
    }//GEN-LAST:event_l2_listExams_menuItemActionPerformed

    private void l2_listGrade_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listGrade_menuItemActionPerformed
        // TODO add your handling code here:
        GradeList gl = new GradeList();
        this.mainView_ScrollPane.setViewportView(gl);
    }//GEN-LAST:event_l2_listGrade_menuItemActionPerformed

    private void l2_listAssesment_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listAssesment_menuItemActionPerformed
        // TODO add your handling code here:
        AssesmentList asmntlst = new AssesmentList();
        this.mainView_ScrollPane.setViewportView(asmntlst);
    }//GEN-LAST:event_l2_listAssesment_menuItemActionPerformed

    private void l2_listAssesmentInExam_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listAssesmentInExam_menuItemActionPerformed
        // TODO add your handling code here:
        ListOfAssesmentsInExams ael = new ListOfAssesmentsInExams();
        this.mainView_ScrollPane.setViewportView(ael);
    }//GEN-LAST:event_l2_listAssesmentInExam_menuItemActionPerformed

    private void l3_listGVESP_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3_listGVESP_menuItemActionPerformed
        // TODO add your handling code here:
        StudentGradeExamList sgel = new StudentGradeExamList();
        this.mainView_ScrollPane.setViewportView(sgel);
    }//GEN-LAST:event_l3_listGVESP_menuItemActionPerformed

    private void l2_listSchools_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listSchools_menuItemActionPerformed
        // TODO add your handling code here:
        SchoolList sl = new SchoolList();
        this.mainView_ScrollPane.setViewportView(sl);
    }//GEN-LAST:event_l2_listSchools_menuItemActionPerformed

    private void l2_listMedicalRequirement_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_listMedicalRequirement_menuItemActionPerformed
        // TODO add your handling code here:
        MedicalStatusesList msl = new MedicalStatusesList();
        this.mainView_ScrollPane.setViewportView(msl);
    }//GEN-LAST:event_l2_listMedicalRequirement_menuItemActionPerformed

    private void l2_student_oldStudentList_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2_student_oldStudentList_menuItemActionPerformed
        // TODO add your handling code here:
        OldStudentList osl = new OldStudentList();
        this.mainView_ScrollPane.setViewportView(osl);
    }//GEN-LAST:event_l2_student_oldStudentList_menuItemActionPerformed

    private void initialTabbedPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_initialTabbedPaneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialTabbedPaneKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane initialTabbedPane;
    private javax.swing.JMenu l1_assesmentInExam_menu;
    private javax.swing.JMenu l1_assesment_menu;
    private javax.swing.JMenu l1_examForGrades_menu;
    private javax.swing.JMenu l1_exam_menu;
    private javax.swing.JMenu l1_grade_menu;
    private javax.swing.JMenu l1_medicalRequirement_menu;
    private javax.swing.JMenu l1_school_menu;
    private javax.swing.JMenu l1_settings_menu;
    private javax.swing.JMenu l1_studentPerformance_menu;
    private javax.swing.JMenu l1_student_menu;
    private javax.swing.JMenuItem l2_addAssesment_menuItem;
    private javax.swing.JMenuItem l2_addExam_menuItem;
    private javax.swing.JMenuItem l2_addGrade_menuItem;
    private javax.swing.JMenuItem l2_addMedicalRequirement_menuItem;
    private javax.swing.JMenuItem l2_addSchool_menuItem;
    private javax.swing.JMenuItem l2_addStudent_menuItem;
    private javax.swing.JMenuItem l2_adminS_menuItem;
    private javax.swing.JMenu l2_gradeViseExamStudentPerformance_menu;
    private javax.swing.JMenuItem l2_listAssesmentInExam_menuItem;
    private javax.swing.JMenuItem l2_listAssesment_menuItem;
    private javax.swing.JMenuItem l2_listExamForGrades_menuItem;
    private javax.swing.JMenuItem l2_listExams_menuItem;
    private javax.swing.JMenuItem l2_listGrade_menuItem;
    private javax.swing.JMenuItem l2_listMedicalRequirement_menuItem;
    private javax.swing.JMenuItem l2_listSchools_menuItem;
    private javax.swing.JMenuItem l2_listStudents_menuItem;
    private javax.swing.JMenu l2_studentMedicalRequirement_menu;
    private javax.swing.JMenu l2_studentPerformanceAssesment_menu;
    private javax.swing.JMenuItem l2_student_oldStudentList_menuItem;
    private javax.swing.JMenuItem l2_userSettings_menuItem;
    private javax.swing.JMenuItem l2_viewStudent_menuItem;
    private javax.swing.JMenuItem l3_addStudentMedicalRequirement_menuItem;
    private javax.swing.JMenuItem l3_editGVESP_menuItem;
    private javax.swing.JMenuItem l3_editSPA_menuItem;
    private javax.swing.JMenuItem l3_listGVESP_menuItem;
    private javax.swing.JMenuItem l3_listSPA_menuItem;
    private javax.swing.JMenuItem l3_listStudentsMedicalRequirements_menuItem;
    private javax.swing.JMenuItem l3_viewGVESP_menuItem;
    private javax.swing.JMenuItem l3_viewSPA_menuItem;
    private javax.swing.JScrollPane mainView_ScrollPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}

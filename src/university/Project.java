package university;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Project extends javax.swing.JFrame 
{

    //constructor
    public Project() 
    {
        initComponents();
        
        setSize(1540, 850);
                
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1500,750);
        add(image);
        
        setResizable(false); //μέθοδος που την χρησιμοποιούμε για να διασφαλίσουμε ότι δεν θα αλλάζει το μέγεθος του
        //παραθύρου. Αν η παράμετρος είναι false τότε δεν μπορεί να το αλλάξει ο χρήστης, το χρησιμοποίησα γιατί 
        //μετά το Login άνοιγε το παράθυρο του Project κάτω αριστερά και έπρεπε να το μεγαλώσεις για να ανοίξει 
        //κανονικά
        
        setVisible(true); //για να είναι το παράθυρο ορατό
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mb = new javax.swing.JMenuBar();
        newInformation = new javax.swing.JMenu();
        facultyInfo = new javax.swing.JMenuItem();
        studentInfo = new javax.swing.JMenuItem();
        details = new javax.swing.JMenu();
        facultydetails = new javax.swing.JMenuItem();
        studentdetails = new javax.swing.JMenuItem();
        leave = new javax.swing.JMenu();
        facultyleave = new javax.swing.JMenuItem();
        studentleave = new javax.swing.JMenuItem();
        leaveDetails = new javax.swing.JMenu();
        facultyleavedetails = new javax.swing.JMenuItem();
        studentleavedetails = new javax.swing.JMenuItem();
        exam = new javax.swing.JMenu();
        examinationdetails = new javax.swing.JMenuItem();
        entermarks = new javax.swing.JMenuItem();
        updateinfo = new javax.swing.JMenu();
        updatefacultyinfo = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenu();
        ex = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");

        newInformation.setText("New Information");
        newInformation.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        facultyInfo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        facultyInfo.setText("New faculty Information");
        facultyInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyInfoActionPerformed(evt);
            }
        });
        newInformation.add(facultyInfo);

        studentInfo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        studentInfo.setText("New Student Information");
        studentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentInfoActionPerformed(evt);
            }
        });
        newInformation.add(studentInfo);

        mb.add(newInformation);

        details.setText("View Details");
        details.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        facultydetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        facultydetails.setText("View Faculty Details");
        facultydetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultydetailsActionPerformed(evt);
            }
        });
        details.add(facultydetails);

        studentdetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        studentdetails.setText("View Student Details");
        studentdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentdetailsActionPerformed(evt);
            }
        });
        details.add(studentdetails);

        mb.add(details);

        leave.setText("Apply Leave");
        leave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        facultyleave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        facultyleave.setText("Faculty Leave");
        facultyleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyleaveActionPerformed(evt);
            }
        });
        leave.add(facultyleave);

        studentleave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        studentleave.setText("Student Leave");
        studentleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentleaveActionPerformed(evt);
            }
        });
        leave.add(studentleave);

        mb.add(leave);

        leaveDetails.setText("Leave Details");
        leaveDetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        facultyleavedetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        facultyleavedetails.setText("Faculty Leave Details");
        facultyleavedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyleavedetailsActionPerformed(evt);
            }
        });
        leaveDetails.add(facultyleavedetails);

        studentleavedetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        studentleavedetails.setText("Student Leave Details");
        studentleavedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentleavedetailsActionPerformed(evt);
            }
        });
        leaveDetails.add(studentleavedetails);

        mb.add(leaveDetails);

        exam.setText("Examination");
        exam.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        examinationdetails.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        examinationdetails.setText("Examination Results");
        examinationdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinationdetailsActionPerformed(evt);
            }
        });
        exam.add(examinationdetails);

        entermarks.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        entermarks.setText("Enter Marks");
        entermarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entermarksActionPerformed(evt);
            }
        });
        exam.add(entermarks);

        mb.add(exam);

        updateinfo.setText("Update Details");
        updateinfo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        updatefacultyinfo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        updatefacultyinfo.setText("Update Faculty Details");
        updatefacultyinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatefacultyinfoActionPerformed(evt);
            }
        });
        updateinfo.add(updatefacultyinfo);

        jMenuItem3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jMenuItem3.setText("Update Student Details");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        updateinfo.add(jMenuItem3);

        mb.add(updateinfo);

        exit.setText("Exit");
        exit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        ex.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ex.setText("Exit");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        exit.add(ex);

        mb.add(exit);

        setJMenuBar(mb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facultyInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyInfoActionPerformed
        // New Faculty Information code
        new AddTeacher();
    }//GEN-LAST:event_facultyInfoActionPerformed

    private void studentdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentdetailsActionPerformed
        // View student details code
        new StudentDetails();
    }//GEN-LAST:event_studentdetailsActionPerformed

    private void facultydetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultydetailsActionPerformed
        // View faculty details code
        new TeacherDetails();
    }//GEN-LAST:event_facultydetailsActionPerformed

    private void studentleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentleaveActionPerformed
        // Faculty leave code
        new StudentLeave();
    }//GEN-LAST:event_studentleaveActionPerformed

    private void facultyleavedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyleavedetailsActionPerformed
        // Faculty leave details code
        new TeacherLeaveDetails();
    }//GEN-LAST:event_facultyleavedetailsActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Update Student code
        new UpdateStudent();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void updatefacultyinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatefacultyinfoActionPerformed
        // Update Faculty code
        new UpdateTeacher();
    }//GEN-LAST:event_updatefacultyinfoActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        setVisible(false); //εάν επιλέξουμε exit τότε το παράθυρο κλείνει
    }//GEN-LAST:event_exActionPerformed

    private void studentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentInfoActionPerformed
        // New Student Information
        new AddStudent();
    }//GEN-LAST:event_studentInfoActionPerformed

    private void facultyleaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyleaveActionPerformed
        // Faculty leave code
        new TeacherLeave();
    }//GEN-LAST:event_facultyleaveActionPerformed

    private void studentleavedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentleavedetailsActionPerformed
        // Student Leave Details code
        new StudentLeaveDetails();
    }//GEN-LAST:event_studentleavedetailsActionPerformed

    private void entermarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entermarksActionPerformed
        // enter Marks code
        new EnterMarks();
    }//GEN-LAST:event_entermarksActionPerformed

    private void examinationdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinationdetailsActionPerformed
        // Examination Details code
        new ExaminationResults();
    }//GEN-LAST:event_examinationdetailsActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu details;
    private javax.swing.JMenuItem entermarks;
    private javax.swing.JMenuItem ex;
    private javax.swing.JMenu exam;
    private javax.swing.JMenuItem examinationdetails;
    private javax.swing.JMenu exit;
    private javax.swing.JMenuItem facultyInfo;
    private javax.swing.JMenuItem facultydetails;
    private javax.swing.JMenuItem facultyleave;
    private javax.swing.JMenuItem facultyleavedetails;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu leave;
    private javax.swing.JMenu leaveDetails;
    private javax.swing.JMenuBar mb;
    private javax.swing.JMenu newInformation;
    private javax.swing.JMenuItem studentInfo;
    private javax.swing.JMenuItem studentdetails;
    private javax.swing.JMenuItem studentleave;
    private javax.swing.JMenuItem studentleavedetails;
    private javax.swing.JMenuItem updatefacultyinfo;
    private javax.swing.JMenu updateinfo;
    // End of variables declaration//GEN-END:variables

    
}

package university;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.util.*;
import javax.swing.*;

public class AddStudent extends javax.swing.JFrame 
{
    
    Random ran=new Random(); //δημιουργώ ένα αντικείμενο της κλάσης Random
    long first4=Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    JDateChooser date;
    
    //constructor
    public AddStudent() 
    {
        initComponents();
        
        setLocation(300, 200);
        
        //με τις 3 επόμενες εντολές δημιουργούμε ένα αντικείμενο date της κλάσης JDateChooser έτσι ώστε να 
        //δημιουργήσουμε ένα ημερολόγιο κάνω import το jar file jcalendar-tz και το προσθέτουμε στο παράθυρο
        date=new JDateChooser();
        date.setBounds(510, 138, 150, 30);
        add(date);
        
        String[] courses={"B.Tech", "MBA", "Bsc", "Msc"};
        cbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(courses));
        
        String[] branch={"Computer Engineering", "Electronics", "Mechanical", "Civil"};
        cbbranch.setModel(new javax.swing.DefaultComboBoxModel<>(branch));
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        lblrollno = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        cbcourse = new javax.swing.JComboBox<>();
        lblsurname = new javax.swing.JLabel();
        lbldateofbirth = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblclassx = new javax.swing.JLabel();
        lblclassxp = new javax.swing.JLabel();
        tfclassxp = new javax.swing.JTextField();
        lblaadharno = new javax.swing.JLabel();
        lblbranch = new javax.swing.JLabel();
        tfsurname = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        tfclassx = new javax.swing.JTextField();
        tfaadharno = new javax.swing.JTextField();
        cbbranch = new javax.swing.JComboBox<>();
        lblrollnumber = new javax.swing.JLabel();
        btsubmit = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");

        lblname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblname.setText("Name");

        lblrollno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblrollno.setText("Roll No");

        lbladdress.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbladdress.setText("Address");

        lblemail.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblemail.setText("Email");

        lblcourse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblcourse.setText("Course");

        cbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblsurname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsurname.setText("Surname");

        lbldateofbirth.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbldateofbirth.setText("Date of Birth");

        lblphone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblphone.setText("Phone");

        lblclassx.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclassx.setText("Class X(%)");

        lblclassxp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclassxp.setText("Class ΧΠ(%)");

        lblaadharno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblaadharno.setText("Aadhar No");

        lblbranch.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblbranch.setText("Branch");

        tfphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfphoneActionPerformed(evt);
            }
        });

        tfclassx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfclassxActionPerformed(evt);
            }
        });

        cbbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblrollnumber.setText("1533"+first4);
        lblrollnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        btsubmit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsubmit.setText("Submit");
        btsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsubmitActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname)
                            .addComponent(lbladdress)
                            .addComponent(lblemail)
                            .addComponent(lblclassxp)
                            .addComponent(lblcourse)
                            .addComponent(lblrollno))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfname)
                            .addComponent(tfaddress)
                            .addComponent(tfemail)
                            .addComponent(cbcourse, 0, 202, Short.MAX_VALUE)
                            .addComponent(tfclassxp)
                            .addComponent(lblrollnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(lbldateofbirth)
                        .addGap(236, 236, 236))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsurname)
                                    .addComponent(lblclassx)
                                    .addComponent(lblphone)
                                    .addComponent(lblaadharno)
                                    .addComponent(lblbranch))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfsurname)
                            .addComponent(tfphone)
                            .addComponent(tfclassx)
                            .addComponent(tfaadharno)
                            .addComponent(cbbranch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrollno)
                            .addComponent(lbldateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrollnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbladdress)
                            .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemail)
                            .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblclassx)
                            .addComponent(tfclassx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblclassxp)
                            .addComponent(tfclassxp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblaadharno)
                            .addComponent(tfaadharno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblcourse))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblbranch)
                                    .addComponent(cbbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsubmit)
                    .addComponent(btcancel))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfphoneActionPerformed

    private void tfclassxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfclassxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfclassxActionPerformed

    private void btsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsubmitActionPerformed
        //submit button code
        String name= tfname.getText();
        String surname=tfsurname.getText();
        String rollno=lblrollnumber.getText();
        String d= ((JTextField)date.getDateEditor().getUiComponent()).getText(); //χρησιμοποιούμε τις μεθόδους και κάνουμε casting σε JTextField έτσι ώστε να πάρουμε αυτό που καταχωρήσαμε στην φόρμα
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        String classxp=tfclassxp.getText();
        String classx=tfclassx.getText();
        String aadharno=tfaadharno.getText();
        String course=(String) cbcourse.getSelectedItem();
        String branch= (String) cbbranch.getSelectedItem();
       
        try
        {
            String query="insert into student values('" + name + "', '"+surname+"', '"+rollno+"', '"+d+"', '"+address+"', '"+phone+"', '"+email+"', '"+classxp+"', '"+classx+"', '"+aadharno+"', '"+course+"', '"+branch+"')";
            
            Conn conn=new Conn();
            
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
            setVisible(false);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btsubmitActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        //cancel button code
        setVisible(false);
    }//GEN-LAST:event_btcancelActionPerformed

    //Main
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btsubmit;
    private javax.swing.JComboBox<String> cbbranch;
    private javax.swing.JComboBox<String> cbcourse;
    private javax.swing.JLabel lblaadharno;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblbranch;
    private javax.swing.JLabel lblclassx;
    private javax.swing.JLabel lblclassxp;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JLabel lbldateofbirth;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblrollno;
    private javax.swing.JLabel lblrollnumber;
    private javax.swing.JLabel lblsurname;
    private javax.swing.JTextField tfaadharno;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfclassx;
    private javax.swing.JTextField tfclassxp;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfphone;
    private javax.swing.JTextField tfsurname;
    // End of variables declaration//GEN-END:variables
}

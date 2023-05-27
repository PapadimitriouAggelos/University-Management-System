package university;

import com.toedter.calendar.JDateChooser;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddTeacher extends javax.swing.JFrame 
{
    JDateChooser date;
    
    Random ran=new Random(); //δημιουργώ ένα αντικείμενο της κλάσης Random
    long first4=Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    //constructor
    public AddTeacher() 
    {
        initComponents();
        
        setLocation(300, 200);
        
        //με τις 3 επόμενες εντολές δημιουργούμε ένα αντικείμενο date της κλάσης JDateChooser έτσι ώστε να 
        //δημιουργήσουμε ένα ημερολόγιο κάνω import το jar file jcalendar-tz και το προσθέτουμε στο παράθυρο
        date=new JDateChooser();
        date.setBounds(545, 115, 170, 30);
        add(date);
        
        String[] qualifications={"B.Tech", "MBA", "Bsc", "Msc"};
        cbqualification.setModel(new javax.swing.DefaultComboBoxModel<>(qualifications));
        
        String[] departments={"Computer Engineering", "Electronics", "Mechanical", "Civil"};
        cbdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(departments));
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        lblemployeeid = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblclassxp = new javax.swing.JLabel();
        lblqualification = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfclassxp = new javax.swing.JTextField();
        cbqualification = new javax.swing.JComboBox<>();
        lblsurname = new javax.swing.JLabel();
        lbldateofbirth = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblclassx = new javax.swing.JLabel();
        lblaadharno = new javax.swing.JLabel();
        tfsurname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        lbldepartment = new javax.swing.JLabel();
        tfphone = new javax.swing.JTextField();
        tfclassx = new javax.swing.JTextField();
        tfaadharno = new javax.swing.JTextField();
        cbdepartment = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblemployeenumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Teacher");

        lblname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblname.setText("Name");

        lblemployeeid.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblemployeeid.setText("Employee ID");

        lbladdress.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbladdress.setText("Address");

        lblclassxp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclassxp.setText("Class ΧΠ(%)");

        lblqualification.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblqualification.setText("Qualification");

        cbqualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblsurname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsurname.setText("Surname");

        lbldateofbirth.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbldateofbirth.setText("Date Of Birth");

        lblphone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblphone.setText("Phone");

        lblclassx.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclassx.setText("Class X(%)");

        lblaadharno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblaadharno.setText("Aadhar Number");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });

        lbldepartment.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbldepartment.setText("Department");

        cbdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblemployeenumber.setText("1533"+first4);
        lblemployeenumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(lbladdress)
                    .addComponent(lblclassxp)
                    .addComponent(lblqualification)
                    .addComponent(jLabel6)
                    .addComponent(lblemployeeid))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfname)
                    .addComponent(tfaddress)
                    .addComponent(tfclassxp)
                    .addComponent(cbqualification, 0, 199, Short.MAX_VALUE)
                    .addComponent(tfemail)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemployeenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbldateofbirth)
                                .addComponent(lblsurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblphone, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblclassx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfsurname)
                            .addComponent(tfphone)
                            .addComponent(tfclassx, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblaadharno)
                            .addComponent(lbldepartment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfaadharno)
                            .addComponent(cbdepartment, 0, 215, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsurname)
                    .addComponent(tfsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemployeeid)
                    .addComponent(lbldateofbirth)
                    .addComponent(lblemployeenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphone)
                    .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblclassx)
                    .addComponent(jLabel6)
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfclassx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblaadharno)
                            .addComponent(lblclassxp)
                            .addComponent(tfclassxp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfaadharno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(lblqualification))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbqualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldepartment)
                            .addComponent(cbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Cancel Button code
        setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Submit Button code
        String name= tfname.getText();
        String surname=tfsurname.getText();
        String employeeid=lblemployeenumber.getText();
        String d= ((JTextField)date.getDateEditor().getUiComponent()).getText(); //χρησιμοποιούμε τις μεθόδους και κάνουμε casting σε JTextField έτσι ώστε να πάρουμε αυτό που καταχωρήσαμε στην φόρμα
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        String classxp=tfclassxp.getText();
        String classx=tfclassx.getText();
        String aadharno=tfaadharno.getText();
        String qualification=(String) cbqualification.getSelectedItem();
        String department= (String) cbdepartment.getSelectedItem();
        
        try
        {
            String query="insert into teacher values('" + name + "', '"+surname+"', '"+employeeid+"', '"+d+"', '"+address+"', '"+phone+"', '"+email+"', '"+classx+"', '"+classxp+"', '"+aadharno+"', '"+qualification+"', '"+department+"')";
            
            Conn conn=new Conn();
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
            setVisible(false);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbdepartment;
    private javax.swing.JComboBox<String> cbqualification;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblaadharno;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblclassx;
    private javax.swing.JLabel lblclassxp;
    private javax.swing.JLabel lbldateofbirth;
    private javax.swing.JLabel lbldepartment;
    private javax.swing.JLabel lblemployeeid;
    private javax.swing.JLabel lblemployeenumber;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblqualification;
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

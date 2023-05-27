package university;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UpdateStudent extends javax.swing.JFrame 
{
    /*
    Διαφορά ComboBox με Choice
    Το ComboBox επιτρέπει στους χρήστες να επιλέξουν μια επιλογή από μια προκαθορισμένη λίστα επιλογών 
    ή να πληκτρολογήσουν μια άλλη τιμή εάν καμία από τις προκαθορισμένες επιλογές δεν ταιριάζει με αυτό που 
    θέλει να επιλέξει ο χρήστης. Το ChoiceBox επιτρέπει στους χρήστες να επιλέξουν μια επιλογή μόνο από μια 
    προκαθορισμένη λίστα επιλογών.
    */
    Choice crollno;

    //constructor
    public UpdateStudent()
    {
        initComponents();
        
        setLocation(300, 200);
        
        crollno=new Choice(); //δημιουργώ ένα αντικείμενο της κλάσης Choice
        crollno.setBounds(190, 45, 170, 20);
        add(crollno);
        
        /*
        Δημιουργώ ένα αντικείμενο con τύπου Conn και ζητάει από την βάση να μου δώσει τα πάντα από το table student
        Στην συνέχεια μέχρι να τελειώσουν οι εγγραφές από την βάση, γεμίζω το crollno με ότι περιέχεται στην στήλη rollno
        */
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from student");
            
            while(rs.next())
            {
                crollno.add(rs.getString("rollno"));
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            Conn c=new Conn();
            
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelsurname.setText(rs.getString("surname"));
                labelrollno.setText(rs.getString("rollno"));
                labeldateofbirth.setText(rs.getString("d"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelclassx.setText(rs.getString("classx"));
                labelclassxp.setText(rs.getString("classxp"));
                labelaadharno.setText(rs.getString("aadhar"));
                tfcourse.setText(rs.getString("course"));
                tfbranch.setText(rs.getString("branch"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try
                {
                    Conn c=new Conn();

                    String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
                    ResultSet rs=c.s.executeQuery(query);

                    while(rs.next())
                    {
                        labelname.setText(rs.getString("name"));
                        labelsurname.setText(rs.getString("surname"));
                        labelrollno.setText(rs.getString("rollno"));
                        labeldateofbirth.setText(rs.getString("d"));
                        tfaddress.setText(rs.getString("address"));
                        tfphone.setText(rs.getString("phone"));
                        tfemail.setText(rs.getString("email"));
                        labelclassx.setText(rs.getString("classx"));
                        labelclassxp.setText(rs.getString("classxp"));
                        labelaadharno.setText(rs.getString("aadhar"));
                        tfcourse.setText(rs.getString("course"));
                        tfbranch.setText(rs.getString("branch"));
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }

            
            }
        }
        );
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsearchrollnumber = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblrollno = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblclassxp = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        lblsurname = new javax.swing.JLabel();
        lbldateofbirth = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lblclassx = new javax.swing.JLabel();
        lblaadharno = new javax.swing.JLabel();
        lblbranch = new javax.swing.JLabel();
        tfaddress = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfcourse = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        tfbranch = new javax.swing.JTextField();
        btupdate = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        labelname = new javax.swing.JLabel();
        labelrollno = new javax.swing.JLabel();
        labelclassxp = new javax.swing.JLabel();
        labelsurname = new javax.swing.JLabel();
        labeldateofbirth = new javax.swing.JLabel();
        labelclassx = new javax.swing.JLabel();
        labelaadharno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Student");

        lblsearchrollnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsearchrollnumber.setText("Select Roll Number");

        lblname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblname.setText("Name");

        lblrollno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblrollno.setText("Roll No");

        lbladdress.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbladdress.setText("Address");

        lblemail.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblemail.setText("Email");

        lblclassxp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclassxp.setText("Class ΧΠ(%)");

        lblcourse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblcourse.setText("Course");

        lblsurname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsurname.setText("Surname");

        lbldateofbirth.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbldateofbirth.setText("Date of Birth");

        lblphone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblphone.setText("Phone");

        lblclassx.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblclassx.setText("Class X(%)");

        lblaadharno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblaadharno.setText("Aadhar No");

        lblbranch.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblbranch.setText("Branch");

        btupdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btupdate.setText("Update");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        labelname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        labelrollno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        labelclassxp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        labelsurname.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        labeldateofbirth.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        labelclassx.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        labelaadharno.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblsearchrollnumber)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(tfcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbladdress)
                                    .addComponent(lblname)
                                    .addComponent(lblrollno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelrollno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblemail)
                                    .addComponent(lblclassxp))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfemail, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(labelclassxp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblbranch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(tfbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblphone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelaadharno, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labeldateofbirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelsurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfphone, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(labelclassx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldateofbirth)
                            .addComponent(lblsurname)
                            .addComponent(lblclassx)
                            .addComponent(lblaadharno))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblsearchrollnumber)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(lblsurname)
                    .addComponent(labelname)
                    .addComponent(labelsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrollno)
                    .addComponent(lbldateofbirth)
                    .addComponent(labelrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphone)
                    .addComponent(tfphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblclassx)
                    .addComponent(labelclassx, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblclassxp)
                    .addComponent(lblaadharno)
                    .addComponent(labelclassxp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelaadharno, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcourse)
                    .addComponent(tfcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbranch)
                    .addComponent(tfbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btupdate)
                    .addComponent(btcancel))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // Cancel button code
        setVisible(false);
    }//GEN-LAST:event_btcancelActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // Update button code
        String rollno=labelrollno.getText();
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        String course=tfcourse.getText();
        String branch=tfbranch.getText();
        
        try
        {
            String query="update student set address='"+address+"', phone='"+phone+"', email='"+email+"', course='"+course+"', branch='"+branch+"' where rollno='"+rollno+"'";
            Conn con=new Conn();
            con.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Student Details inserted Successfully");
            setVisible(false);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btupdateActionPerformed

    //Main code
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btupdate;
    private javax.swing.JLabel labelaadharno;
    private javax.swing.JLabel labelclassx;
    private javax.swing.JLabel labelclassxp;
    private javax.swing.JLabel labeldateofbirth;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelrollno;
    private javax.swing.JLabel labelsurname;
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
    private javax.swing.JLabel lblsearchrollnumber;
    private javax.swing.JLabel lblsurname;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfbranch;
    private javax.swing.JTextField tfcourse;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfphone;
    // End of variables declaration//GEN-END:variables
}
